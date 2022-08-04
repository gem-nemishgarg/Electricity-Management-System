package com.assessment.ElectricityManagementSystem.service.implementation;

import com.assessment.ElectricityManagementSystem.model.UserModel;
import com.assessment.ElectricityManagementSystem.dao.UserDAO;
import com.assessment.ElectricityManagementSystem.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public UserModel createUser(UserModel userModel) {
        UserModel userModel1 = this.userDAO.save(userModel);
        return userModel1;
    }
}
