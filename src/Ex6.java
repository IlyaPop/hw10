import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите скорость вращения = ");
        int m = 2;
        int r = 3;
        int v = input.nextInt();
        double t = m*Math.pow(v,2)/r;
        if (t > 60) {
            System.out.println("Веревка порвалась");
        } else {
            System.out.println("Веревка не порвалась");
        }
    }
}
