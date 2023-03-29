//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task1 {
    public static void main(String[] args) {
        minElArr();
        System.out.println();
        maxElArr();
    }

    public static void minElArr() {
        int[] arr = new int[]{1, 5, 6, 10, 18, 3, 20, 9};
        int minEl = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minEl > arr[i]) {
                minEl = arr[i];
            }
        }
        System.out.printf("Минимальное значение массива => %d", minEl);
    }

    public static void maxElArr() {
        int[] arr = new int[]{1, 5, 6, 10, 18, 3, 20, 9};
        int maxEl = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxEl < arr[i]) {
                maxEl = arr[i];
            }
        }
        System.out.printf("Максимальное значение массива => %d", maxEl);
    }
}
