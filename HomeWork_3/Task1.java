import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)
public class Task1 {
    public static void main(String[] args) {
        removingEvenDigits(randomListDigits());
    }

    private static List<Integer> randomListDigits() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.print("Исходный список => ");
        System.out.println(list);

        return list;
    }
    private static void removingEvenDigits(List<Integer> list) {
        list.removeIf(e -> (e % 2) == 0);
        System.out.print("Нечетный список => ");
        System.out.println(list);
    }
}
