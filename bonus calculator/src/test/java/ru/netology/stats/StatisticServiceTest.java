package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void shouldCalculateSum() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSalesMonth() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.findMaxSalesMonth(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void findMinSalesMonth() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthBelowAverage() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.qtyMonthBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthOverAverage() {
        StatisticService service = new StatisticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.qtyMonthOverAverage(purchases);

        assertEquals(expected, actual);
    }
}
