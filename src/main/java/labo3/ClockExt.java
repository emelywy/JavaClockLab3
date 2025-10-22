package labo3;

public class ClockExt extends Clock { //наслідує від Clock

    private int seconds; //змінна для секунд (інкапсульована)

    public int getSeconds() { //гетери
        return seconds;
    }

    public void setSeconds(int seconds) { //сетери
        this.seconds = seconds;
    }

    public ClockExt() {} //порожній конструктор

    public ClockExt(int seconds) { //конструктор з секундами
        this.seconds = seconds;
    }

    public ClockExt(int hour, int minute, int seconds) { //повний конструктор
        super(hour, minute);
        this.seconds = seconds;
    }

    public void nextSecond() { //рахує секунди
        seconds++;
        if (seconds > 59) { // якщо більше 60 - додаємо хвилину, та обнуляємо
            nextMinute();
            seconds = 0;
        }
    }

    @Override
    public String toString() { //метод для виводу
        return "ClockExt{" +
                "hour=" +getHour() +
                ", minute=" +getMinute() +
                ",seconds=" + seconds +
                '}';
    }

    public  static void main(String[] args) { //тестування

        ClockExt clock = new ClockExt(23, 32, 10);
        System.out.println(clock);

    }
}
