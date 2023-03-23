/**
 * 
 */
/**
 * @author Noordin
 *
 */
import java.util.Scanner;
public class numbervalueswapper {
	public static void main(String[] args) {
        // Create a Scanner for data capturing
        Scanner scanner = new Scanner(System.in);

        // Getting users input
        System.out.print("Enter the first num: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second num: ");
        int num2 = scanner.nextInt();

        // printing the first values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using var3
        int var3 = num1;
        num1 = num2;
        num2 = var3;

        // displaying the swapped outcome
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}