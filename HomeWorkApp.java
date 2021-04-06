package ru.geekbrains.myhomework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
            System.out.println("_Orange");
            System.out.println("_Banana");
            System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int c = a + b;
        if ( c >= 0) {
            System.out.println("Сумма Положительная");
        } else {
            System.out.println("Сумма Отрицательная");
        }
    }

    public static void printColor(){
        int value = 102;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
        System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 45;
        int b = 21;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
