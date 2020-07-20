package academy.belhard;

public class SchoolIsEmptyException extends Exception {
    private static final String EXCEPTION_MESSAGE = "School is empty!";

    public SchoolIsEmptyException() {
        super(EXCEPTION_MESSAGE);
    }
}
