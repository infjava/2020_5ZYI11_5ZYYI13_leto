import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
class StudentTest {

    @Test
    void getMeno() {
        Student s = new Student("123", "Frantisek", "Mrkva");
        Assertions.assertEquals("Frantisek", s.getMeno());
    }
}
