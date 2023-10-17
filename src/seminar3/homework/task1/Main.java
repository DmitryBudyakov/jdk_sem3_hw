package seminar3.homework.task1;

/*
    Задание 1
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    Параметры этих методов – два числа разного типа (но необязательно разного между собой),
    над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Сложение:");
        int num1 = 10;
        int num2 = 20;
//        int num1 = Integer.MAX_VALUE;
//        int num2 = 1;
//        double num2 = 5.5;
        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(Calculator.sum(num1, num2));

        System.out.println("Умножение:");
        int num3 = 500;
//        double num4 = 1000;
        int num4 = 1000;
        System.out.print(num3 + " x " + num4 + " = ");
        System.out.println(Calculator.multiply(num3, num4));

        System.out.println("Деление:");
//        float num5 = 100f;
        int num5 = 100;
        int num6 = 10;
//        int num6 = 0;
        System.out.print(num5 + " : " + num6 + " = ");
        System.out.println(Calculator.divide(num5, num6));

        System.out.println("Вычитание:");
        int num7 = 100;
        int num8 = 10;
//        int num7 = Integer.MIN_VALUE;
//        int num8 = 1;
        System.out.print(num7 + " - " + num8 + " = ");
        System.out.println(Calculator.subtract(num7, num8));
    }
}
