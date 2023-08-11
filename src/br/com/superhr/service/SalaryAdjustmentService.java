package br.com.superhr.service;

import br.com.superhr.ValidationException;
import br.com.superhr.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class SalaryAdjustmentService {
    public void adjustEmployeeSalary(Employee employee, BigDecimal salaryIncrease){
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal adjustmentPercentage = salaryIncrease.divide(currentSalary, RoundingMode.HALF_UP);
        if (adjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Salary increase cannot exceed 40% of the current salary!");
        }
        BigDecimal salaryAdjusted = currentSalary.add(salaryIncrease);
        employee.updateSalary(salaryAdjusted);
    }
}
