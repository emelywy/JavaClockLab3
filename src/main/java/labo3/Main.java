package labo3;

import java.util.Timer;

public class Main {

    public static void main(String[] args) { //запуск годиннику

        //консольний варіант
//        Timer timer = new Timer();
//        timer.schedule(new MyClock(), 1000, 1000);

        new ClockFrame(); //графічний варіант
    }
}
