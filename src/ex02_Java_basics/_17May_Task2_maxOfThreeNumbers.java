package ex02_Java_basics;

public class _17May_Task2_maxOfThreeNumbers {
    public static void main(String[] args) {
        int a=800;
       int b=600;
        int c=100;

        String output = a > b? (a > c ? "A is greater" : "C is greater") : (b > c ? "B is greater": "C is greater");
        System.out.println(output);
    }
}
