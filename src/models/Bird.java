package models;

public class Bird {

    private final int x;
    private final int y;
    private final int size;

    public Bird(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
