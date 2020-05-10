import java.util.Scanner;

public class sixth_task {

    public static void BackPack(String[] BackPackElements) {
        System.out.print("Содержимое вашего рюкзака:\n");
        for (int track = 0; track < 10; track++) {
                System.out.print(BackPackElements[track] + "\n");

        }
    }

    public static void Shop(int space, int balance, String[] BackPackElements, int tracker) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Номер | Предмет | Цена | Место\n   1  |  Банан  | 100  | 1\n");
        System.out.print("   2  |  Яблоко | 200  | 2\n   3  |  Книга  | 400  | 4\n");
        System.out.print("   4  |  Плеер  | 500  | 5\n   5  | Телефон | 900  | 7\n");
        System.out.print("\n0. ВЫХОД\n");
        int enter = scan.nextInt();
        switch (enter) {
            case 0: {
                MainMenu(space, balance, BackPackElements, tracker);
            }
            case 1: {
                if (balance >= 100) {
                    if (space >= 1) {
                        System.out.print("Вы купили Банан.\n");
                        space = space - 1;
                        balance = balance - 100;
                        BackPackElements[tracker] = "Банан";
                        tracker++;
                        Shop(space, balance, BackPackElements, tracker);
                    } else {
                        System.out.print("У вас не хватает места в рюкзаке!\n");
                        Shop(space, balance, BackPackElements, tracker);
                    }
                } else {
                    System.out.print("У вас не хватает денег!\n");
                    Shop(space, balance, BackPackElements, tracker);
                }
            }
            case 2: {
                if (balance >= 200) {
                    if (space >= 2) {
                        System.out.print("Вы купили Яблоко.\n");
                        space = space - 2;
                        balance = balance - 200;
                        BackPackElements[tracker] = "Яблоко";
                        tracker++;
                        Shop(space, balance, BackPackElements, tracker);
                    } else {
                        System.out.print("У вас не хватает места в рюкзаке!.\n");
                        Shop(space, balance, BackPackElements, tracker);
                    }
                } else {
                    System.out.print("У вас не хватает денег!\n");
                    Shop(space, balance, BackPackElements, tracker);
                }
            }
            case 3: {
                if (balance >= 400) {
                    if (space >= 4) {
                        System.out.print("Вы купили Книгу.\n");
                        space = space - 4;
                        balance = balance - 400;
                        BackPackElements[tracker] = "Книга";
                        tracker++;
                        Shop(space, balance, BackPackElements, tracker);
                    } else {
                        System.out.print("У вас не хватает места в рюкзаке!\n");
                        Shop(space, balance, BackPackElements, tracker);
                    }
                } else {
                    System.out.print("У вас не хватает денег!\n");
                    Shop(space, balance, BackPackElements, tracker);
                }
            }
            case 4: {
                if (balance >= 500) {
                    if (space >= 5) {
                        System.out.print("Вы купили Плеер.\n");
                        space = space - 5;
                        balance = balance - 500;
                        BackPackElements[tracker] = "Плеер";
                        tracker++;
                        Shop(space, balance, BackPackElements, tracker);
                    } else {
                        System.out.print("У вас не хватает места в рюкзаке!\n");
                        Shop(space, balance, BackPackElements, tracker);
                    }
                } else {
                    System.out.print("У вас не хватает денег!\n");
                    Shop(space, balance, BackPackElements, tracker);
                }
            }
            case 5: {
                if (balance >= 900) {
                    if (space >= 7) {
                        System.out.print("Вы купили Телефон.\n");
                        space = space - 7;
                        balance = balance - 900;
                        BackPackElements[tracker] = "Телефон";
                        tracker++;
                        Shop(space, balance, BackPackElements, tracker);
                    } else {
                        System.out.print("У вас не хватает места в рюкзаке!\n");
                        Shop(space, balance, BackPackElements, tracker);
                    }
                } else {
                    System.out.print("У вас не хватает денег!\n");
                    Shop(space, balance, BackPackElements, tracker);
                }
            }
            default: {
                System.out.print("Ошибка ввода!\n");
                Shop(space, balance, BackPackElements, tracker);
                break;
            }
        }
    }

    public static void MainMenu(int space,int balance, String[] BackPackElements, int tracker) {
        Scanner scan = new Scanner(System.in);
        System.out.print("| МЕСТО В РЮКЗАКЕ: " + space + "\n");
        System.out.print("| БАЛАНС: " + balance + "\n");
        System.out.print("1. Рюкзак\n2. Магазин");
        int enter = scan.nextInt();
        switch (enter) {
            case 1: {
                BackPack(BackPackElements);
                break;
            }
            case 2: {
                Shop(space, balance, BackPackElements, tracker);
                break;
            }
            default: {
                System.out.print("Некореектный ввод!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance, space = 10, tracker = 0;
        String[] BackPackElements = new String[10];
        System.out.println("Введите желаемое кол-во средств: ");
        balance = scan.nextInt();
        for (int track = 0; track < 100; track++) {
            MainMenu(space, balance, BackPackElements, tracker);
        }
    }
}
