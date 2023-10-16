package seminar3.homework.task3;

/*
    Задание 3.
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений
    каждого из составляющих пары, а также переопределение метода toString(),
    возвращающее строковое представление пары.
 */
public class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getFirst(){
        return t1;
    }

    public T2 getSecond(){
        return t2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(t1);
        sb.append(", ");
        sb.append(t2);
        sb.append("]");
        sb.append("\n");
        return sb.toString();
    }
}
