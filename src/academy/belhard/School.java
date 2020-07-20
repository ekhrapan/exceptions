package academy.belhard;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Pupil> pupils;

    public School() {
        pupils = new ArrayList<>();
    }

    public BigDecimal calculateGpa() throws SchoolIsEmptyException {
        if (pupils.isEmpty()) {
            throw new SchoolIsEmptyException();
        }

        BigDecimal gpaSum = BigDecimal.ZERO;
        for (Pupil pupil : pupils) {
            gpaSum = gpaSum.add(pupil.getGpa());
        }

        BigDecimal pupilsCount = BigDecimal.valueOf(pupils.size());

        return gpaSum.divide(pupilsCount, 3, RoundingMode.HALF_UP);
    }

    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }
}
