package model;

public class Value {
    private int belki;
    private int jiri;
    private int uglevodi;

    public int getBelki() {
        return belki;
    }

    public void setBelki(int belki) {
        this.belki = belki;
    }

    public int getJiri() {
        return jiri;
    }

    public void setJiri(int jiri) {
        this.jiri = jiri;
    }

    public int getUglevodi() {
        return uglevodi;
    }

    public void setUglevodi(int uglevodi) {
        this.uglevodi = uglevodi;
    }

    public Value(int belki, int jiri, int uglevodi) {
        this.belki = belki;
        this.jiri = jiri;
        this.uglevodi = uglevodi;
    }

    public Value(){}

    @Override
    public String toString() {
        return "Value{" +
                "belki=" + belki +
                ", jiri=" + jiri +
                ", uglevodi=" + uglevodi +
                '}';
    }
}
