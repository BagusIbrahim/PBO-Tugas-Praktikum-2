package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculation {
    private char operation;
    private double operand1;
    private double operand2;
    private Map<Character, Operation> operationMap = new HashMap<>();


    public Calculation(double operand1, double operand2, char operation){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiple());
        operationMap.put('/', new Deviden());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
            System.out.println(operationMap.get(operation));
        }else {
            System.out.println("Invalid Sign");
        }        return operationMapValue.calculateResult(operand1, operand2);
    }
}