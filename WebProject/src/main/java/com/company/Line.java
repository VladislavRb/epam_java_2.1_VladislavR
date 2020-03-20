package main.java.com.company;

public class Line {
    private Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line() {
        this(new Point(), new Point());
    }

    public Point getStartPoint() {
        return this.startPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    @Override
    public String toString() {
        int deltaX = this.endPoint.getX() - this.startPoint.getX();
        int deltaY = this.endPoint.getY() - this.startPoint.getY();

        return "point (" + this.startPoint.toString() +
                "), lead. vector: (" + deltaX + " " + deltaY + ")";
    }
}
