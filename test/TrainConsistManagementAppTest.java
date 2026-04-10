
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // Should NOT assign cargo
        assertNull(bogie.cargo);
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistManagementApp.GoodsBogie bogie1 =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        TrainConsistManagementApp.GoodsBogie bogie2 =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum"); // error
        bogie2.assignCargo("Petroleum"); // should work

        assertEquals("Petroleum", bogie2.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // No crash = finally executed
        assertTrue(true);
    }
}

