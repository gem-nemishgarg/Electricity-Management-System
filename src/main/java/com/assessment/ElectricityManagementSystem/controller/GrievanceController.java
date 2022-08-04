package com.assessment.ElectricityManagementSystem.controller;

import com.assessment.ElectricityManagementSystem.model.GrievanceModel;
import com.assessment.ElectricityManagementSystem.service.interfaces.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GrievanceController {

    @Autowired
    GrievanceService grievanceService;

    @PostMapping("/complaint")
    public ResponseEntity<?> grievanceApi(@RequestBody Map<String, String> requestPayload) {
        GrievanceModel grievanceModel = new GrievanceModel();
        if (requestPayload.get("grievance") != null) {
            grievanceModel.setGrievance(requestPayload.get("grievance"));
        }

        return ResponseEntity.ok(this.grievanceService.saveComplaint(grievanceModel));
    }
}