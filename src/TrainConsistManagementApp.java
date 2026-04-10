
import java.util.Arrays;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 17: Sort Bogie Names using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie names
 * alphabetically using Java built-in Arrays.sort().
 *
 * @version 17.0
 */

public class TrainConsistManagementApp {

    // Sorting Method (used in test cases also)
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("=====================================\n");

        String[] bogies = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }
}

