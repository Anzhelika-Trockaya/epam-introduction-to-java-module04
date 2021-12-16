package by.epam.module04.task4006;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

public class Main {
    public static void main(String[] args) {
        Time time = new Time(23, 55, 55);
        System.out.println("Time: "+time.string()+"\n");

        time.setHours(10);
        System.out.print("Hours=10: ");
        System.out.println(time.string()+"\n");

        time.setMinutes(20);
        System.out.print("Minutes=20: ");
        System.out.println(time.string()+"\n");

        time.setSeconds(10);
        System.out.print("Seconds=10: ");
        System.out.println(time.string()+"\n");

        time.addSeconds(56);
        System.out.print("Add 56 seconds: ");
        System.out.println(time.string()+"\n");

        time.addMinutes(25);
        System.out.print("Add 25 minutes: ");
        System.out.println(time.string()+"\n");

        time.addMinutes(15);
        System.out.print("Add 15 minutes: ");
        System.out.println(time.string()+"\n");

        time.addHours(5);
        System.out.print("Add 5 hours: ");
        System.out.println(time.string()+"\n");

        time.addHours(10);
        System.out.print("Add 10 hours: ");
        System.out.println(time.string()+"\n");

        time.addSeconds(3600);
        System.out.print("Add 3600 seconds: ");
        System.out.println(time.string()+"\n");

        time.addSeconds(-56);
        System.out.print("Add -56 seconds: ");
        System.out.println(time.string()+"\n");

        time.addMinutes(-25);
        System.out.print("Add -25 minutes: ");
        System.out.println(time.string()+"\n");

        time.addMinutes(-100);
        System.out.print("Add -100 minutes: ");
        System.out.println(time.string()+"\n");

        time.addHours(-15);
        System.out.print("Add -15 hours: ");
        System.out.println(time.string()+"\n");
    }
}
