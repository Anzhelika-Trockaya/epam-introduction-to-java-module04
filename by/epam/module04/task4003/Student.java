package by.epam.module04.task4003;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private static final int NUMBER_OF_OFFSETS = 5;

    private String surnameAndInitials;
    private int groupNumber;
    private int[] academicPerformance;


    public Student() {
        this.surnameAndInitials = "";
        this.groupNumber = 0;
        this.academicPerformance = new int[NUMBER_OF_OFFSETS];
    }

    public Student(String surnameAndInitials, int groupNumber) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = new int[NUMBER_OF_OFFSETS];
    }

    public Student(String surnameAndInitials, int groupNumber, int[] academicPerformance) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public void setSurnameAndInitials(String surnameAndInitials) {
        this.surnameAndInitials = surnameAndInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surnameAndInitials='" + surnameAndInitials + '\'' +
                ", groupNumber=" + groupNumber +
                ", academicPerformance=" + Arrays.toString(academicPerformance) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                surnameAndInitials.equals(student.surnameAndInitials) &&
                Arrays.equals(academicPerformance, student.academicPerformance);
    }

    @Override
    public int hashCode() {
        int result = surnameAndInitials.hashCode();
        result = 31 * result + Integer.hashCode(groupNumber);
        result = 31 * result + Arrays.hashCode(academicPerformance);
        return result;
    }


}
