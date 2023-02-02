package Composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
    String getName();

    double getPrice();

    String toString();
}

class Composite implements Component {
    double price;
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public String getName() {
        String items = name + " which contains: ";

        for (Component c : components) {
            items += c.getName() + ", ";
        }
        items = items.substring(0, items.length() - 2);

        return items;
    }

    public double getPrice() {
        double total = price;
        for (Component c : components) {
            total += c.getPrice();
        }
        return total;
    }

    public String toString() {
        return getName() + ". Total price: $" + getPrice();
    }
}

class Leaf implements Component {
    double price;
    String name;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + ", $" + price;
    }
}