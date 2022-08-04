package com.assessment.ElectricityManagementSystem.service.implementation;

import com.assessment.ElectricityManagementSystem.model.GrievanceModel;
import com.assessment.ElectricityManagementSystem.dao.GrievanceDAO;
import com.assessment.ElectricityManagementSystem.service.interfaces.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GrievanceServiceImplementation implements GrievanceService {

    @Autowired
    GrievanceDAO grievanceDAO;

    @Override
    public Map<String, Object> saveComplaint(GrievanceModel grievanceModel) {
        Map<String, Object> hashMap = new HashMap();
        try {
            GrievanceModel grievanceModel1 = this.grievanceDAO.save(grievanceModel);
            hashMap.put("Status", "Success");
            hashMap.put("Response", grievanceModel1);
        } catch (Exception exception) {
            hashMap.put("Status", "Failed");
        }
        return hashMap;
    }
}
