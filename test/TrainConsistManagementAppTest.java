
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSearch_BogieFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        assertFalse(TrainConsistManagementApp.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(TrainConsistManagementApp.searchBogie(arr, "BG101"));
    }
}

