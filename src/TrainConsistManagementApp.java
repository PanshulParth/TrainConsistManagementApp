
import java.util.Arrays;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a bogie ID
 * using Binary Search on sorted data.
 *
 * @version 19.0
 */

public class TrainConsistManagementApp {

    // Binary Search Method (used in test cases also)
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        // Ensure array is sorted (precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                return true; // Found
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=====================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted before display
        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = binarySearchBogie(bogieIds, key);

        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}

