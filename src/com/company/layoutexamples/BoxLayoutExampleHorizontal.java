package com.company.layoutexamples;

import javax.swing.*;

public class BoxLayoutExampleHorizontal extends JFrame {

    public BoxLayoutExampleHorizontal() {
        super("Box Layout Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JButton("Third"));
        add(new JButton("Fourth"));

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setVisible(true);
    }

    public static void main(final String[] args) {
        new BoxLayoutExampleHorizontal();
    }
}
