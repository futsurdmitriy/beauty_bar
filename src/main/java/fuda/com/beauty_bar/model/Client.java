/*
 * Class name :  Client
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 17-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Client {

    @Id
    private String id;
    private String firstName;
    private String middleName;
    private String secondName;
    private String gender;
    private boolean isRegular;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Client(){};

    public Client(String id, String firstName, String middleName,
                  String secondName, String gender, boolean isRegular,
                  LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.gender = gender;
        this.isRegular = isRegular;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Client(String firstName, String middleName,
                  String secondName, String gender, boolean isRegular,
                  LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.gender = gender;
        this.isRegular = isRegular;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
