package by.epam.module04.task4003;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Main {
    public static void main(String[] args) {
        Student[] students;
        Student[] excellentStudents;

        StudentsInfoShower studentsInfoShower;
        StudentsDataInput input;
        StudentsLogic studentsLogic;

        studentsInfoShower = StudentsInfoShower.getInstance();
        input = StudentsDataInput.getInstance();
        studentsLogic = StudentsLogic.getInstance();

        students = input.defaultArrayOfStudents();
        studentsInfoShower.printStudentsAllInfo(students);

        excellentStudents = studentsLogic.excellentStudents(students);
        System.out.println("\nExcellent students:");
        studentsInfoShower.printStudents(excellentStudents);


    }
}
