package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }

        return sum;
    }

    public double averageMonthlySales(int[] array) {
        double sum = salesAmount(array);
        double average = 0;
        average = sum / array.length;
        return average;
    }

    public int maxSalesNumberMonth(int[] array) {
        int maxMonth = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSalesNumberMonth(int[] array) {
        int minMonth = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberMonthsSalesBelowAverage(int[] array) {
        double sum = averageMonthlySales(array);
        int minSales = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sum) {
                minSales++;
            }
        }
        return minSales;
    }

    public int numberMonthsSalesUnderAverage(int[] array) {
        double sum = averageMonthlySales(array);
        int maxSales = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sum) {
                maxSales++;
            }
        }
        return maxSales;
    }
}










