package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Carre extends Figure {
    private float cote;

    public Carre() {
        this.setType(FigureType.CARRE);
    }

    public Carre(float cote) {
        this.setType(FigureType.CARRE);
        this.cote = cote;
    }

    @Override
    public float perimetre() {
        return 4 * cote;
    }

    @Override
    public float surface() {
        return cote * cote;
    }


    public float getCote() {
        return cote;
    }

    public void setCote(float cote) {
        this.cote = cote;
    }
}
