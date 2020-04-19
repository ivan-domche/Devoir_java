package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

import javax.swing.*;

public class FigureFactory {
    public static Figure getFigure(FigureType type) {
        Figure figure = null;
        switch (type) {
            case  CARRE :
                figure = new Carre();
                break;
            case RECTANGLE :
                figure = new Rectangle();
                break;
            case CERCLE :
                figure = new Cercle();
                break;
        }
        return figure;
    }

    public static Figure getFigure(FigureType type, JTextField t1, JTextField t2) {
        Figure figure = null;
        switch (type) {
            case  CARRE :
                float cote = Float.parseFloat(t1.getText());
                figure = new Carre(cote);
                break;
            case RECTANGLE :
                float longueur = Float.parseFloat(t1.getText());
                float largeur = Float.parseFloat(t2.getText());
                figure = new Rectangle(longueur, largeur);
                break;
            case CERCLE :
                float rayon = Float.parseFloat(t1.getText());
                figure = new Cercle(rayon);
                break;
        }
        return figure;
    }
}
