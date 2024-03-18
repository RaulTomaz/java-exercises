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
