/*
 * Class name :  Mail
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 20-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Mail {
    private String to;
    private String subject;
    private String text;

    public Mail(String to, String subject, String text) {
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
