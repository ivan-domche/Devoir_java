package study.dev.figures.gui;

import study.dev.figures.entity.Figure;
import study.dev.figures.entity.FigureFactory;
import study.dev.figures.enumeration.FigureType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel PanelMain;
    private JPanel headerPanel;
    private JPanel LabelPanel;
    private JPanel FieldPanel;
    private JPanel bottomPanel;
    private JTextField textField1;
    private JComboBox chooseTypeComboBox;
    private JTextField textField2;
    private JButton perimetreButton;
    private JButton surfaceButton;
    private JTextField resultFiled;

    public App() {
        perimetreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figure figure = FigureFactory.getFigure(FigureType.RECTANGLE);
                resultFiled.setText(figure.perimetre() + "");
            }
        });
        surfaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figure figure = FigureFactory.getFigure(FigureType.RECTANGLE);
                resultFiled.setText(figure.surface() + "");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JPanel getPanelMain() {
        return PanelMain;
    }
}
