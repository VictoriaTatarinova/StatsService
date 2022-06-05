package ru.netology.stats;

public class StatsService {

    public int calcYear(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageMonthlySales(int[] sales) {
        int averageSale = calcYear(sales) / sales.length;
        return averageSale;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numLowerAverage(int[] sales) {
        int monthNum = 0;

        for (int monthSale : sales) {
            if (monthSale < averageMonthlySales(sales)) {
                monthNum += 1;
            }
        }
        return monthNum;
    }

    public int numHigherAverage(int[] sales) {
        int monthNum = 0;

        for (int monthSale : sales) {
            if (monthSale > averageMonthlySales(sales)) {
                monthNum++;
            }
        }
        return monthNum;

    }


}

