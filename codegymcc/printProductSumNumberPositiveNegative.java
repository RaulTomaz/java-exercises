package en.codegym.task.pro.task00.task0008;

import java.util.Scanner;

/* 
Positive and negative
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if (number1 > 0 && number2 > 0 ||
            number1 < 0 && number2 < 0){
                System.out.println(number1 * number2);
            } else{
                System.out.println(number1 + number2);
            }
        
    }
}
