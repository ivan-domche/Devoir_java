package study.dev.figures.gui;

import study.dev.figures.entity.Figure;
import study.dev.figures.entity.FigureFactory;
import study.dev.figures.enumeration.FigureType;
import study.dev.figures.validator.AppValidator;
import study.dev.figures.validator.IModelValidator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App  {
    private  static App instance;
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
    private IModelValidator validator;

    private App() {
        this.chooseTypeComboBox.addItem(FigureType.RECTANGLE);
        this.chooseTypeComboBox.addItem(FigureType.CARRE);
        this.chooseTypeComboBox.addItem(FigureType.CERCLE);

        validator = new AppValidator();
        perimetreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validator.validate(App.getInstance());
                if (validator.isValid()) {
                    Figure figure = FigureFactory.getFigure((FigureType) chooseTypeComboBox.getSelectedItem(), textField1, textField2);
                    resultFiled.setText(figure.perimetre() + "");
                }
            }
        });
        surfaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validator.validate(App.getInstance());
                if (validator.isValid()) {
                    Figure figure = FigureFactory.getFigure((FigureType) chooseTypeComboBox.getSelectedItem(), textField1, textField2);
                    resultFiled.setText(figure.surface() + "");
                }
            }
        });

        chooseTypeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textField1.setVisible(true);
                FigureType type = (FigureType) e.getItem();
                if (type != FigureType.RECTANGLE) {
                    textField1.setVisible(false);
                }
            }
        });
    }

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JPanel getPanelMain() {
        return PanelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        PanelMain = panelMain;
    }

    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public void setHeaderPanel(JPanel headerPanel) {
        this.headerPanel = headerPanel;
    }

    public JPanel getLabelPanel() {
        return LabelPanel;
    }

    public void setLabelPanel(JPanel labelPanel) {
        LabelPanel = labelPanel;
    }

    public JPanel getFieldPanel() {
        return FieldPanel;
    }

    public void setFieldPanel(JPanel fieldPanel) {
        FieldPanel = fieldPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JComboBox getChooseTypeComboBox() {
        return chooseTypeComboBox;
    }

    public void setChooseTypeComboBox(JComboBox chooseTypeComboBox) {
        this.chooseTypeComboBox = chooseTypeComboBox;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JButton getPerimetreButton() {
        return perimetreButton;
    }

    public void setPerimetreButton(JButton perimetreButton) {
        this.perimetreButton = perimetreButton;
    }

    public JButton getSurfaceButton() {
        return surfaceButton;
    }

    public void setSurfaceButton(JButton surfaceButton) {
        this.surfaceButton = surfaceButton;
    }

    public JTextField getResultFiled() {
        return resultFiled;
    }

    public void setResultFiled(JTextField resultFiled) {
        this.resultFiled = resultFiled;
    }
}
