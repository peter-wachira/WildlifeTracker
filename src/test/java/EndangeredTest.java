import org.sql2o.*;
import org.junit.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import static org.junit.Assert.*;


public class EndangeredTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    // test endangered animal instantiates correctly
    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        Endangered testEndangeredAnimal = new Endangered("Fox", "Healthy", "Young");
        assertEquals(true, testEndangeredAnimal instanceof Endangered);
    }

    // test get health method

    @Test
    public void getHealth_returnsHealthAttribute_true() {
        Endangered testEndangeredAnimal = new Endangered("Fox", "Healthy", "Young");
        assertEquals("Healthy", testEndangeredAnimal.getHealth());
    }

















































}
