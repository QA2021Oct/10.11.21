package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
	    /*int x = 1;
        while(x == 1){
            System.out.println("Hello");
           // break;
            x ++ ;  // x = x + 1 ;
        }

        int x1 = 1;

        do{
            System.out.println(x1);
            x1 ++ ;
        }while (x1 < 4 );*/

        //1:
        int num = 0;
        while(num < 100){
            num = num + 1;  /// 1 , 2
            System.out.println(num);  // 1 , 2 ...
        }

        //2:
        int count = 0 ;
        while(count < 100){
            count = count + 2 ;
            System.out.println(count);
        }

        //3:
        int count1 = 0;
        int sum = 0;

        while(count1 < 10){
            count1 = count1 + 1; // count ++ ;  // 1- 10 -  1 + 2 + 3 + 4 + 5 + 6
            sum =  sum + count1;    /// sum
            System.out.println("Sum now is:" + sum);
        }
        System.out.println("Sum" + sum );

        //4:
        int number;
        int sum1 = 0;

        System.out.println("Enter a number: ");
        number= s.nextInt();

        while (number > 0){
            sum1 = number + sum1;
            System.out.println("enter  number: ");
            number = s.nextInt();
        }
        // also 4:
        do{
            System.out.println("enter  number: ");
            number = s.nextInt();
            sum = number + sum;
        } while (number >= 0);

        System.out.println("Sum is: " + sum);

        //5:
       System.out.println("please enter a number: ");
        int number1 = s.nextInt();

        while(number1 <= 100){
            System.out.println("Please enter number");
            number1 = s.nextInt();
        }

        //6:
        int index = 4;
        while (index <= 100){
            System.out.print(index);
            System.out.print(", ");
            index +=2 ;  // index = index + 2;
        }

        //7:
        System.out.println("Enter 2 number: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        while (num1 != num2){
            System.out.println("Enter 2 numbers");
            num1 = s.nextInt();
            num2 = s.nextInt();
        }


    }
}
