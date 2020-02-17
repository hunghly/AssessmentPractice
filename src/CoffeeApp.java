import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {
    public ArrayList<Coffee> coffeeList;

    public CoffeeApp() {
        this.coffeeList = new ArrayList<>();
    }

    public void addCoffee(Coffee newCoffee) {
        this.coffeeList.add(newCoffee);
    }

    public void addCoffee(int index, Coffee newCoffee) {
        this.coffeeList.add(index, newCoffee);
    }

    public void removeCoffee(Coffee removeCoffee) {
        this.coffeeList.remove(removeCoffee);
    }

    public void removeCoffee(int index) {
        this.coffeeList.remove(index);
    }

    public List<String> readFromFile(Path file) throws IOException {
        List<String> readLines = new ArrayList<>();
        readLines = Files.readAllLines(file);
        return readLines;
    }

    public static void main(String[] args) {
        Coffee cappucino = new Coffee("cappucino", "medium", 1);
        Coffee texasPecan = new Coffee("texas pecan", "medium", 2);
        Coffee mocha = new Coffee("mocha", "light", 3);
        Path coffeeFile = Paths.get("src","coffees.txt");
        CoffeeApp app = new CoffeeApp();

        app.addCoffee(cappucino);
        app.addCoffee(1, texasPecan);
        app.addCoffee(0, mocha);

        for (Coffee coffee : app.coffeeList) {
            System.out.println(coffee.getName());
            System.out.println(coffee.getRoast());
            System.out.println(coffee.getId());
        }

        System.out.println("------------------");

        app.removeCoffee(1);
        app.removeCoffee(mocha);

        for (Coffee coffee : app.coffeeList) {
            System.out.println(coffee.getName());
            System.out.println(coffee.getRoast());
            System.out.println(coffee.getId());
        }

        try {
            app.readFromFile(coffeeFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
