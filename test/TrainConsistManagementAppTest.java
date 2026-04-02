
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Helper method for aggregation
    private int totalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        assertEquals(152, totalCapacity(bogies));
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 70)
        );

        assertEquals(142, totalCapacity(bogies));
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Collections.singletonList(
                new Bogie("Sleeper", 72)
        );

        assertEquals(72, totalCapacity(bogies));
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        assertEquals(0, totalCapacity(bogies));
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        int result = totalCapacity(bogies);

        assertEquals(80, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        int result = totalCapacity(bogies);

        assertTrue(result > 0);
        assertEquals(152, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        totalCapacity(bogies);

        assertEquals(1, bogies.size());
    }
}

