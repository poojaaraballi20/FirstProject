package ex02_Java_basics;

import org.w3c.dom.ls.LSOutput;

public class IncreementExample2 {
    public static void main(String[] args) {

        // post increement expression:
        int a=10;
        int b= a++;
        System.out.println(a);
        System.out.println(b);
        //ERT- Expression result table

        //a /exp/b
        //10/NA/NA=line 9
        //11/11/10=line 10

        System.out.println("-----------------------------------------------");

        int in1=10;
        int in2=++in1;
        System.out.println(in1);
        System.out.println(in2);
        //a=in1 /exp/in2
        //10/NA/NA=line 21
        //11/11/11=line 22

        System.out.println("-----------------------------------------------");
        int inz1=10;
        int inz2=inz1--;
        System.out.println(inz1);
        System.out.println(inz2);
        //inz1/exp/inz2
        //10/NA/NA=line 30
        //9/9/10=line 31

        System.out.println("-----------------------------------------------");
        int len1=10;
        int len2=--len1;
        System.out.println(len1);
        System.out.println(len2);
        //len/exp/len2
        //10/NA/NA=line 39
        //9/9/9=line 40


    }

    }


