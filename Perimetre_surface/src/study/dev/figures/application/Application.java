package study.dev.figures.application;

import study.dev.figures.gui.App;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mon Gestionnaire de Figure");
        frame.setContentPane(new App().getPanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.pack();
        frame.setVisible(true);
    }
}
