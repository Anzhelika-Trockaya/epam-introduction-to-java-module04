package by.epam.module04.task4007;

import java.io.Serializable;

public class Point implements Serializable {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return point.x == x &&
                point.y == y;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result = result * 31 + Double.hashCode(y);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
