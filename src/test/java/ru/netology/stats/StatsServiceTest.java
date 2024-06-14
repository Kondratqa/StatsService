package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(180, statsService.sum(sales));
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15, statsService.avg(sales));
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(6, statsService.maxMonth(sales));
    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, statsService.minMonth(sales));
    }

    @Test
    public void shouldCalculateTotalMonthsBelowAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, statsService.totalMinSales(sales));
    }

    @Test
    public void shouldCalculateTotalMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, statsService.totalMaxSales(sales));
    }
}
