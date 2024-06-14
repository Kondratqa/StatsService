package ru.netology.stats;

import static java.lang.Integer.sum;

public class StatsService {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.sum(sales);
        long avg = service.avg(sales);
        int maxMonth = service.maxMonth(sales);
        int minMonth = service.minMonth(sales);
        int totalMinSales = service.totalMinSales(sales);
        int totalMaxSales = service.totalMaxSales(sales);

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(maxMonth);
        System.out.println(minMonth);
        System.out.println(totalMinSales);
        System.out.println(totalMaxSales);

    }

    public long sum(long[] sales) {

        long sum = 0;
        for (int index = 0; index < sales.length; index++) {
            sum = sum + sales[index];

        }

        return sum;

    }

    public long avg(long[] sales) {
        return sum(sales) / sales.length;

    }


    public int maxMonth(long[] sales) {
        long maxSales = 0;
        int maxMonth = 0;
        for (int index = 0; index < sales.length; index++) {
            if (sales[index] > maxSales) {
                maxSales = sales[index];
                maxMonth = index + 1;

            }
        }
        return maxMonth;

    }

    public int minMonth(long[] sales) {
        long minSales = Long.MAX_VALUE;
        int minMonth = 0;
        for (int index = 0; index < sales.length; index++) {
            if (sales[index] < minSales) {
                minSales = sales[index];
                minMonth = index + 1;

            }
        }

        return minMonth;

    }

    public int totalMinSales(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (int index = 0; index < sales.length; index++ ) {
            if (sales[index] < avg) {
                count++;
            }
        }
        return count;
    }

    public int totalMaxSales(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (int index = 0; index < sales.length; index++ ) {
            if (sales[index] > avg) {
                count++;
            }
        }
        return count;
    }
}
