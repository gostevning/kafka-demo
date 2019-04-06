package no.stevning;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Scheduler {

    private Producer producer;

    public Scheduler(Producer producer) {
        this.producer = producer;
    }

    @Scheduled(fixedRate = 5000)
    public void produce() {
        producer.sendMessage(UUID.randomUUID().toString());
    }
}
