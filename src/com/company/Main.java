package com.company;

public class Main {
    public static int distance = 10000;

    public static void main(String[] args) {

        Cycler cycler1 = new Cycler("Vlad", "Chiipesh", 17, "Russia", 20, new Bicycle[]{new Bicycle("Горный (MTB) велосипед Navigator 500 MD 26 F010 (2019)", 12305, 15), new Bicycle("Горный (MTB) велосипед Navigator 640 D 26 V010 (2019)", 17555, 40)});
        Cycler cycler2 = new Cycler("Vilen", "Evseev", 25, "USSR", 25, new Bicycle[]{new Bicycle("Горный (MTB) велосипед Navigator 640 D 26 V010 (2019)", 17555, 25)});
        Cycler cycler3 = new Cycler("Andrey", "Timofeev", 17, "Japan", 15, new Bicycle[]{new Bicycle("Шоссейный велосипед XT 300 28 V010 (2020)", 46740, 10), new Bicycle("Горный (MTB) велосипед Navigator 770 D 27.5 V010 (2020)", 43560, 20), new Bicycle("Горный (MTB) велосипед Adrenalin D 27.5 V010 (2020)", 64000, 30)});

        cycler1.showCycler();
        cycler2.showCycler();
        cycler3.showCycler();

        cycler1.goIn();
        cycler2.goIn();
        cycler3.goIn();

        cycler1.finish();
        cycler2.finish();
        cycler3.finish();

        cycler1.goOut();
        cycler2.goOut();
        cycler3.goOut();
    }
}