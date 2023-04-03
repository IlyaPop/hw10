import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты x и y = ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.print("Введите радиус окружности = ");
        double radius = input.nextDouble();
        if (x*x + y*y > radius*radius) {
            System.out.println("Точка лежит вне нашего круга");
        } else if (x*x + y*y < radius*radius) {
            System.out.println("Точка лежит в нашем круге");
        } else {
            System.out.println("Точка лежит на окружности");
        }
    }
}