package main.java.com.company;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() { return this.x; }

    public int getY() { return this.y; }

    @Override
    public String toString() {
        return this.getX() + " " + this.getY();
    }
}
