/**
 * 
 */
/**
 * @author Noordin
 *
 */
public class numbercountpetterndisplayer {
	public static void main(String[] args) {
        // Define a variable to keep track of the number of rows to output
        int rows = 5;

        // Loop through each row to output
        for (int row = 1; row <= rows; row++) {
            // Loop through each column in the current row
            for (int col = 1; col <= row; col++) {
                // Output the current row number 
                System.out.print(row);
            }

            // It switches to the next line after displaying columns in the current row
            System.out.println();
        }
    }
}