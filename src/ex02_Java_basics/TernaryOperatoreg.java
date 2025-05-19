package ex02_Java_basics;

public class TernaryOperatoreg {
    public static void main(String[] args) {
        int age =24;
        String canIgoToGoa= age>18? "Yes you can":"NO you cant";
        System.out.println(canIgoToGoa);

        String CanIGoToThailand = age>18? (age>25 ? "You can drink in Thailand ":"You cant drink in thailand") : "No you cant";
        System.out.println(CanIGoToThailand);

        String cmd1= args[0];
        int age1= Integer.parseInt(cmd1);
        System.out.println(age1);


    }
}
