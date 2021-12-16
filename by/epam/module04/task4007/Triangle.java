package by.epam.module04.task4007;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.


import java.io.Serializable;

public class Triangle implements Serializable {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
        pointA = new Point();
        pointB = new Point();
        pointC = new Point();
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point pointA;
        Point pointB;
        Point pointC;

        pointA = new Point(x1, y1);
        pointB = new Point(x2, y2);
        pointC = new Point(x3, y3);

        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return pointA.equals(triangle.pointA) &&
                pointB.equals(triangle.pointB) &&
                pointC.equals(triangle.pointC);
    }

    @Override
    public int hashCode() {
        int result = pointA.hashCode();
        result = 31 * result + pointB.hashCode();
        result = 31 * result + pointC.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
