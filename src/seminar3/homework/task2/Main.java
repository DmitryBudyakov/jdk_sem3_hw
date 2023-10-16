package seminar3.homework.task2;

import java.util.Arrays;

/*
    Задание 2.
    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае.
    Массивы могут быть любого типа данных, но должны иметь одинаковую длину
    и содержать элементы одного типа.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Массив array1: ");
        String[] array1 = new String[]{"1", "2", "3"};
        System.out.println(Arrays.toString(array1));
        System.out.print("Массив array2: ");
        String[] array2 = new String[]{"1", "2", "3"};
        System.out.println(Arrays.toString(array2));
        System.out.print("Результат сравнения: ");
        System.out.println(compareArrays(array1, array2));
        System.out.println();


        System.out.print("Массив array3: ");
        Integer[] array3 = new Integer[]{1, 2, 3};
        System.out.println(Arrays.toString(array3));
        System.out.print("Массив array4: ");
        Integer[] array4 = new Integer[]{10, 20, 30};
        System.out.println(Arrays.toString(array4));
        System.out.print("Результат сравнения: ");
        System.out.println(compareArrays(array3, array4));
        System.out.println();

        System.out.print("Массив array5: ");
        Integer[] array5 = new Integer[]{10, 20, 30};
        System.out.println(Arrays.toString(array5));
        System.out.print("Массив array6: ");
        Double[] array6 = new Double[]{10.0, 20.0, 30.0};
        System.out.println(Arrays.toString(array6));
        System.out.print("Результат сравнения: ");
        System.out.println(compareArrays(array5, array6));
        System.out.println();

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Массивы должны иметь одинаковую длину");
            return false;
        }
        if (array1.getClass().getName() != array2.getClass().getName()) {
            System.out.println("Массивы должны иметь один тип данных");
//            System.out.println("array1: " + array1.getClass().getName());
//            System.out.println("array2: " + array2.getClass().getName());
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }
}

