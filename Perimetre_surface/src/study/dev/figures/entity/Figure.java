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
}
