package com.bridgelabz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.context.annotation.Primary;

@Entity
@Data

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String name;
    String email;
    int mobileNumber;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Customer(int customerId, String name, String email, int mobileNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public Customer() {
    }
}
