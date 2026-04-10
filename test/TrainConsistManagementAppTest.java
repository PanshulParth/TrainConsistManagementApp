
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101", "BG205"};

        assertDoesNotThrow(() -> {
            TrainConsistManagementApp.searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertFalse(TrainConsistManagementApp.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG101"));
    }
}

