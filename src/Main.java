public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1//

        int in = 65165156;
        System.out.println(in);

        byte by = 100;
        System.out.println(by);

        short shot = 3276;
        System.out.println(shot);

        long lo = 65416516351L;
        System.out.println(lo);

        float flo = 2.8f;
        System.out.println(flo);

        double wasd = 3.7;
        System.out.println(wasd);


        //задача 2//


        double a = 27.12;
        System.out.println(a);

        long b = 987678965549L;
        System.out.println(b);

        float c = 2.786f;
        System.out.println(c);

        boolean d = false;
        System.out.println(d);

        short e = 569;
        System.out.println(e);

        short f = -159;
        System.out.println(f);

        short g = 27897;
        System.out.println(g);

        byte h = 67;
        System.out.println(h);

        //Задача 3//

        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int students = teacher1 + teacher2 + teacher3;
        System.out.println("Всего учеников в трёх классах " + students + " человек.");
        int paper = 480;
        System.out.println("На каждого ученика расчитано " + paper/students + " листов бумаги.");

        //Задача 4//

        int performance = 8;
        int minute = 20;
        int day = 1;
        int days = 3;
        int month = 1;
        int PerformanceMinute = performance * minute;
        System.out.println("За " + minute + " минут машины произвели бутылок " + PerformanceMinute + " штук.");
        int PerformanceDay = performance * (day * 24 * 60);
        System.out.println("За " + day + " сутки машины произвели бутылок " + PerformanceDay + " штук.");
        int PerformanceDays = performance * (days * 24 * 60);
        System.out.println("За " + days + " суток машины произвели бутылок " + PerformanceDays + " штук.");
        int PerformanceMonth = performance * (month * 30 * 24 * 60);
        System.out.println("За " + month + " месяц машины произвели бутылок " + PerformanceMonth + " штук.");

        //Задача 5//

        int TotalBank = 120;
        int WhiteColorBankOnClass = 2;
        int BrownColorBankOnClass = 4;
        int TotalClass = TotalBank / (WhiteColorBankOnClass + BrownColorBankOnClass);
        int TotalWhiteBank = WhiteColorBankOnClass * TotalClass;
        int TotalBrownBank = BrownColorBankOnClass * TotalClass;
        System.out.println("В школе, где " + TotalClass + " классов, нужно " + TotalWhiteBank + " банок белой краски и " + TotalBrownBank + " банок коричневой краски");

        //Задача 6//

        int Bananas = 5;
        int WeightBanana = 80;
        int milk = 2;
        int WeightMilk = 105;
        int IceCream = 2;
        int WeightIceCream = 100;
        int Egg = 4;
        int WeightEgg = 70;
        int TotalWeightBananas = Bananas * WeightBanana;
        int TotalWeightMilk = milk * WeightMilk;
        int TotalWeightIceCream = IceCream * WeightIceCream;
        int TotalWeightEgg = Egg * WeightEgg;
        int TotalWeight = TotalWeightBananas + TotalWeightMilk + TotalWeightIceCream + TotalWeightEgg;
        int TotalWeightKg = TotalWeight / 1000;
        System.out.println("Общий вес ингридиентов " + TotalWeight + " грамм.");
        System.out.println("Общий вес ингридиетнов " + TotalWeightKg + " килограмм.");

        //Задача 7//

        int TotalWeightLoss = 7000;
        int WeightLossMin = 250;
        int WeightLossMax = 500;
        int DaysOnLossWeight250 = TotalWeightLoss / WeightLossMin;
        int DaysOnLossWeight500 = TotalWeightLoss / WeightLossMax;
        System.out.println("Если спортсмен будет худеть каждый день на 250 грамм, то понадобится "+ DaysOnLossWeight250 + " дней. А если на 500 грамм, то - " + DaysOnLossWeight500 + " дней.");
        int AvgDaysOnLossWeight = (DaysOnLossWeight250 + DaysOnLossWeight500) / 2;
        System.out.println("В среднем на сброс 7 кг спортсмену понадобится " + AvgDaysOnLossWeight + " день.");

        //Задача 8//

        int WagesMasha = 67760;
        int WagesDenis = 83690;
        int WagesChristina = 76230;
        int YearWagesMasha = WagesMasha * 12;
        int YearWagesDenis = WagesDenis * 12;
        int YearWagesChristina = WagesChristina * 12;
        double NewWagesMasha = (WagesMasha * 0.1) + WagesMasha;
        double NewWagesDenis = (WagesDenis * 0.1) + WagesDenis;
        double NewWagesChristina = (WagesChristina * 0.1) + WagesChristina;
        double YearNewWagesMasha = NewWagesMasha * 12;
        double YearNewWagesDenis = NewWagesDenis *12;
        double YearNewWagesChristina = NewWagesChristina * 12;
        double diffWagesMasha = YearNewWagesMasha - YearWagesMasha;
        double diffWagesDenis = YearNewWagesDenis - YearWagesDenis;
        double diffWagesChristina = YearNewWagesChristina - YearWagesChristina;
        System.out.println("Маша теперь получает " + NewWagesMasha + " рублей. Годовой доход вырос на " + diffWagesMasha + " рублей.");
        System.out.println("Денис теперь получает " + NewWagesDenis + " рублей. Годовой доход вырос на " + diffWagesDenis + " Рублей.");
        System.out.println("Кристина теперь получает " + NewWagesChristina + " рублей. Годовой доход вырос на " + diffWagesChristina + " рублей." );
    }
}


