/**
 * Created by IntelliJ IDEA.
 * User: janik
 * Date: 25. 2. 2021
 * Time: 8:18
 */
public class Main {

    public static void main(String[] args) {
        Student janko = new Student("1001120", "Jan", "Janech");
        Skupina sk = new Skupina("123");
        sk.pridajStudenta(janko);
        sk.vypisStudentov();
    }
}
