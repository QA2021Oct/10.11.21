package com.company;


import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        // while
        // do-while
        //while(true) / do-while(true)  - brake;
        //while - brake;

        //For:

        /*int x = 2;
        // 2- 200 -> 2
        while( x <= 200 ){
            System.out.println(x);
            x = x + 2;
        }
        System.out.println(" ");*/
        // int x = 2;   x <= 200;  x = x + 2;


        //      begin  ;    condition   ;  growing
       /* for (int index = 1; index <= 10;  index++ )
        {
            System.out.println(index);
        }

        System.out.println("==============");

        for (int index = 10; index > 0;  index = index -1 )
        {
            System.out.println(index);
        }*/
        Scanner s = new Scanner(System.in);

        System.out.println("start from? ");
        int start = s.nextInt();
        System.out.println("end? ");
        int end = s.nextInt();
        System.out.println("jump? ");
        int jump = s.nextInt();

        for (int index = start; end >= index; index = index + jump){
            System.out.println(index);
            System.out.println("got to " + index);
        }
    }
}
