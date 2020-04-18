package study.dev.figures.entity;

import study.dev.figures.IFigures;
import study.dev.figures.enumeration.FigureType;

public abstract class Figure implements IFigures {
    protected FigureType type;

    public FigureType getType() {
        return type;
    }

    public void setType(FigureType type) {
        this.type = type;
    }

    public Figure getFigure(FigureType type) {
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
