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
        double num2 = 5.5;
        System.out.print(num1 + " + " + num2 + " = ");
        Calculator.sum(num1, num2);

        System.out.println("Умножение:");
        int num3 = 500;
        double num4 = 1000;
        System.out.print(num3 + " x " + num4 + " = ");
        Calculator.multiply(num3, num4);

        System.out.println("Деление:");
        float num5 = 100f;
        int num6 = 10;
//        int num6 = 0;
        System.out.print(num5 + " : " + num6 + " = ");
        Calculator.divide(num5, num6);

        System.out.println("Вычитание:");
        double num7 = 100;
        int num8 = 10;
        System.out.print(num7 + " - " + num8 + " = ");
        Calculator.subtract(num7, num8);
    }
}
