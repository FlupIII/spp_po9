import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EquilateralTriangle triangle = new EquilateralTriangle(5.0);
        System.out.println("Длина сторон: " + triangle.getSideLength()) ;
        System.out.println(triangle);
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println("Существует такой треугольник: " + triangle.isTriangle() + "\n");

        EquilateralTriangle triangle2 = new EquilateralTriangle(7.0);
        System.out.println("Длина сторон: " + triangle2.getSideLength());
        System.out.println(triangle2);
        System.out.println("Площадь: " + triangle2.calculateArea());
        System.out.println("Периметр: " + triangle2.calculatePerimeter());
        System.out.println("Существует такой треугольник: " + triangle2.isTriangle());

        System.out.println("\nТреугольники равны: " + triangle.equals(triangle2));
    }
}