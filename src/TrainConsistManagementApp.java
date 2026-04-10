
/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using Linear Search on an unsorted array.
 *
 * @version 18.0
 */

public class TrainConsistManagementApp {

    // Linear Search Method (used in test cases also)
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // Found
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=====================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = searchBogie(bogieIds, searchId);

        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}

