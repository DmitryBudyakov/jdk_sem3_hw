package seminar3.homework.task3;
/*
    Задание 3.
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений
    каждого из составляющих пары, а также переопределение метода toString(),
    возвращающее строковое представление пары.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Pair 1 (String, Integer):");
        Pair<String,Integer> pair1 = new Pair<>("Привет!", 500);
        System.out.println(pair1.toString());

        System.out.println("Pair 2 (Integer, Double):");
        Pair<Integer,Double> pair2 = new Pair<>(100, 18.2);
        System.out.println(pair2.toString());

        System.out.println("Pair 3 (Character, String):");
        Pair<Character,String> pair3 = new Pair<>('s', "Строка текста");
        System.out.println(pair3.toString());


    }
}
