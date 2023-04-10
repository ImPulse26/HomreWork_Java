import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
// иметь несколько телефонов.
public class Task1 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBookMap = new HashMap<>();
        addNumber("Борисов", 123, phoneBookMap);
        addNumber("Молоканов", 1234, phoneBookMap);
        addNumber("Полуцкая", 546585, phoneBookMap);
        addNumber("Борисов", 8956477, phoneBookMap);
        addNumber("Молоканов", 12356233, phoneBookMap);
        addNumber("Зайцев", 787897, phoneBookMap);
        printPhoneBook(phoneBookMap);
    }
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    public static void printPhoneBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
