package labo3;

public class ClockExt2 extends ClockExt{ //наслідує від ClockExt

    private int milliseconds; //змінна для мілісекунд

    public int getMilliseconds() { //гетери
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) { //сетери
        this.milliseconds = milliseconds;
    }

    public ClockExt2() {} // пустий конструктор

    public ClockExt2(int hour, int minute, int seconds, int milliseconds) { //повнйи конструктор
        super(hour, minute, seconds);
        this.milliseconds = milliseconds;
    }

    public ClockExt2(int seconds, int milliseconds) { //конструктор секунд та мілісекунд
        super(seconds);
        this.milliseconds = milliseconds;
    }

    public ClockExt2(int milliseconds) { //конструктор секунд
        this.milliseconds = milliseconds;
    }

    public void nextMilliseconds() { //рахує мілісекунди
        milliseconds+=100;
        if(milliseconds>1000){ //якщо більше 1000 мілісекунд, то обнуляємо та додаємо секунду
            milliseconds=0;
            nextSecond();

        }

        if(getSeconds()>59){ //якщо більше 59 секунд, то обнуляємо та додаємо хвилину
            setSeconds(0);
            nextMinute();
        }

        if(getMinute()>59){ //якщо більше 59 хвилин, то обнуляємо та додаємо годину
            setMinute(0);
            hour++;
        }

        if(getHour()>23){ //якщо більше 23 годин, то обнуляємо
            setHour(0);
        }
    }

    @Override
    public String toString() { //метод виводу
        return "ClockExt2{" +
                "hour=" +getHour() +
                ", minute=" +getMinute() +
                ", seconds=" +getSeconds()+
                ", milliseconds=" + milliseconds +
                '}';
    }
}