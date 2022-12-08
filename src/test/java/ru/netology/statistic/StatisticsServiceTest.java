package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNotFirstValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 5, 7, 4, 31, 4, 3, 8, 6, 11, 11, 1};
        long expected = 31;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
