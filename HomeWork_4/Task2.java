//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int lengthLL = 5;
        for (int i = 0; i < lengthLL; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);
        System.out.print("[");

        for (int i = 0; i < lengthLL - 1; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();
        }
        System.out.print(ll.getLast() + "]");
    }

    public static int getRandomNumber() {
        double x = Math.random() * 100;
        return (int) x;
    }
}
