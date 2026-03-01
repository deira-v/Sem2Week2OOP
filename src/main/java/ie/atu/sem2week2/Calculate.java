package ie.atu.sem2week2;

public class Calculate {
    private int a;
    private int b;

    public Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Calculate(){
        this.a = 0;
        this.b = 0;
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
    public static int add(Integer a, Integer b)
    {
        return a + b;
    }
}
