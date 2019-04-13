package org.pit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.pit.consumer.generated.UserEventStreamSink;
import org.pit.consumer.generated.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(UserEventStreamSink.class)
@SpringBootApplication
@Slf4j
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Value("${instance.name}") String instanceName;

}
