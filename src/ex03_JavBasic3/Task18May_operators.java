package ex03_JavBasic3;

public class Task18May_operators {
    public static void main(String[] args) {
        //int i = 11;
    //Task 1:
        /*i = i++ + ++i;
        //i=12+12=24

        System.out.println(i);*/



        /*Task 2"
        int a = 11;
       int  b = 22;
       int c;

        c = a + b + a++ + b++ + ++a + ++b;

        //c= 11+22+12+23+12+23= 103
        //a=13
        //b=24

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);*/



       // TASK 3:

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;
        //m= 1-2-3=-4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

        int a = 1, b = 2, c = 3;

        int d = --a - --b - c--;
        //d= 0-1-3=

        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);


    }
}
