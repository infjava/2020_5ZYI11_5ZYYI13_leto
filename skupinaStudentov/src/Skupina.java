import java.util.ArrayList;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
public class Skupina {
    private final String cisloSkupiny;
    private ArrayList<Student> studenti;

    public Skupina(String cisloSkupiny) {
        this.cisloSkupiny = cisloSkupiny;
        this.studenti = new ArrayList<>();
    }

    public void pridajStudenta(Student student) {
        this.studenti.add(student);
    }

    public void vypisStudentov() {
        System.out.printf("Cislo skupiny je %s%n", this.cisloSkupiny);
        for (Student student : this.studenti) {
            System.out.println(student);
        }
    }
}
