package br.com.superhr.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private String cpf;
    private Position position;
    private BigDecimal salary;
    private LocalDate lastSalaryAdjustmentDate;

    public Employee(String name, String cpf, Position position, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.position = position;
        this.salary = salary;
    }

    public void updateSalary(BigDecimal newSalary){
        this.salary = newSalary;
        this.lastSalaryAdjustmentDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getLastSalaryAdjustmentDate() {
        return lastSalaryAdjustmentDate;
    }

    public void setLastSalaryAdjustmentDate(LocalDate lastSalaryAdjustmentDate) {
        this.lastSalaryAdjustmentDate = lastSalaryAdjustmentDate;
    }

    public void promote(Position newPosition) {
        this.position = newPosition;
    }
}
