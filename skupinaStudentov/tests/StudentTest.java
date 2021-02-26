import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        this.student = new Student("123", "Frantisek", "Mrkva");
    }

    @Test
    void getMeno() {
        Assertions.assertEquals("Frantisek", this.student.getMeno());
    }

    @Test
    void getPriezvisko() {
        Assertions.assertEquals("Mrkva", this.student.getPriezvisko());
    }
}
