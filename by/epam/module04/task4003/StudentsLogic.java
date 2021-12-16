package by.epam.module04.task4003;

public class StudentsLogic {
    private static final StudentsLogic instance = new StudentsLogic();

    private StudentsLogic() {
    }

    public static StudentsLogic getInstance() {
        return instance;
    }

    public boolean isExcellentStudent(Student student) {
        for (int grade : student.getAcademicPerformance()) {
            if (grade < 9) {
                return false;
            }
        }

        return true;
    }

    public int numberOfExcellentStudents(Student[] students) {
        int number = 0;

        for (Student student : students) {
            if (isExcellentStudent(student)) {
                number++;
            }
        }

        return number;
    }

    public Student[] excellentStudents(Student[] students) {
        Student[] excellentStudents = null;
        int numberOfExcellentStudents;
        int currentIndex;

        numberOfExcellentStudents = numberOfExcellentStudents(students);

        if (numberOfExcellentStudents > 0) {
            excellentStudents = new Student[numberOfExcellentStudents];
            currentIndex = 0;

            for (Student student : students) {
                if (isExcellentStudent(student)) {
                    excellentStudents[currentIndex] = student;
                    currentIndex++;
                }
            }
        }

        return excellentStudents;
    }

}
