
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testLoopFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC", 56)
        );

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterUsingLoop(list);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC", 56)
        );

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterUsingStream(list);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC", 56),
                new TrainConsistManagementApp.Bogie("General", 90)
        );

        List<TrainConsistManagementApp.Bogie> loopResult =
                TrainConsistManagementApp.filterUsingLoop(list);

        List<TrainConsistManagementApp.Bogie> streamResult =
                TrainConsistManagementApp.filterUsingStream(list);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new TrainConsistManagementApp.Bogie("B" + i, i % 100));
        }

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterUsingStream(list);

        assertNotNull(result);
    }
}

