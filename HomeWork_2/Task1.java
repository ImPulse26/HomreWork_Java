//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка
//        палиндромом (возвращает boolean значение).

public class Task1 {
    public static void main(String[] args) {
        String str = "asdfdsa";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt((s.length()) - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromSecondWay(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}

