package com.assessment.ElectricityManagementSystem.controller;

import com.assessment.ElectricityManagementSystem.model.UserModel;
import com.assessment.ElectricityManagementSystem.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel userModel) {
        UserModel createUserModel = this.userService.createUser(userModel);
        return new ResponseEntity<>(userModel, HttpStatus.OK);
    }
}
