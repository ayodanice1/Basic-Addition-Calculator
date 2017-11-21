
package calculator;

import java.util.Scanner;

/**
 * @author ayodanice1
 */
public class Calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double value = 1;
        
        System.out.println("This calculator sums up inputed values and terminates "
                    + "on zero(0)");

        while (value != 0) {
            System.out.println("Value: ");
            value = input.nextDouble();
            sum += value; 
        }
        System.out.println("Total: " + sum + "\nIgnore the zero(0) value");
    }
}
