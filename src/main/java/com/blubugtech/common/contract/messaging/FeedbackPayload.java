package com.blubugtech.common.contract.messaging;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackPayload {
    private UUID feedbackId;
    private UUID userId;
    private String customerEmail;
    private String firstName;
    
    // Feedback or Review specific
    private String type; // GENERAL, PRODUCT_REVIEW
    private String ticketId;
    private String productName;
    private Integer rating;
    
    private LocalDateTime timestamp;
}
