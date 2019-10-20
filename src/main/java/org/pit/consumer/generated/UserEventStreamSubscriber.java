package org.pit.consumer.generated;

import org.pit.consumer.generated.model.User;
import org.pit.consumer.generated.model.UserDeleted;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;

public interface UserEventStreamSubscriber {
  default void userCreated(User user) {
    // not implemented
  }

  @StreamListener(target = UserEventStreamSink.INPUT, condition = "headers['type']=='userCreated'")
  default void userCreated(@Payload User user, Message message) {
    userCreated(user);
  }

  default void userUpdated(User user) {
    // not implemented
  }

  @StreamListener(target = UserEventStreamSink.INPUT, condition = "headers['type']=='userUpdated'")
  default void userUpdated(@Payload User user, Message message) {
    userUpdated(user);
  }

  default void userDeleted(UserDeleted userDeleted) {
    // not implemented
  }

  @StreamListener(target = UserEventStreamSink.INPUT, condition = "headers['type']=='userDeleted'")
  default void userDeleted(@Payload UserDeleted userDeleted, Message message) {
    userDeleted(userDeleted);
  }
}
