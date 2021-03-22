package com.example.twilio.sms;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsWebhookHandler {

    @PostMapping("/")
    @ResponseBody
    public String handleSmsWebhook(){
        return "Hello from Twilio";
    }

}
