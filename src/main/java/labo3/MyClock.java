package labo3;

import java.util.Calendar;
import java.util.TimerTask;

public class MyClock extends TimerTask { //наслідує TimerTask
    @Override
    public void run() { //буде виконуватися кожного разу як спрацює таймер
        Calendar calendar = Calendar.getInstance(); //автоматично отримує поточні дані часу

        int hour = calendar.get(Calendar.HOUR_OF_DAY); //поточна година
        int minute = calendar.get(Calendar.MINUTE); //поточні хвилини
        int second = calendar.get(Calendar.SECOND); //поточні секунди

        System.out.println("Hour: " + hour + " Minute: " + minute + " Second: " + second); //вивід
    }
}
