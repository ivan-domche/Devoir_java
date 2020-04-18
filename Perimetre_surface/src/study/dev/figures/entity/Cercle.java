package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Cercle extends Figure {
    private double rayon;

    public Cercle() {
        this.setType(FigureType.CERCLE);
    }

    public Cercle(double rayon) {
        this.setType(FigureType.CERCLE);
        this.rayon = rayon;
    }

    @Override
    public void perimetre() {

    }

    @Override
    public void surface() {

    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
