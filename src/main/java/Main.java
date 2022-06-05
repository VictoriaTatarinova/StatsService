import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж: " + service.calcYear(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.averageMonthlySales(sales));
        System.out.println("Номер месяца, в котором был пик продаж: " + service.maxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж: " + service.minSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.numLowerAverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.numHigherAverage(sales));

    }
}


