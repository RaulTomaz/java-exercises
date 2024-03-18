/* 
Write a program that reads one integer from the keyboard.

If the number consists of three digits, then you need to display the sum of the digits of the number. If it consists of two — the product of digits, if it's one digit — display the number.

In all other cases, do not output anything.

Input example:

123
Output example:

6
Input example:

34
Output example:

12
Requirements:
•	The program must read one integer from the keyboard.
•	The program should display the sum of the digits of the read number, if it is three-digit.
•	The program should display the product of the digits of the read number, if it is two-digit.
•	The program should display the read number if it is single digit.
•	The program should not display anything if the read number has more than three digits.
*/

package en.codegym.task.pro.task00.task0009;

import java.util.Scanner;

/* 
How many digits
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result;
        
        if (String.valueOf(number).length() == 1){
            System.out.println(number);
        }
            
        if (String.valueOf(number).length() == 3){
            result = 0;
            for (int count = 1; count <= 3; count++){
                result += (number % 10);
                number = number / 10;    
            }
            System.out.println(result);
        }
    
        if (String.valueOf(number).length() == 2){
            result = 1;
            for (int count = 1; count <= 2; count++){
                result *= (number % 10);
                number = number / 10;    
            }
            System.out.println(result);
        }
        
        
    }
}
