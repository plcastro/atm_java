package com.mycompany.atm;
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ATM {

    public static void main(String[] args) {

        Color pColor = new Color(79, 0, 91);
        
        JFrame frame = new JFrame();
        frame.setTitle("NAME OF ATM");
        frame.setSize(940, 620); //dimensions width, height
        frame.setVisible(true); //frame will be visible
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(pColor);
        panel.setSize(940, 620);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        
        button1.setBounds(100,100,100,100); //int x-coordinate, int y-coordinate, int width, int height
        button1.setSize(70, 70); //width, height
        button1.setVisible(true);

        button2.setBounds(210,100,200,200);
        button2.setSize(70, 70); //width, height
        button2.setVisible(true);

        button3.setBounds(320,100,300,300);
        button3.setSize(70, 70); //width, height
        button3.setVisible(true);
        
        frame.add(panel);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        
    }
}
