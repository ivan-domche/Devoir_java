/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Ivan Domche
 */
public class Gestionnaire extends JFrame implements ItemListener, ActionListener {
    private Container contenu = getContentPane();

    private JLabel gestLabel;

    private JLabel TypeLabel;

    private JTextField donne1Field;

    private JTextField donne2Field;

    private JTextField affichageField;

    private JButton perimetreButton;

    private JButton surfaceButton;

    private JComboBox typeComboBox;
  
    private Font police = new Font("Times new roman", 2, 20);
  
    public Gestionnaire() {
        setSize(500, 350);
        setTitle("Mon Gestionnaire de Figure");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setResizable(false);
        this.contenu.setLayout((LayoutManager)null);
        this.contenu.setBackground(Color.BLUE);
        this.gestLabel = new JLabel("Gestionnaire de figure");
        this.TypeLabel = new JLabel("Type");
        this.donne1Field = new JTextField();
        this.donne2Field = new JTextField();
        this.affichageField = new JTextField();
        this.perimetreButton = new JButton("Perimetre");
        this.surfaceButton = new JButton("Surface");
        this.typeComboBox = new JComboBox(new Object[] { "Rectangle", "Carre", "Cercle" });
        this.gestLabel.setBounds(150, 20, 200, 29);
        this.TypeLabel.setBounds(25, 80, 149, 29);
        this.typeComboBox.setBounds(250, 80, 200, 40);
        this.donne1Field.setBounds(25, 140, 150, 40);
        this.donne2Field.setBounds(250, 140, 200, 40);
        this.perimetreButton.setBounds(25, 220, 120, 30);
        this.surfaceButton.setBounds(250, 220, 200, 30);
        this.affichageField.setBounds(150, 270, 250, 30);
        this.gestLabel.setFont(this.police);
        this.TypeLabel.setFont(this.police);
        this.typeComboBox.setFont(this.police);
        this.donne1Field.setFont(this.police);
        this.donne2Field.setFont(this.police);
        this.perimetreButton.setFont(this.police);
        this.surfaceButton.setFont(this.police);
        this.affichageField.setFont(this.police);
        this.gestLabel.setForeground(Color.WHITE);
        this.TypeLabel.setForeground(Color.white);
        this.affichageField.setEditable(false);
        this.contenu.add(this.gestLabel);
        this.contenu.add(this.TypeLabel);
        this.contenu.add(this.typeComboBox);
        this.contenu.add(this.donne1Field);
        this.contenu.add(this.donne2Field);
        this.contenu.add(this.perimetreButton);
        this.contenu.add(this.affichageField);
        this.contenu.add(this.surfaceButton);
        this.typeComboBox.addItemListener(this);
        this.perimetreButton.addActionListener(this);
        this.surfaceButton.addActionListener(this);
    }
  
    public void itemStateChanged(ItemEvent e) {
      if (e.getItem().toString().equalsIgnoreCase("rectangle")) {
        this.donne2Field.setEditable(true);
      } else {
        this.donne2Field.setEditable(false);
      } 
    }
  
    public void actionPerformed(ActionEvent e) {
      if (e.getSource().equals(this.perimetreButton)) {
        String type = this.typeComboBox.getSelectedItem().toString();
        if (type.equalsIgnoreCase("rectangle")) {
          double longueur = Double.parseDouble(this.donne1Field.getText());
          double largeur = Double.parseDouble(this.donne2Field.getText());
          this.affichageField.setText("P = " + ((longueur + largeur) * 2.0D));
        } 
        if (type.equalsIgnoreCase("carre")) {
          double cote = Double.parseDouble(this.donne1Field.getText());
          this.affichageField.setText("P = " + (cote * 4.0D));
        } 
        if (type.equalsIgnoreCase("cercle")) {
          double rayon = Double.parseDouble(this.donne1Field.getText());
          this.affichageField.setText("P = " + (2.0D * rayon * Math.PI));
        } 
      } 
      if (e.getSource().equals(this.surfaceButton)) {
        String type = this.typeComboBox.getSelectedItem().toString();
        if (type.equalsIgnoreCase("rectangle")) {
          double longueur = Double.parseDouble(this.donne1Field.getText());
          double largeur = Double.parseDouble(this.donne2Field.getText());
          this.affichageField.setText("S = " + (longueur * largeur));
        } 
        if (type.equalsIgnoreCase("carre")) {
          double cote = Double.parseDouble(this.donne1Field.getText());
          this.affichageField.setText("S = " + (cote * cote));
        } 
        if (type.equalsIgnoreCase("cercle")) {
          double rayon = Double.parseDouble(this.donne1Field.getText());
          this.affichageField.setText("S = " + ((float)rayon * rayon * Math.PI));
        } 
      } 
    }   
}
