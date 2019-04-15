package org.pit.consumer.generated;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserEventStreamSink {

    String INPUT = "user-service-test";

    @Input(UserEventStreamSink.INPUT)
    SubscribableChannel input();
}
