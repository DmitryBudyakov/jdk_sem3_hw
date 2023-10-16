package seminar3.homework.task1;

/*
    Задание 1
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    Параметры этих методов – два числа разного типа (но необязательно разного между собой),
    над которыми должна быть произведена операция.
 */
public class Calculator {

    public static <N1 extends Number, N2 extends Number> void sum(N1 n1, N2 n2) {
        System.out.println(((Number) n1).doubleValue() + ((Number) n2).doubleValue());
    }

    public static <N1 extends Number, N2 extends Number> void multiply(N1 n1, N2 n2) {
        System.out.println(((Number) n1).doubleValue() * ((Number)n2).doubleValue());
    }

    public static <N1 extends Number, N2 extends Number> void divide(N1 n1, N2 n2) {
        if (((Number)n2).doubleValue() == 0){
            System.out.println("Делитель не может быть равен 0");
            return;
        }
        System.out.println(((Number) n1).doubleValue() / ((Number)n2).doubleValue());
    }

    public static <N1 extends Number, N2 extends Number> void subtract(N1 n1, N2 n2) {
        System.out.println(((Number) n1).doubleValue() - ((Number)n2).doubleValue());
    }


}