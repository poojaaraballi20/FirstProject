package ex02_Java_basics;

public class _17May_taskAdultMinorSenior {
    public static void main(String[] args) {
        int age=15;

        String output= age>18 ? (age < 65 ? "I am an Adult" : "I am a senior"): "I am a minor";
        System.out.println(output);
    }
}
