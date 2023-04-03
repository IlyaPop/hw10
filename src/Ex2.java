import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите две угловые x- и y-координаты = ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x == y) {
            System.out.println("Прямоугольник является квадратом");
        } else if (x > y) {
            System.out.println("Прямоугольник является \"альбомной\" ориентацией");
        } else {
            System.out.println("Прямоугольник является \"книжной\" ориентацией");
        }
    }
}

