package br.com.superhr.service;

import br.com.superhr.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {
    private List<ReadjustmentValidation> validates;

    public ReadjustmentService(List<ReadjustmentValidation> validates) {
        this.validates = validates;
    }

    public void adjustEmployeeSalary(Employee employee, BigDecimal increase) {
        this.validates.forEach(v -> v.validate(employee, increase));
        BigDecimal readjustedSalary = employee.getSalary().add(increase);
        employee.updateSalary(readjustedSalary);
    }
}
