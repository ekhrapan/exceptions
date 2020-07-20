package academy.belhard;

import java.math.BigDecimal;

public class Pupil {
    private String name;
    private BigDecimal gpa;

    public Pupil(String name, BigDecimal gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getGpa() {
        return gpa;
    }

    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
    }
}
