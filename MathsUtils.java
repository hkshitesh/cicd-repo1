package mypkg;

public class MathUtils {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = multiply(num1, num2);
        System.out.println("The result of multiplication is: " + result);
    }
}

