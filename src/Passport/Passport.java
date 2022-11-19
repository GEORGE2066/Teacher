package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Passport {
    private Set<Passport> people = new HashSet();
    private final int number;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthday;

    public Passport(int number, String name, String surname, String patronymic, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

    private String check(String str) {
        if (str == null) {
            str = "";
        }
        if (str.isBlank()) {
            return "unknow";
        }
        return str;
    }

    private int check(int i) {
        if (i < 0) {
            Math.abs(i);
        }
        if (i < 1_000_000_000) {
            i += 1_000_000_000;
        }
        return i;
    }

    private LocalDate check(LocalDate localDate) {
        if (localDate == null) {
            return LocalDate.now();
        }
        return localDate;
    }

    public Passport find(int number) {
        Passport p = new Passport(number, null, null, null,null);
        if (!people.contains(p)) {
            return null;
        }
        for (Passport passport : people) {
            if (p.equals(passport)) {
                p = passport;
                break;
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}