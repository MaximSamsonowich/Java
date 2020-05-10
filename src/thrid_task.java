import java.util.Arrays;
import java.util.Scanner;

public class thrid_task {

    public static void WordsInSent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        int count = 0;
        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов.");
    }

    public static void Sort() {
        System.out.print("Заполните строку через пробелы: ");
        String line = new Scanner(System.in).nextLine();
        String[] words = line.split("\\s+");
        Arrays.sort(words);
        System.out.println("Сортированная строка: " + Arrays.toString(words));

    }

    public static void HighFirstLetter(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        str = new String(chars);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие, которое будет выполнено над строкой:");
        System.out.println("1.Подсчитать кол-во слов в предложении.");
        System.out.println("2.Сделать первую букву каждого слова заглавной.");
        int choose = scan.nextInt();
        switch (choose) {
            case 1: {
                WordsInSent();
                break;
            }
            case 2: {
                System.out.println("Введите строку: ");
                HighFirstLetter();
                break;
            } case 3: {
                Sort();
                break;
            }
            default: {
                System.out.println("Некорректный ввод!");
                break;
            }
        }
    }
}
