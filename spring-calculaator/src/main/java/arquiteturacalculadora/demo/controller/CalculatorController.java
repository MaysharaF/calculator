/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquiteturacalculadora.demo.controller;

import arquiteturacalculadora.demo.dtos.OperationDto;
import arquiteturacalculadora.demo.dtos.ResultDto;
import arquiteturacalculadora.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Shen
 */
@RestController
@RequestMapping(value = "/calculate")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @PostMapping()
    public ResultDto create(@RequestBody OperationDto params) {
        try {
            return calculatorService.calculate(params);
        } catch (Exception e) {
            System.out.println(e);
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, e.getMessage(), e);
        }
    }
}
