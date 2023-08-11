package br.com.superhr.service;

import br.com.superhr.model.Employee;

import java.math.BigDecimal;

public interface ReadjustmentValidation {
    void validate(Employee employee, BigDecimal increase);
}
