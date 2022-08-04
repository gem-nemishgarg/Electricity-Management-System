package com.assessment.ElectricityManagementSystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import com.assessment.ElectricityManagementSystem.model.GrievanceModel;
import com.assessment.ElectricityManagementSystem.service.interfaces.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GrievanceController {

    @Autowired
    GrievanceService grievanceService;

    @PostMapping("/registerComplaint")
    public ResponseEntity<?> registerComplaint(@RequestBody Map<String, String> payload) {
        GrievanceModel grievanceModel = new GrievanceModel();
        if (payload.get("grievance") != null) {
            grievanceModel.setGrievance(payload.get("grievance"));
        }
        return ResponseEntity.ok(this.grievanceService.saveComplaint(grievanceModel));
    }
}