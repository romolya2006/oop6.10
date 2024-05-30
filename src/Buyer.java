import java.util.Scanner;

public class Buyer {
    private double capital;

    public Buyer(double capital) {
        this.capital = capital;
    }

    public double getCapital() {
        return capital;
    }

    public void setBuyer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть капітал покупця:");
        this.capital = scanner.nextDouble();
    }
}