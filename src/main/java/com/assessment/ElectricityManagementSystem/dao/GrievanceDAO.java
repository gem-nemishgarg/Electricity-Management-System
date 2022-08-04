package com.assessment.ElectricityManagementSystem.dao;

import com.assessment.ElectricityManagementSystem.model.GrievanceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrievanceDAO extends JpaRepository<GrievanceModel,Long> {
}
