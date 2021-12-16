package by.epam.module04.task4007;

public class InfoShower {
    public void print(Triangle triangle){
        System.out.println(triangleToString(triangle));
    }

    public void print(Point point){
        System.out.printf("(%.1f;%.1f)", point.getX(), point.getY());
        System.out.println();
    }

    private String pointToString(Point point){
        return String.format("(%.1f;%.1f)", point.getX(), point.getY());
    }

    private String triangleToString(Triangle triangle){
        return "Triangle: coordinates of vertices: "
                + pointToString(triangle.getPointA()) + " , "
                + pointToString(triangle.getPointB()) + " , "
                + pointToString(triangle.getPointC()) + "}";
    }

    public void print(String message){
        System.out.println(message);
    }

}
