public class Game {
    private String name;
    private double price;
    private int year;

    public Game(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Game: " + name + ", Price: $" + price + ", Year: " + year;
    }
}