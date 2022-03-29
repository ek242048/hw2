package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte fox = 1;
        short car = 3;
        int rose = 9;
        long elephant = 1_000;
        float animalWeiht = 32.1f;
        double roseHeight = 7.3;
        char money = 35;
        System.out.println (money);
        boolean elephantBig = elephant >= 800;
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
        int milk = 200;
        int milkweight = 105;
        double allmilkweight = (milk * milkweight) / 100;
        int icecream = 2;
        int icecreamWeight = 100;
        int allIcecreamWeight = icecream * icecreamWeight;
        int egg = 4;
        int eggweight = 70;
        int allEggsWeight = egg * eggweight;
        double Breakfast = allbananasweight + allmilkweight + allIcecreamWeight + allEggsWeight;
        double breakfastInKilos = Breakfast / 1_000;
        System.out.println ("Вес завтрака" + breakfastInKilos + "кг");

    }
}
