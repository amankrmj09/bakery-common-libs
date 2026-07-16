package com.blubugtech.common.event;

import com.blubugtech.common.contract.messaging.UserPayload;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserEvent extends BaseEvent<UserPayload> {
}
