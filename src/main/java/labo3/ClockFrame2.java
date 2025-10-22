package labo3;

import javax.swing.*;
import java.awt.*;

public class ClockFrame2 {
    JFrame frame; //головне вікно
    JPanel panel;// головна панель
    JLabel label;//  текстове поле

    public ClockFrame2() {
        this.frame = new JFrame("Clock"); //створюємо вікно
        this.label = new JLabel(); //створюємо текстове поле
        this.panel = new JPanel(); //створюємо панель

        panel.add(label); //додаємо текстове поле на панель

        frame.setSize(800,95); //розмір вікна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //щоб працювало закриття через хрестик

        label.setFont(new Font("Times New Roman",Font.ITALIC,25)); //шрифт тексту
        panel.setBackground(Color.pink); //колір панелі

        frame.add(panel,BorderLayout.CENTER); //вирівнювання панелі по центрі
        panel.add(label,BorderLayout.CENTER); //вирівнювання текстового поля по центі

        ClockExt2 clock = new ClockExt2(12, 59,59, 700); //створення годиннику

        Timer timer = new Timer(1000, A  -> { //таймер на 1 секунд

            clock.nextMilliseconds(); //додаємо секунду
            label.setText(clock.toString()); //оновлення
        });

        timer.start(); //запуск таймеру

        frame.setVisible(true); //робить вікно видним
    }
}
