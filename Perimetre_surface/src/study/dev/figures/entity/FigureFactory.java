package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

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
}
