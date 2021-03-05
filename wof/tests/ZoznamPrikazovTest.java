import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author janik
 */
public class ZoznamPrikazovTest {

    private ZoznamPrikazov nazvyPri1;

    @BeforeEach
    public void setUp() {
        this.nazvyPri1 = new ZoznamPrikazov();
    }

    @Test
    public void jePrikaz() {
        Assertions.assertTrue(this.nazvyPri1.jePrikaz("chod"));
        Assertions.assertTrue(this.nazvyPri1.jePrikaz("ukonci"));
        Assertions.assertTrue(this.nazvyPri1.jePrikaz("pomoc"));
        Assertions.assertFalse(this.nazvyPri1.jePrikaz("ukaz"));
    }
}
