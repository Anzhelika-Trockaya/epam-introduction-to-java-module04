package by.epam.module04.task4006;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

import java.io.Serializable;
import java.util.Objects;

public class Time implements Serializable {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else if (hours >= 24) {
            this.hours = hours % 24;
        } else {
            this.hours = 24 + hours % 24;
        }

        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else if (minutes >= 60) {
            this.minutes = minutes % 60;
        } else {
            this.minutes = 60 + minutes % 60;
        }

        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else if (seconds >= 60) {
            this.seconds = seconds % 60;
        } else {
            this.seconds = 60 + seconds % 60;
        }
    }

    public Time(int hours, int minutes) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else if (hours >= 24) {
            this.hours = hours % 24;
        } else {
            this.hours = 24 + hours % 24;
        }

        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else if (minutes >= 60) {
            this.minutes = minutes % 60;
        } else {
            this.minutes = 60 + minutes % 60;
        }

        this.seconds = 0;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else if (hours >= 24) {
            this.hours = hours % 24;
        } else {
            this.hours = 24 + hours % 24;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else if (minutes >= 60) {
            this.minutes = minutes % 60;
        } else {
            this.minutes = 60 + minutes % 60;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else if (seconds >= 60) {
            this.seconds = seconds % 60;
        } else {
            this.seconds = 60 + seconds % 60;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void addSeconds(int value) {
        int result;
        int minutes;
        int numberSecondsInOneMinute;

        numberSecondsInOneMinute = 60;
        result = seconds + value;
        minutes = result / numberSecondsInOneMinute;
        result = result - minutes * numberSecondsInOneMinute;

        if (result >= 0) {
            seconds = result;
        } else {
            addMinutes(-1);
            seconds = numberSecondsInOneMinute + result;
        }

        if (minutes != 0) {
            addMinutes(minutes);
        }

    }

    public void addMinutes(int value) {
        int result;
        int hours;
        int numberMinutesInOneHour;

        numberMinutesInOneHour = 60;
        result = minutes + value;
        hours = result / numberMinutesInOneHour;
        result = result - hours * numberMinutesInOneHour;

        if (result >= 0) {
            minutes = result;
        } else {
            addHours(-1);
            minutes = numberMinutesInOneHour + result;
        }

        if (hours != 0) {
            addHours(hours);
        }
    }

    public void addHours(int value) {
        int result;

        result = (hours + value) % 24;

        if (result >= 0) {
            hours = result;
        } else {
            hours = 24 + result;
        }
    }

    public String string() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
