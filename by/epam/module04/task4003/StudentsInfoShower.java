package by.epam.module04.task4003;

import java.util.Arrays;

public class StudentsInfoShower {
    private static final StudentsInfoShower instance = new StudentsInfoShower();

    private StudentsInfoShower(){
    }

    public static StudentsInfoShower getInstance(){
        return instance;
    }

    public void printStudents(Student[] students) {
        for(Student student : students) {
            System.out.println(studentSurname(student) + " " + student.getGroupNumber());
        }
    }

    public void printStudentsAllInfo(Student[] students) {
        for(Student student : students) {
            System.out.println(studentSurname(student) + " " + student.getGroupNumber()+" gr. Academic performance: "+ Arrays.toString(student.getAcademicPerformance()));
        }
    }

    public String studentSurname(Student student) {
        return student.getSurnameAndInitials().substring(0, student.getSurnameAndInitials().indexOf(" "));
    }
}
