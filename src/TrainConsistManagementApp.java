
import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class validates goods bogie safety rules using
 * Streams, allMatch(), and Lambda expressions.
 *
 * Rule:
 * Cylindrical bogies → only Petroleum allowed
 *
 * @version 12.0
 */

public class TrainConsistManagementApp {

    // Goods Bogie Model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // Validation method (used in test cases also)
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(b ->
                !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum")
        );
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("=====================================\n");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Validate safety
        boolean isSafe = isTrainSafe(bogies);

        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}

