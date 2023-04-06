package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        double average = 0;
        StatsService service = new StatsService();
        sum = service.salesAmount(array);
        average = service.averageMonthlySales(array);
        int maxMonth = service.maxSalesNumberMonth(array);
        int minMonth = service.minSalesNumberMonth(array);
        int minSales = service.numberMonthsSalesBelowAverage(array);
        int maxSales = service.numberMonthsSalesUnderAverage(array);
        System.out.println(sum);
        System.out.print("средняя сумма продаж в месяц: " + average);
        System.out.print(". Месяц максимальных продаж: " + maxMonth);
        System.out.print(". Месяц минимальных продаж: " + minMonth);
        System.out.print(". Количество месяцев минимальных продаж: " + minSales);
        System.out.print(". Количество месяцев максимальных продаж: " + maxSales);
    }
}

