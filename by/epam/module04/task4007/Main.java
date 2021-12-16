package by.epam.module04.task4007;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TriangleLogic triangleLogic;
        InfoShower infoShower;
        Triangle triangle1;
        Triangle triangle2;
        Point point1;
        Point point2;

        triangleLogic = new TriangleLogic();
        infoShower = new InfoShower();

        triangle1 = triangleLogic.createTriangle(8, 10, 6);

        infoShower.print("Triangle 1: ");
        infoShower.print(triangle1);
        infoShower.print("Sides = " + Arrays.toString(triangleLogic.findSides(triangle1)));
        infoShower.print("P = " + triangleLogic.findPerimeter(triangle1));
        infoShower.print("S = " + triangleLogic.findSquare(triangle1));

        point1 = triangleLogic.medianIntersectionPoint(triangle1);
        infoShower.print("Point of median intersection: ");
        infoShower.print(point1);
        infoShower.print("\n");

        triangle2 = triangleLogic.createTriangle(2, -2, 8, -2, 5, -6);

        infoShower.print("Triangle 2: ");
        infoShower.print(triangle2);
        infoShower.print("Sides = " + Arrays.toString(triangleLogic.findSides(triangle2)));
        infoShower.print("P = " + triangleLogic.findPerimeter(triangle2));
        infoShower.print("S = " + triangleLogic.findSquare(triangle2));

        point2 = triangleLogic.medianIntersectionPoint(triangle2);

        infoShower.print("Point of median intersection: ");
        infoShower.print(point2);
    }
}
