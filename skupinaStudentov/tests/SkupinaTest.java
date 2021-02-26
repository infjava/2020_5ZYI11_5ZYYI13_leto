import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
class SkupinaTest {

    private Skupina skupina;

    @BeforeEach
    void setUp() {
        this.skupina = new Skupina("123");
    }

    @Test
    void pridajStudenta() {
        Student pridany = new Student("123", "Jozko", "Mrkvicka");
        this.skupina.pridajStudenta(pridany);
        Student najdeny = this.skupina.getStudent("123");
        Assertions.assertNotNull(najdeny);
        Assertions.assertSame(pridany, najdeny);
    }

    @Test
    void vypisStudentov() {
    }

    @Test
    void odoberStudenta() {
    }

    @Test
    void getStudent() {
    }
}