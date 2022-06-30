/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquiteturacalculadora.demo.service;

import arquiteturacalculadora.demo.dtos.OperationDto;
import arquiteturacalculadora.demo.dtos.ResultDto;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shen
 */

@Service
public class CalculatorService {
    
    public ResultDto calculate(OperationDto params) throws Exception {
        ResultDto resultDto = new ResultDto();
        
        switch(params.operation) {
            case 1:
                resultDto.result = params.first_number+params.second_number;
                break;
            case 2: 
                resultDto.result = params.first_number-params.second_number;
                break;
            case 3: 
                resultDto.result = params.first_number*params.second_number;
                break;
            case 4: 
                if(params.first_number < params.second_number) {
                    throw new Exception("Impossível de realizar o calculo");
                } else {
                    resultDto.result = params.first_number/params.second_number;
                }
                break;
                
            default:
                throw new Exception("Operação inválida");
        } 
        return resultDto;
    }
}
