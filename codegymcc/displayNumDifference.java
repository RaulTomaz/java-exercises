/* 
Write a program that reads two integers from the keyboard.

If the first number is greater, then you need to display their difference, otherwise do nothing.

Input example:

12
8
Output example:

4
Requirements:
•	The program must read two integers from the keyboard.
•	The program should display the difference of the read numbers if the first number is greater than the second.
•	The program should not do anything if the first number is NOT greater than the second.
*/

package en.codegym.task.pro.task00.task0007;

import java.util.Scanner;

/* 
Greater minus smaller
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if (number1 > number2){
            System.out.println(number1 - number2);
        }
    }
}
