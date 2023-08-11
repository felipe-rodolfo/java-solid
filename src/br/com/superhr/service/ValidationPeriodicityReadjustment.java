package br.com.superhr.service;

import br.com.superhr.ValidationException;
import br.com.superhr.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationPeriodicityReadjustment implements ReadjustmentService {
    public void validate(Employee employee, BigDecimal salaryIncrease) {
        LocalDate lastAdjustedDate = employee.getLastSalaryAdjustmentDate();
        LocalDate currentDate = LocalDate.now();
        long monthsSinceLastAdjustment = ChronoUnit.MONTHS.between(lastAdjustedDate, currentDate);
        if (monthsSinceLastAdjustment < 6){
            throw new ValidationException("interval between readjustments must be at least 6 months");
        }
    }
}
