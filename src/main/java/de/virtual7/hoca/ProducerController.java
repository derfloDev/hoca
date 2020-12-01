package de.virtual7.hoca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    KafkaProducer producer;

    @GetMapping(value = "/create")
    public String createMessage() {
        String message = "test";
        producer.send("admintome-test", message);
        return "Voll toll";
    }
}
