package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @RequestMapping(value = "/webhook", method = RequestMethod.POST)
    public String receiveWebhook(String payload) {
        // Process the webhook payload here
        return "Webhook received successfully!";
    }
}