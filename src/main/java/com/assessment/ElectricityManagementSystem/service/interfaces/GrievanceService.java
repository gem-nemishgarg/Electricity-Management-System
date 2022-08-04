package com.assessment.ElectricityManagementSystem.service.interfaces;

import com.assessment.ElectricityManagementSystem.model.GrievanceModel;

import java.util.Map;

public interface GrievanceService {
    public Map<String, Object> saveComplaint(GrievanceModel grievanceModel);
}
