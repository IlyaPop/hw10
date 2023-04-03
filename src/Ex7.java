import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 3;
        int t = 60;
        System.out.print("Введите массу: ");
        double m = input.nextDouble();
        double v = Math.sqrt(t*r/m);
        if (v < 1) {
            System.out.println("Веревка не будет вращаться");
        } else if (v >= 1 && v < 10) {
            System.out.println("Наибольшая скорость веревки = 1");
        } else if (v >= 10 && v < 20) {
            System.out.println("Наибольшая скорость веревки = 10");
        } else if (v >= 20 && v < 40) {
            System.out.println("Наибольшая скорость веревки = 20");
        } else if (v >= 40) {
            System.out.println("Наибольшая скорость веревки = 40");
        }
    }
}
