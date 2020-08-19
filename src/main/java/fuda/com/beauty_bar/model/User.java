/*
 * Class name :  User
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 19-Aug-2020
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
public class User {
    @Id
    private String id;
    private String userName;
    private boolean isAdmin;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {}

    public User(String id, String userName, boolean isAdmin, String password,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userName = userName;
        this.isAdmin = isAdmin;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User(String userName, boolean isAdmin, String password,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userName = userName;
        this.isAdmin = isAdmin;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
