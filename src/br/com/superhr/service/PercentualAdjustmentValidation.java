package br.com.superhr.service;

import br.com.superhr.ValidationException;
import br.com.superhr.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentualAdjustmentValidation implements ReadjustmentService {
    public void validate(Employee employee, BigDecimal increase){
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal adjustmentPercentage = increase.divide(currentSalary, RoundingMode.HALF_UP);
        if (adjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Salary increase cannot exceed 40% of the current salary!");
        }
    }
}
