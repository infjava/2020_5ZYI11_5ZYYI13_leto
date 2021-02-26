import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
class SkupinaTest {

    private Skupina skupina;
    private Student jozkoMrkvicka;

    @BeforeEach
    void setUp() {
        this.skupina = new Skupina("123");
        this.jozkoMrkvicka = new Student("123", "Jozko", "Mrkvicka");
    }

    @Test
    void pridajStudenta() {
        this.skupina.pridajStudenta(this.jozkoMrkvicka);
        Student najdeny = this.skupina.getStudent("123");
        Assertions.assertNotNull(najdeny);
        Assertions.assertSame(this.jozkoMrkvicka, najdeny);
    }

    @Test
    void vypisStudentov() {
        this.skupina.vypisStudentov();
    }

    @Test
    void odoberStudenta() {
        this.skupina.pridajStudenta(this.jozkoMrkvicka);

        Student najdenyPredVymazanim = this.skupina.getStudent("123");
        Assertions.assertNotNull(najdenyPredVymazanim);

        this.skupina.odoberStudenta("123");

        Student najdenyPoVymazani = this.skupina.getStudent("123");
        Assertions.assertNull(najdenyPoVymazani);
    }

    @Test
    void getStudent() {
        Student najdeny = this.skupina.getStudent("123");
        Assertions.assertNull(najdeny);

        this.skupina.pridajStudenta(this.jozkoMrkvicka);

        Student najdenyPoPridani = this.skupina.getStudent("123");
        Assertions.assertNotNull(najdenyPoPridani);
    }
}