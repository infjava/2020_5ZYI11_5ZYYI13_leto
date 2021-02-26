import java.util.ArrayList;

/**
 * 25. 2. 2021 - 8:18
 *
 * @author janik
 */
public class Skupina {
    private final String cisloSkupiny;
    private final ArrayList<Student> studenti;

    public Skupina(String cisloSkupiny) {
        this.cisloSkupiny = cisloSkupiny;
        this.studenti = new ArrayList<>();
    }

    public String getCisloSkupiny() {
        return this.cisloSkupiny;
    }

    public int getPocetStudentov() {
        return this.studenti.size();
    }

    public void pridajStudenta(Student student) {
        for (Student kontrolovany : this.studenti) {
            if (kontrolovany.getOsobneCislo().equals(student.getOsobneCislo())) {
                return;
            }
        }

        this.studenti.add(student);
    }

    public void vypisStudentov() {
        System.out.printf("Cislo skupiny je %s%n", this.cisloSkupiny);
        for (Student student : this.studenti) {
            System.out.println(student);
        }
    }

    public void odoberStudenta(String osobneCislo) {
        for (Student student : this.studenti) {
            if (student.getOsobneCislo().equals(osobneCislo)) {
                this.studenti.remove(student);
                return;
            }
        }
    }

    public Student getStudent(String osobneCislo) {
        for (Student student : this.studenti) {
            if (student.getOsobneCislo().equals(osobneCislo)) {
                return student;
            }
        }
        return null;
    }
}
