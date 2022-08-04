package com.assessment.ElectricityManagementSystem.service.implementation;

import com.assessment.ElectricityManagementSystem.model.UserModel;
import com.assessment.ElectricityManagementSystem.dao.UserDAO;
import org.springframework.stereotype.Service;
import com.assessment.ElectricityManagementSystem.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public UserModel createUser(UserModel userModel) {
        UserModel createUserModel = this.userDAO.save(userModel);
        return createUserModel;
    }
}
