package com.blubugtech.common.feign;

import feign.Response;
import feign.codec.ErrorDecoder;
import com.blubugtech.common.exception.FeignClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FeignErrorDecoder implements ErrorDecoder {

    private static final Logger logger = LoggerFactory.getLogger(FeignErrorDecoder.class);
    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        int status = response.status();
        
        if (status >= 400 && status <= 499) {
            String message = "Client error from downstream service";
            try {
                if (response.body() != null) {
                    try (InputStream bodyIs = response.body().asInputStream()) {
                        message = StreamUtils.copyToString(bodyIs, StandardCharsets.UTF_8);
                    }
                }
            } catch (IOException e) {
                logger.error("Failed to read the Feign error response body", e);
            }
            logger.error("Downstream client error ({}): {}", status, message);
            return new FeignClientException(message, HttpStatus.valueOf(status));
        }

        // Delegate to default decoder for 5xx errors (will throw FeignException which triggers Fallback/CircuitBreaker)
        return defaultErrorDecoder.decode(methodKey, response);
    }
}
