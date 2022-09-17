public class Main {

        // Домашнее задание 1

        // Задание 1
    public static void Task1() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

        // Задание 2
    public static void Task2() {
        for (int i = 10; i > 0; i --) {
            System.out.println(i);
        }
        System.out.println();
    }

        //Задание 3
    public static void Task3() {
        for (int i = 0; i < 18; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

        // Задание 4
    public static void Task4() {
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

        // Домашнее задание 2

        // Задание 1
    public static void Task5() {

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "год является високосным");
        }
        System.out.println();
    }

        // Задание 2
    public static void Task6() {

        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

        // Задание 3
    public static void Tack7() {

        for (int i = 1; i < 513; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

        // Домашнее задание 3

        // Задание 1
    public static void Task8() {

        int part = 29000;
        int sum = 0;

        for (int i = 1; i < 13; i++) {
            sum += part;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println();
    }
        // Занятие 2
    public static void  Task9() {

        int part = 29000;
        int sum = 0;

        for (int i = 1; i < 13; i++) {
            sum += sum/100;
            sum += part;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Tack7();
        Task8();
        Task9();
    }
}