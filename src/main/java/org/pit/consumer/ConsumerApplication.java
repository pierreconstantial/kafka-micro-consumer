package org.pit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.pit.consumer.model.PostMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import reactor.core.publisher.Flux;

@EnableBinding(Sink.class)
@SpringBootApplication
@Slf4j
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

    @Value("${instance.name}") String instanceName;

	@StreamListener
	public void receive(@Input(Sink.INPUT) Flux<Message<PostMessage>> input) {
		input.subscribe(s -> log.info(instanceName + ": " + s));
	}

}
