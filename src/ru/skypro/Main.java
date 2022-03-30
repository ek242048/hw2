package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte fox = 1;
        short car = 3;
        int rose = 9;
        long elephant = 800;
        float animalWeiht = 32.1f;
        double roseHeight = 7.3;
        char example = 35;
        System.out.println (example);
        boolean elephantBig = elephant >= 850 ;
        System.out.println ( elephantBig );

        //Задача 2
        double Boxer1 = 78.2;
        double Boxer2 = 82.7;
        double totalWeight = Boxer1 + Boxer2;
        System.out.println("общий вес боксеров " + totalWeight + "кг");
        double difference = Boxer2 - Boxer1;
        System.out.println("Разница в весе " + difference + "кг");

        //Задача 3
        int bananas = 5;
        int oneBananaWeight = 80;
        int allbananasweight = bananas * oneBananaWeight;
        int milk = 2;
        int milkweight = 105;
        double allmilkweight = (milk * milkweight);
        int icecream = 2;
        int icecreamWeight = 100;
        int allIcecreamWeight = icecream * icecreamWeight;
        int egg = 4;
        int eggweight = 70;
        int allEggsWeight = egg * eggweight;
        double Breakfast = allbananasweight + allmilkweight + allIcecreamWeight + allEggsWeight;
        double breakfastInKilos = Breakfast / 1_000;
        System.out.println ("Вес завтрака" + breakfastInKilos + "кг");

        //Задача 4
        int weightToLose = 7000;
        int programme1 = 250;
        int days1 = weightToLose / programme1;
        System.out.println("если сбрасывать в день по 250г, то худеть" + days1 + "дней");
        int programme2 = 500;
        int days2 = weightToLose / programme2;
        System.out.println("если сбрасывать в день по 500г. то худеть" + days2 + "дней");
        int days2goal = (days1 + days2) / 2;
        System.out.println("нужно в среднем дней для похудения" + days2goal);

        //Задача 5
        int M = 67_760;
        int D = 83_690;
        int K = 76_230;
        int M10 = M * 110 / 100;
        int D10 = D * 110 / 100;
        int K10 = K * 110 / 100;
        int MDifference = M10 - M;
        int DDifference = D10 - D;
        int Kdifference = K10 - K;
        System.out.println("Маша теперь получает" + M10 + "годовой доход вырос на" + MDifference + "рублей");
        System.out.println("Денис теперь получает" + D10 + "Годовой доход вырос на" + DDifference + "рублей");
        System.out.println("Кристина теперь получает" + K10 + "Годовой доход вырос на" + Kdifference + "рублей");


    }
}
