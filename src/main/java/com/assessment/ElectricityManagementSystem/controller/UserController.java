package com.assessment.ElectricityManagementSystem.controller;

import com.assessment.ElectricityManagementSystem.model.UserModel;
import com.assessment.ElectricityManagementSystem.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserModel> addUser(@RequestBody UserModel userModel) {
        UserModel createUserModel = this.userService.createUser(userModel);
        return new ResponseEntity<>(userModel, HttpStatus.OK);
    }
}
