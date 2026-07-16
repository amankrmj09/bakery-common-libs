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
public class UserPayload {
    private UUID userId;
    private String email;
    private String firstName;
    private String lastName;
    private String action; // REGISTERED, UPDATED, DELETED
    private LocalDateTime timestamp;
}
