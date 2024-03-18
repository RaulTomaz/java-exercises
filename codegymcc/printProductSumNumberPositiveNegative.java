/* 
Write a program that reads two integers from the keyboard.

If both numbers are positive or both are negative, then you need to display their product, otherwise print their sum.

Input example:

5
8
Output example:

40
Input example:

-5
8
Output example:

3
Requirements:
•	The program must read two integers from the keyboard.
•	The program should display the product of the read numbers if both are positive or both are negative.
•	The program should display the sum of the read numbers, if both are non-positive or both are non-negative.
*/

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
