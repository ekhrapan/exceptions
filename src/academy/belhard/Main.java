package academy.belhard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        School school = new School();

        try {
            System.out.println(school.calculateGpa());
        } catch (SchoolIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        Pupil p1 = new Pupil("Mike", BigDecimal.valueOf(8.72));
        Pupil p2 = new Pupil("Tom", BigDecimal.valueOf(6.53));
        Pupil p3 = new Pupil("Sarah", BigDecimal.valueOf(8.02));

        school.addPupil(p1);
        school.addPupil(p2);
        school.addPupil(p3);

        try {
            System.out.println(school.calculateGpa());
        } catch (SchoolIsEmptyException e) {
            System.out.println("School is empty!");
        }
    }
}
