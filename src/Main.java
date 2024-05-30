import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Buyer
        Buyer buyer = new Buyer(0);

        // Встановлення капіталу з клавіатури
        buyer.setBuyer();

        // Виводимо капітал покупця
        System.out.println("Капітал покупця: " + buyer.getCapital() + "$");

        // Створення колекції ігор
        GameCollection gameCollection = new GameCollection();
        gameCollection.addGame(new Game("The Witcher 3: Wild Hunt", 49.99, 2015));
        gameCollection.addGame(new Game("Cyberpunk 2077", 59.99, 2020));
        gameCollection.addGame(new Game("Red Dead Redemption 2", 39.99, 2018));
        gameCollection.addGame(new Game("God of War", 29.99, 2018));
        gameCollection.addGame(new Game("Horizon Zero Dawn", 19.99, 2017));

        Scanner scanner = new Scanner(System.in);

        // Введення бажаного року випуску гри
        System.out.println("Введіть мінімальний рік випуску гри:");
        int minYear = scanner.nextInt();

        // Введення максимальної ціни гри
        System.out.println("Введіть максимальну ціну гри:");
        double maxPrice = scanner.nextDouble();

        // Фільтрація ігор за ціною та роком
        List<Game> filteredGames = gameCollection.filterGamesByPriceAndYear(maxPrice, minYear);

        // Вивід відібраних ігор
        System.out.println("Відібрані ігри:");
        gameCollection.printGames(filteredGames);
    }
}