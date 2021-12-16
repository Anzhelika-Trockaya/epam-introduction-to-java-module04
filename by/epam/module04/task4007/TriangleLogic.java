package by.epam.module04.task4007;

public class TriangleLogic {
    public TriangleLogic(){
    }

    public Triangle createTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Triangle triangle = null;

        if (isExistTriangle(x1, y1, x2, y2, x3, y3)) {
            triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        }

        return triangle;
    }

    public Triangle createTriangle(double sideA, double sideB, double sideC) {
        Point pointA;
        Point pointB;
        Point pointC;
        double cX;
        double cY;
        Triangle triangle = null;

        if (isExistTriangle(sideA, sideB, sideC)) {
            pointA = new Point();
            pointB = new Point(sideA, 0);

            cX = (sideC * sideC - sideB * sideB - sideA * sideA) / (-2 * sideA);
            cY = Math.sqrt(sideB * sideB - cX * cX);
            pointC = new Point(cX, cY);

            triangle = new Triangle(pointA, pointB, pointC);
        }

        return triangle;
    }

    public Triangle createTriangle(Point pointA, Point pointB, Point pointC) {
        Triangle triangle = null;

        if (isExistTriangle(pointA, pointB, pointC)) {
            triangle = new Triangle(pointA, pointB, pointC);
        }

        return triangle;
    }

    public boolean isExistTriangle(double sideAB, double sideBC, double sideAC) {
        return sideAB > 0 && sideBC > 0 && sideAC > 0 &&
                sideAB + sideBC > sideAC && sideAB + sideAC > sideBC && sideBC + sideAC > sideAB;
    }

    public boolean isExistTriangle(Point pointA, Point pointB, Point pointC) {
        double[] sides;

        sides = findSides(pointA, pointB, pointC);

        return isExistTriangle(sides[0], sides[1], sides[2]);
    }

    public boolean isExistTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        return isExistTriangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    private double[] findSides(Point pointA, Point pointB, Point pointC) {
        PointLogic pointLogic;
        double[] sides;

        pointLogic=new PointLogic();
        sides = new double[3];
        sides[0] = pointLogic.distanceBetweenPoints(pointA, pointB);
        sides[1] = pointLogic.distanceBetweenPoints(pointB, pointC);
        sides[2] = pointLogic.distanceBetweenPoints(pointA, pointC);

        return sides;
    }

    public double[] findSides(Triangle triangle) {
        PointLogic pointLogic;
        double[] sides;

        pointLogic=new PointLogic();
        sides = new double[3];
        sides[0] = pointLogic.distanceBetweenPoints(triangle.getPointA(), triangle.getPointB());
        sides[1] = pointLogic.distanceBetweenPoints(triangle.getPointB(), triangle.getPointC());
        sides[2] = pointLogic.distanceBetweenPoints(triangle.getPointA(), triangle.getPointC());

        return sides;
    }

    public double findSquare(Triangle triangle) {
        double square;
        double p;
        double[] sides;

        if (triangle != null) {
            sides = findSides(triangle.getPointA(), triangle.getPointB(), triangle.getPointC());
            p = findPerimeter(sides) / 2;
            square = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));

            return square;
        } else{
            throw new IllegalArgumentException("Triangle is null!");
        }
    }

    public double findPerimeter(Triangle triangle) {
        double perimeter;
        double[] sides;

        sides = findSides(triangle.getPointA(), triangle.getPointB(), triangle.getPointC());
        perimeter = sides[0] + sides[1] + sides[2];

        return perimeter;
    }

    private double findPerimeter(double[] sides) {
        return sides[0] + sides[1] + sides[2];
    }

    public Point medianIntersectionPoint(Triangle triangle) {
        double x;
        double y;
        Point medianIntersection;

        x = (triangle.getPointA().getX() + triangle.getPointB().getX() + triangle.getPointC().getX()) / 3;
        y = (triangle.getPointA().getY() + triangle.getPointB().getY() + triangle.getPointC().getY()) / 3;
        medianIntersection = new Point(x, y);

        return medianIntersection;
    }
}
