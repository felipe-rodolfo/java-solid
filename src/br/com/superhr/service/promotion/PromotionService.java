package br.com.superhr.service.promotion;

import br.com.superhr.ValidationException;
import br.com.superhr.model.Employee;
import br.com.superhr.model.Position;

public class PromotionService {
    public void promote(Employee employee, boolean goalReached){
        Position currentPosition = employee.getPosition();
        if(Position.MANAGER == currentPosition){
            throw new ValidationException("Manager cannot be promoted");
        }

        if(goalReached){
            Position newPosition = currentPosition.getNextPosition();
            employee.promote(newPosition);
        } else {
            throw new ValidationException("Employee did not hit the target!");
        }
    }
}
