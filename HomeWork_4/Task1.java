//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;
        System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);
        scanner.close();
        System.out.println(inputLinkedList.toString());
    }
}
