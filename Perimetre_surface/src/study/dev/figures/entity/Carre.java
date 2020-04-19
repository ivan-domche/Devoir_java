package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Carre extends Figure {
    private double cote;

    public Carre() {
        this.setType(FigureType.CARRE);
    }

    public Carre(double cote) {
        this.setType(FigureType.CARRE);
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return 1;
    }

    @Override
    public double surface() {
        return 1;
    }


    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }
}
