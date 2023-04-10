import java.util.*;

//3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
public class Task3 {
    public static void main(String[] args) {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        System.out.print("Исходный список => ");
        for (int i = 0; i < 20; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }else{
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append((list.get(list.size() - 1) + ": ")).append(count).append(".");
        System.out.print("Список с количеством повторений => ");
        System.out.println(sb);

        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.print("Список без дублей => ");
        System.out.println(listWithoutDuplicates);
    }
}
