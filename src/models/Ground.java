package models;

public class Ground {
    private Position position;
    private int width;
    private int height;

    public Ground(Position position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ground{" +
                "position=" + position.toString() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
