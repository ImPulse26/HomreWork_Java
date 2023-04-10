import java.io.*;
import java.nio.charset.StandardCharsets;

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.

public class Task2 {
    public static void main(String[] args) throws IOException {
        String str = "TESTx";
        writingLineToFile(creatingRepetitions(str));
    }

    public static String creatingRepetitions(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(str);
        }
        String transformation = sb.toString();
        return transformation;
    }

    public static void writingLineToFile(String str) throws IOException {
        {
            File file = new File("Task_2.txt");
            try (PrintWriter pw = new PrintWriter(file, StandardCharsets.UTF_8)) {
                pw.print(str);
                System.out.println("Данные успешно записаны в файл");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

