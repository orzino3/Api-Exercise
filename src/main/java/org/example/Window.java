package org.example;

import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.add(new Panel(0, 0, 1000, 800));
        this.setVisible(true);
    }
}