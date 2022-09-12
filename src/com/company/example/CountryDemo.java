package com.company.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Country {
    private static final String[] COUNTRIES = { "Ethiopia", "Turkey", "Greece", "Iraq", "Serbia", "Colombia" };
    private static final String[] CAPITALS = { "Addis Ababa", "Ankara", "Athens", "Baghdad", "Belgrade", "Bogota" };
    public void start() {
        JFrame frame = createFrame();

        JComboBox<String> comboBox = createComboBox();
        frame.add(comboBox);

        JLabel capitalLabel = createLabel(comboBox.getSelectedIndex());
        frame.add(capitalLabel);

        comboBox.addActionListener(e -> capitalLabel.setText(CAPITALS[comboBox.getSelectedIndex()]));

        frame.setVisible(true);
    }

    private JLabel createLabel(int selectedIndex) {
        JLabel label = new JLabel();
        label.setText(CAPITALS[selectedIndex]);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        return label;
    }

    private JFrame createFrame() {
        JFrame frame = new JFrame("Country");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;
    }

    private JComboBox<String> createComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(COUNTRIES);
        JComboBox<String> comboBox = new JComboBox<>(model);
        comboBox.setSelectedIndex(0); // choose the default option

        return comboBox;
    }
}

public class CountryDemo {
    public static void main(String[] args) {
        Country country = new Country();
        country.start();
    }
}
