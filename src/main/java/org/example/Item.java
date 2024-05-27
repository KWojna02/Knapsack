package org.example;

public class Item {
    private final int id;
    private final int weight;
    private final int value;
    private final double ratio;

    public Item(int _id, int _value, int _weight) {
        id = _id;
        value = _value;
        weight = _weight;
        ratio = (double) _value / (double) _weight;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public double getRatio() {
        return ratio;
    }
}
