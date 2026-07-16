package com.blubugtech.common.event;

import com.blubugtech.common.contract.messaging.PaymentRequestedPayload;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class PaymentRequestedEvent extends BaseEvent<PaymentRequestedPayload> {
}
