package controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @RequestMapping(value = "/banking", method = RequestMethod.POST)
    public String receiveWebhook(@RequestBody String payload) {
        // Process the webhook payload here
        System.out.println("Received webhook payload: " + payload);
        return "Webhook received successfully!";
    }
}