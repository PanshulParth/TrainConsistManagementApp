
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * Description:
 * This class validates Train ID and Cargo Code formats
 * using Regular Expressions.
 *
 * @version 11.0
 */

public class TrainConsistManagementApp {

    // Regex patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // Validation methods (used in test cases also)
    public static boolean isValidTrainId(String trainId) {
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile(CARGO_CODE_REGEX);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC11 - Regex Validation");
        System.out.println("=====================================\n");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Validate Train ID
        if (isValidTrainId(trainId)) {
            System.out.println("Train ID " + trainId + " is VALID");
        } else {
            System.out.println("Train ID " + trainId + " is INVALID");
        }

        // Validate Cargo Code
        if (isValidCargoCode(cargoCode)) {
            System.out.println("Cargo Code " + cargoCode + " is VALID");
        } else {
            System.out.println("Cargo Code " + cargoCode + " is INVALID");
        }

        System.out.println("\nUC11 validation completed...");
    }
}

