package Task8;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число K ");
        int numberK = input.nextInt();
        int sumONumbers = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % numberK == 0) {
                sumONumbers = sumONumbers + arr[i];
            }

        }
        System.out.println("Сумма элементов, кратных K = " +  sumONumbers);
            
    }

}
