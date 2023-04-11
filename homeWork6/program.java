package homeWork6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
public class program {
    public static void main(String[] args) {
        noteBook nb1 = new noteBook("XPS15", 1236, "Dell");
        nb1.setColor("black");
        nb1.setSSD(700);
        nb1.setOS("windows");
        nb1.setRAM(8);

        noteBook nb2 = new noteBook("Nitro5", 21234, "Acer");
        nb2.setColor("red");
        nb2.setSSD(1000);
        nb2.setOS("windows");
        nb2.setRAM(16);

        noteBook nb3 = new noteBook("IdeaPad115", 76543, "Lenovo");
        nb3.setColor("black");
        nb3.setSSD(512);
        nb3.setOS("windows");
        nb3.setRAM(8);

        noteBook nb4 = new noteBook("Victus16", 67898, "hp");
        nb4.setColor("silver");
        nb4.setSSD(512);
        nb4.setOS("linux");
        nb4.setRAM(16);

        noteBook nb5 = new noteBook("Air3", 12345, "Apple");
        nb5.setColor("silver");
        nb5.setSSD(256);
        nb5.setOS("macOS");
        nb5.setRAM(8);

        HashSet<noteBook> noteBooks = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5));
        HashSet<noteBook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию поиска:\n 1 - ОЗУ \n 2 - Объем SSD \n 3 - Операционная система \n 4 - Цвет \n Введите 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем SSD");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("SSD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию поиска:\n 1 - ОЗУ \n 2 - Объем SSD \n 3 - Операционная система \n 4 - Цвет \n Введите 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = noteBooks.iterator();
                while (it.hasNext()) {
                    noteBook nb = (noteBook) it.next();
                    if (nb.getRAM() >= (Integer) entry.getValue()) {
                        res.add(nb);
                    }
                }
            }
            if (entry.getKey().equals("SSD")) {
                Iterator it = noteBooks.iterator();
                while (it.hasNext()) {
                    noteBook nb = (noteBook) it.next();
                    if (nb.getSSD() >= (Integer) entry.getValue()) {
                        res.add(nb);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = noteBooks.iterator();
                while (it.hasNext()) {
                    noteBook nb = (noteBook) it.next();
                    if (nb.getOS().equals(entry.getValue())) {
                        res.add(nb);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = noteBooks.iterator();
                while (it.hasNext()) {
                    noteBook nb = (noteBook) it.next();
                    if (nb.getColor().equals(entry.getValue())) {
                        res.add(nb);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            noteBook nb = (noteBook) it.next();
            System.out.println(nb.toString());
            System.out.println();
        }
    }
}
