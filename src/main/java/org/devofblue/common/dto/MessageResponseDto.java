package org.devofblue.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponseDto {
    private String message;
    private LocalDateTime timestamp;

    public MessageResponseDto(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
