
/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class demonstrates fail-fast validation by throwing
 * an exception when search is attempted on empty data.
 *
 * @version 20.0
 */

public class TrainConsistManagementApp {

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // FAIL-FAST VALIDATION
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // LINEAR SEARCH (after validation)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=====================================\n");

        String[] bogieIds = {}; // Empty dataset
        String searchId = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie " + searchId + " found.");
            } else {
                System.out.println("Bogie " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}

