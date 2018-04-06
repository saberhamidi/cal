import java.util.Scanner;

public class Calculator {

    private String operation;
    Scanner myScanner = new Scanner(System.in);
    public double add(double firstNum, double secondNum){
        return firstNum+secondNum;
    }

    public double subtract (double firstNum, double secondNum){
        return  firstNum - secondNum;
    }

    public double multiply(double firstNum, double secondNum){
        return  firstNum * secondNum;
    }

    public double divide(double firstNum, double secondNum){
        return  firstNum / secondNum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}