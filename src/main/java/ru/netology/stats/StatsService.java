package ru.netology.stats;

import static java.lang.Integer.sum;

public class StatsService {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = sum(sales);
        int avg = avg(sales);
        int maxMonth = maxMonth(sales);
        int minMonth = minMonth(sales);
        int totalMinSales = totalMinSales(sales);
        int totalMaxSales = totalMaxSales(sales);

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(maxMonth);
        System.out.println(minMonth);
        System.out.println(totalMinSales);
        System.out.println(totalMaxSales);

    }

    public static int sum(int[] sales) {

        int sum = 0;
        for (int index = 0; index < sales.length; index++) {
            sum = sum + sales[index];

        }

        return sum;

    }

    public static int avg(int[] sales) {
        return sum(sales) / (sales.length);

    }


    public static int maxMonth(int[] sales) {
        int maxSales = 0;
        int maxMonth = 0;
        for (int index = 0; index < sales.length; index++) {
            if (sales[index] > maxSales) {
                maxSales = sales[index];
                maxMonth = index + 1;

            }
        }
        return maxMonth;

    }

    public static int minMonth(int[] sales) {
        int minSales = Integer.MAX_VALUE;
        int minMonth = 0;
        for (int index = 0; index < sales.length; index++) {
            if (sales[index] < minSales) {
                minSales = sales[index];
                minMonth = index + 1;

            }
        }

        return minMonth;

    }

    public static int totalMinSales(int[] sales) {
        int avg = avg(sales);
        int count = 0;
        for (int index = 0; index < sales.length; index++ ) {
            if (sales[index] < avg) {
                count++;
            }
        }
        return count;
    }

    public static int totalMaxSales(int[] sales) {
        int avg = avg(sales);
        int count = 0;
        for (int index = 0; index < sales.length; index++ ) {
            if (sales[index] > avg) {
                count++;
            }
        }
        return count;
    }
}



