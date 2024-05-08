package PerScholas;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        int sum = 0;
        n = 1000;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}