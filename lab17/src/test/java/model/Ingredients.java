package model;

public class Ingredients {
    private int water;
    private int sugar;
    private int fruktoza;
    private String typechocoloate;
    private int vanilin;


    public Ingredients(int water, int sugar, int fruktoza, String typechocoloate, int vanilin) {
        this.water = water;
        this.sugar = sugar;
        this.fruktoza = fruktoza;
        this.typechocoloate = typechocoloate;
        this.vanilin = vanilin;
    }

    public Ingredients(){}

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFruktoza() {
        return fruktoza;
    }

    public void setFruktoza(int fruktoza) {
        this.fruktoza = fruktoza;
    }

    public String getTypechocoloate() {
        return typechocoloate;
    }

    public void setTypechocoloate(String typechocoloate) {
        this.typechocoloate = typechocoloate;
    }

    public int getVanilin() {
        return vanilin;
    }

    public void setVanilin(int vanilin) {
        this.vanilin = vanilin;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "water=" + water +
                ", sugar=" + sugar +
                ", fruktoza=" + fruktoza +
                ", typechocoloate='" + typechocoloate + '\'' +
                ", vanilin=" + vanilin +
                '}';
    }
}
