package com.assessment.ElectricityManagementSystem.controller;

import com.assessment.ElectricityManagementSystem.service.interfaces.BillCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/calculateBill")
public class BillCalculatorController {
    @Autowired
    BillCalculatorService billCalculatorService;

    @GetMapping("/{units}")
    public ResponseEntity calculateBill(@PathVariable("units") Integer units) {
        Double billAmount = billCalculatorService.calculateBill(units);
        return new ResponseEntity(billAmount, HttpStatus.OK);
    }
}
