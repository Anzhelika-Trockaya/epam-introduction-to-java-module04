package by.epam.module04.task4003;

public class StudentsDataInput {
    private static final StudentsDataInput instance = new StudentsDataInput();

    private StudentsDataInput() {
    }

    public static StudentsDataInput getInstance() {
        return instance;
    }

   public Student[] defaultArrayOfStudents(){
       Student[] students= new Student[10];

       students[0] = new Student("Zayats E.V.", 1, new int[]{10, 9, 10, 9, 10});
       students[1] = new Student("Ivanova N.S.", 2, new int[]{10, 8, 10, 9, 10});
       students[2] = new Student("Petrov P.S.", 3, new int[]{7, 9, 6, 4, 6});
       students[3] = new Student("Kuzmina O.A.", 1, new int[]{10, 10, 10, 10, 7});
       students[4] = new Student("Chernenko E.A.", 2, new int[]{9, 9, 9, 9, 9});
       students[5] = new Student("Yundzil M.I.", 1, new int[]{1, 2, 1, 3, 2});
       students[6] = new Student("Ivanov I.I.", 4, new int[]{5, 4, 3, 6, 6});
       students[7] = new Student("Trotskaya A.V.", 4, new int[]{10, 10, 10, 10, 10});
       students[8] = new Student("Dmitrenko V.V.", 1, new int[]{6, 9, 7, 9, 10});
       students[9] = new Student("Ikasalo L.L.", 3, new int[]{8, 9, 8, 9, 8});

       return students;
   }
}
