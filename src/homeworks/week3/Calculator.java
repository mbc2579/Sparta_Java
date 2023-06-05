package homeworks.week3;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;

        answer = operation.operate(firstNumber, secondNumber);

//        if(operator.equals("+")) {
//            // 더하기
//            answer = addOperation.operate(firstNumber, secondNumber);
//        } else if(operator.equals("-")) {
//            // 뺴기
//            answer = substractOperation.operate(firstNumber, secondNumber);
//        } else if(operator.equals("*")) {
//            // 곱하기
//            answer = multiplyOperation.operate(firstNumber, secondNumber);
//        } else if(operator.equals("/")) {
//            // 나누기
//            answer = divideOperation.operate(firstNumber, secondNumber);
//        } else if (operator.equals("%")) {
//            answer = firstNumber % secondNumber;
//        }
        return answer;
    }
}
