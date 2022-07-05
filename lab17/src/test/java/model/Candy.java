package model;

public class Candy {
    private String name;
    private int energy;
    private String type;
    private Ingredients ingredients;
    private Value value;
    private String production;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Candy(String name, int energy, String type, Ingredients ingredients, Value value, String production) {
        this.name = name;
        this.energy = energy;
        this.type = type;
        this.ingredients = ingredients;
        this.value = value;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", type='" + type + '\'' +
                ", ingredients=" + ingredients +
                ", value=" + value +
                ", production='" + production + '\'' +
                '}'+'\n';
    }
}
