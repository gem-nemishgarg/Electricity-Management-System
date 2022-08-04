package com.assessment.ElectricityManagementSystem.dao;

import com.assessment.ElectricityManagementSystem.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserModel,Long> {
}