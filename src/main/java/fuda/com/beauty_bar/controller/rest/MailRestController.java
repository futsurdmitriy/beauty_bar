/*
 * Class name :  MailRestController
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 20-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.controller.rest;

import fuda.com.beauty_bar.service.mailer.impls.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/mail")
@RestController
public class MailRestController {

    @Autowired
    public EmailServiceImpl emailService;

    @CrossOrigin
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    String sendMail(@RequestBody() String to,
                    @RequestBody String subject,
                    @RequestBody String text){
        return "ssss";
//        return emailService
//                .sendSimpleMessage(to,
//                        subject, text);
    }


}
