package labo3;

public class Clock {

    public int hour; // змінна для зберігання годин(доступна для інших класів)
    private int minute; // змінна для зберігання хвилин (інкапсульвона)

    public void nextMinute() { //метод рахує хвилини
        minute++;

        if (minute > 59) { //якщо більше 60, то обнуляємо і додаємо одну годину
            minute = 0;
            hour++;

        }
        if (hour > 23) { //якщо більше 23 - обнуляємо
            hour = 0;
        }
    }

    public Clock() { //порожній конструктор
    }

    public Clock(int hour, int minute) { //конструктор з параметрами
        this.hour = hour;
        this.minute = minute;
    }

    public int getMinute() { //гетери
        return minute;
    }

    public void setMinute(int minute) { //сетери
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() { //метод для вивовду
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public static void main(String[] args) { // тестування

        Clock clock = new Clock(12 , 23);
        System.out.println(clock);
    }
}
