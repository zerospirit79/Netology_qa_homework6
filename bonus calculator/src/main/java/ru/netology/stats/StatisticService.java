package ru.netology.stats;

public class StatisticService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        int i = 0;
        for (int sale : sales) {
            sum += sale;
            i++;
        }
        return sum / i;
    }

    public int qtyMonthBelowAverage(int[] sales) {
        int month = 0;
        int count = 0;
        for (int sale : sales) {
            if (averageSales(sales) > sales[month]) {
                count++;
            }
            month++;

        }
        return count;
    }

    public int qtyMonthOverAverage(int[] sales) {
        int month = 0;
        int count = 0;
        for (int sale : sales) {
            if (averageSales(sales) < sales[month]) {
                count++;
            }
            month++;

        }
        return count;
    }

    public int findMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }
}
