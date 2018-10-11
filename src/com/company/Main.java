
package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number in inches");
        int num = keyboard.nextInt();
        System.out.printf("%.2f",convertInchesToFeet(num));
    }
    public static double convertInchesToFeet  (int num){

        double foot =  num / 12f;

        return foot ;
    }


//}
// Collatz Sequence

//
//package com.company;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class Main {

////    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        String playAgain = "";
//
//        do {
//            System.out.println("Enter a number :");
//
//            int num = keyboard.nextInt();
//
//            do {
//                if (num % 2 == 0) {
//                    num = divideBy2(num);
//                } else {
//                    num = divideBy3(num);
//                }
//
//                System.out.println(num);
//            }while(num > 1);
//
//            System.out.println("Do you want to enter another number? Y(yes) or N(no)");
//            playAgain = keyboard.nextLine();
//        } while (playAgain.equalsIgnoreCase("y"));
//
//
//    }
//    static int divideBy3 (int num){
//
//        int divide3;
//        divide3 = (num * 3) + 1;
//
//        return divide3;
//    }

    public static int divideBy2  (int num){

        int divide2 = num / 2;


        return divide2;
    }


}

