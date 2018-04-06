import Calculator;
public class Runner {
    Calculator calculator = new Calculator();
    double firstNumber;
    double secondNumber;

    public void takeUserInput(){
        System.out.println("please insert your first number");
        try{
            firstNumber = calculator.myScanner.nextDouble();
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("please insert your second number");
        try{
            secondNumber = calculator.myScanner.nextDouble();
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        Runner runner = new Runner();
        System.out.println("What mathematics operation do you want to perform?");
        runner.calculator.setOperation(runner.calculator.myScanner.next());
        switch (runner.calculator.getOperation()){
            case  "addition":
                runner.takeUserInput();
                System.out.println("Result: "+runner.calculator.add(runner.firstNumber, runner.secondNumber));
                break;
            case "subtraction":
                runner.takeUserInput();
                System.out.println("Result: "+runner.calculator.subtract(runner.firstNumber, runner.secondNumber));
                break;
            case "multiplication":
                runner.takeUserInput();
                System.out.println("Result: "+runner.calculator.multiply(runner.firstNumber, runner.secondNumber));
                break;
            case "division":
                runner.takeUserInput();
                System.out.println("Result: "+runner.calculator.divide(runner.firstNumber, runner.secondNumber));
                break;
            default:
                System.out.println("unknown operation, please try again");
        }

    }
}
