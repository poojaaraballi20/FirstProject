package ex03_JavBasic3;

import java.util.Scanner;

public class _IfElseExmaple1 {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);
        System.out.println(age);
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        int age1= sc.nextInt();

        if(age1>18)
        {
            System.out.println("You can vote");
        }
        else {
            System.out.println("Not Allowed to vote");
        }
        }
    }

