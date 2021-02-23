package com.example.osbackend.models;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity(name = "User")
@Table (name = "user", uniqueConstraints = {
        @UniqueConstraint(name="user_email_unique", columnNames = "u_email"),
        @UniqueConstraint(name="user_tel_unique", columnNames ="u_tel")
})
public class User {

    public User(String firstName, String lastName, Date birthDate, String email, String tel, String type, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.tel = tel;
        this.type = type;
        this.password = password;
    }

    @Id
    @Column(name= "u_id")
    private UUID id;
    @Column(name= "u_firstname", nullable= false)
    private String firstName;
    @Column(name= "u_lastname", nullable= false)
    private String lastName;
    @Column(name= "u_birthdate", nullable= false)
    private Date birthDate;
    @Column(name= "u_email", nullable= false)
    private String email;
    @Column(name= "u_tel")
    private String tel;
    @Column(name= "u_type", nullable = false)
    private String type;
    @CreatedDate
    @Column(name= "u_created_at")
    private Instant createdAt;
    @LastModifiedDate
    @Column(name= "u_updated_at")
    private Instant updatedAt;
    @Column(name= "u_password", nullable = false)
    private String password;

    public User() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
