import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Average each row of ten test scores
 */
public class ScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        File dataFile = new File("TestScoresByClass.csv");
        Scanner scanner = new Scanner(dataFile).useDelimiter(",|\\n");
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();
            System.out.println(line);

            // line now contains a line of comma-separated numbers
            // representing 10 test scores for each class.
            //
            // Your job is to parse the numbers into individual test scores using
            // another Scanner variable using a comma as the delimiter.  
            // 
            // Read the ten test scores and average them together.  The first
            // number is the class number and the next 10 numbers are the 
            // test scores.  
            //
            // You need to compute the average and print for each class the class
            // number, then the average score.  The first few lines should look
            // like this:
            //
            // Class: Avg scoree
            // 2125:  55
            // 1628:  47
            //
            // Pay attention to the spacing on your output
            //
            // Write your code in the space below!
            scanner.useDelimiter(",");
            
            
            
        }
    }

    public static void main (String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
