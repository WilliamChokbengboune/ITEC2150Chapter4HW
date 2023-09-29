/**
 * Class: AIOBException
 * Author: William Chokbengboune
 * Date: 9/29/2023
 * Description: The AIOBException class takes the user input and
 * prints out an index value corresponding to the index of the array
 */
import java.util.Scanner;

public class AIOBException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] randomNumber = new double[50];
        for (int i = 0; i < randomNumber.length; i++){
            //This will assign a random number value to the index
            randomNumber[i] = Math.random();
        }
        boolean valueReceived = false;
        while(!valueReceived) {
            try {
                System.out.println("Enter an index value: ");
                System.out.println(randomNumber[input.nextInt()]);
                valueReceived = true;
            }
            //if the array goes out of bounds, then the print statement in the catch will print
            catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Enter a valid number: ");
            }
        }
        input.close();
    }
}
