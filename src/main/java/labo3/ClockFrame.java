package labo3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockFrame {

    JFrame frame; //головне вікно
    JPanel panel;// головна панель
    JLabel label; //  текстове поле

        public ClockFrame() {
        this.frame = new JFrame("Clock"); //створюємо вікно
        this.label = new JLabel(); //створюємо текстове поле
        this.panel = new JPanel(); //створюємо панель

        panel.add(label); //додаємо текстове поле на панель

        frame.setSize(300,85); //розмір вікна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //щоб працювало закриття через хрестик

        frame.add(panel,BorderLayout.CENTER); //вирівнювання панелі по центрі
        panel.add(label,BorderLayout.CENTER); //вирівнювання текстового поля по центі

        ClockExt clock = new ClockExt(22, 59, 59); //створення годиннику

        Timer timer = new Timer(1000, A  -> { //таймер на 1 секунд

            clock.nextSecond(); //додаємо секунду
            label.setText(clock.toString()); //оновлення
        });

        timer.start(); //запуск таймеру

        frame.setVisible(true); //робить вікно видним
    }
}
