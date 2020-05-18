package building;

//базовый класс для предметов внутри комнаты
public abstract class Interiors {
    private String name;
    private double square;

    public Interiors(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return name + " площадь " + square + " м^2";
    }
}
