package com.company;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // 1  -> one , 2 -> two ....

       // System.out.println("Enter number: ");
       // int number = s.nextInt();

       /* if(number == 0) {
            System.out.println("zero");
        }
        else if(number == 1){
            System.out.println("one");
        }
        else if(number == 2){
            System.out.println("two");
        }
        else if(number == 3){
            System.out.println("three");
        }
        else{
            System.out.println("something else...");
        }*/

        /*switch (number){
            case 0 :
                System.out.println("zero");
                break;
            case 8:
                System.out.println("");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("four or five or six ");
                break;
            default:
                System.out.println("something else");
        }*/
        //System.out.println("enter a String-Number (like  - one)");
        //String numberName = s.next();

        /*switch (numberName){  // 1 .. one /two/ three....
                case "zero" :
                    System.out.println(0);
                    break;
                case "one" :
                    System.out.println(1);
                    break;
                case "two" :
                    System.out.println(2);
                    break;
                case "three" :
                    System.out.println(3);
                    break;
                case "four" :
                case "five":
                case "six":
                    System.out.println(4 + "or " + 5 + " or " + 6);
                    break;
                default:
                    System.out.println("something else...");
            }*/

        // switch case - days of the week - and get number from user - 1-7
        // 1 - Sunday....

        System.out.println("enter number from 1-7: ");
        int day = s.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a Day");
        }

    }
}
