package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class StatsServiceTest {

        @Test
        public void shouldCalculateSum() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(180, StatsService.sum(sales));
        }

        @Test
        public void shouldCalculateAverage() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(15, StatsService.avg(sales));
        }

        @Test
        public void shouldFindMaxMonth() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(6, StatsService.maxMonth(sales));
        }

        @Test
        public void shouldFindMinMonth() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(9, StatsService.minMonth(sales));
        }

        @Test
        public void shouldCalculateTotalMinSales() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(5, StatsService.totalMinSales(sales));
        }

        @Test
        public void shouldCalculateTotalMaxSales() {
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            assertEquals(5, StatsService.totalMaxSales(sales));
        }
    }


