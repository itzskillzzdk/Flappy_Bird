package models;

import config.GameConfiguration;

public class Bird {

    private Position position;
    private final int size;

    public Bird(Position position, int size) {
        this.position = position;
        this.size = size;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "position=" + position.toString() +
                ", size=" + size +
                '}';
    }
}
