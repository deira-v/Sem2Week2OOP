package ie.atu.sem2week2;

import lombok.Setter;

public class Calculate {
    private int a;
    private int b;
    private String operation;

    public Calculate(int a, int b, String operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public Calculate(){
        this.a = 0;
        this.b = 0;
        this.operation = "";
    }

    public int getNum1() {
        return a;
    }

    public void setNum1(int a) {
        this.a = a;
    }

    public int getNum2() {
        return b;
    }

    public void setNum2(int b) {
        this.b = b;
    }

    //Addition
    public static int add(int a, int b) {
        return a + b;
    }

    //subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    //Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    //Division
    public static float divide(int a, int b) {
        return (float) a / b;
    }
}
