package com.assessment.ElectricityManagementSystem.model;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long consumerId;

    String userName;
    String address;
    String city;
}
