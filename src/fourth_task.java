import java.util.Scanner;
import java.util.regex.*;
import java.util.Map;
import java.util.HashMap;

public class fourth_task {

    public static void Count(String str) {
        try {
            String[] word = str.replaceAll("[,.-]", "").split("\\s");
            Map<String, Integer> counter = new HashMap<>();
            for (String i : word) {
                if (!i.isEmpty()) {
                    Integer count = counter.get(i);
                    if (count == null) {
                        count = 0;
                    }
                    counter.put(i, ++count);
                }
            }
            for (String j : counter.keySet()) {
                System.out.println("Слово " + j + " содержится " + counter.get(j) + " раза.");
            }
        }
        catch (PatternSyntaxException e){
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String str;
        System.out.println("Введите предложение: ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        Count(str);
    }
    }

