package ex01_Java_Basics;

public class _Multiple_mainExample {
    public static void main(String[] args) {
        System.out.println("I m main with String array");
        _Multiple_mainExample.main(2);
    }

    public static void main(int a) {
        System.out.println("I am main with int args");
    }

    public static void main(String str) {
        System.out.println("I am main with only String");
    }

    //In this program only main with String array will be executed.
    //anything in the main string array will be executed

}
