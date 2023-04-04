import java.util.*;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
// из этого списка.
public class Task2 {
    public static void main(String[] args) {
        List a = creatingRandomList();
        searchMaxMin(a);
        System.out.println(getArithmeticMean(a));
    }

    private static List<Integer> creatingRandomList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(10));
        }
        System.out.print("Исходный список => ");
        System.out.println(list);
        return list;
    }

    private static void searchMaxMin(List<Integer> list) {
        System.out.print("Максимальное число => ");
        System.out.println(Collections.max(list));
        System.out.print("Минимальное число => ");
        System.out.println(Collections.min(list));
    }

    private static double getArithmeticMean(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        return stats.getAverage();
    }
}
