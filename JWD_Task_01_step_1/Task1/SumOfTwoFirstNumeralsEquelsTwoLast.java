package Task1;

import java.util.Scanner;

public class SumOfTwoFirstNumeralsEquelsTwoLast {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println(" Введите число ");
       int number = input.nextInt();
       if (1000 <= number && number <= 9999 ) {
           if (number / 1000 % 10 + number / 100 % 10 == number / 10 % 10 + number % 10) {
               System.out.println("True");
           } else {
               System.out.println("False");
           }
       } else {
           System.out.println(" Число должно быть четырехзначным ");
       }



    }


}

