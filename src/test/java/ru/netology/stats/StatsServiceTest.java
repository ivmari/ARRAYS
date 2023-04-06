package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        double expectedSalesAmount = 671;
        double actualSalesAmount = service.salesAmount(array);
        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);
    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        double expectedAverageAmount = 74.55555555555556;
        double actualAverageAmount = service.averageMonthlySales(array);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void maxSalesNumberMonth() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        int expectedMaxSalesNumberMonth = 8;
        int actualMaxSalesNumberMonth = service.maxSalesNumberMonth(array);
        Assertions.assertEquals(expectedMaxSalesNumberMonth, actualMaxSalesNumberMonth);
    }

    @Test
    public void minSalesNumberMonth() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        int expectedMinSalesNumberMonth = 1;
        int actualMinSalesNumberMonth = service.minSalesNumberMonth(array);
        Assertions.assertEquals(expectedMinSalesNumberMonth, actualMinSalesNumberMonth);
    }

    @Test
    public void numberMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        int expectedMonthsSalesBelowAverage = 4;
        int actualMonthsSalesBelowAverage = service.numberMonthsSalesBelowAverage(array);
        Assertions.assertEquals(expectedMonthsSalesBelowAverage, actualMonthsSalesBelowAverage);
    }

    @Test
    public void numberMonthsSalesUnderAverage() {
        StatsService service = new StatsService();
        int[] array = {15, 20, 51, 90, 111, 25, 89, 150, 120};
        int expectedMonthsSalesUnderAverage = 5;
        int actualMonthsSalesUnderAverage = service.numberMonthsSalesUnderAverage(array);
        Assertions.assertEquals(expectedMonthsSalesUnderAverage, actualMonthsSalesUnderAverage);

    }
}

