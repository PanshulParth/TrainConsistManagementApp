
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * @author Developer
 * @version 2.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // Create ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Check existence (READ operation)
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}

