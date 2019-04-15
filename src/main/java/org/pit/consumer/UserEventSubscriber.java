package org.pit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.pit.consumer.generated.UserEventStreamSubscriber;
import org.pit.consumer.generated.model.User;
import org.pit.consumer.generated.model.UserDeleted;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class UserEventSubscriber implements UserEventStreamSubscriber {

    @Override
    public void userCreated(User user, Message message) {
        log.info("UserCreated: " + user);
        // log.info("UserCreated Message: " + message);
    }

    @Override
    public void userUpdated(User user, Message message) {
        log.info("UserUpdated: " + user);
        // log.info("UserUpdated Message: " + message);
    }

    @Override
    public void userDeleted(UserDeleted user, Message message) {
        log.info("UserDeleted: " + user);
        // log.info("UserDeleted Message: " + message);
    }
}

