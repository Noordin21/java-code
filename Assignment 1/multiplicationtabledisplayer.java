/**
 * 
 */
/**
 * @author Noordin
 *
 */
import java.util.Scanner;
public class multiplicationtabledisplayer {
	public static void main(String[] args) {
        // scanner to capture user data
        Scanner scanner = new Scanner(System.in);

        // getting user input
        System.out.print("Enter a number: ");
        int numb = scanner.nextInt();

        // looping 1 to 12
        for (int loop = 1; loop <= 12; loop++) {
            int result = numb * loop;
            System.out.println(numb + " x " + loop + " = " + result);
        }
    }
}