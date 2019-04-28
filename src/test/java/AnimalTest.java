import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalTest {


    @Rule
    public DatabaseRule database = new DatabaseRule();

    private Animal testAnimal;


    @Before
    public void setup(){
        testAnimal = new Animal("Orangutan","");
    }

    @Test
    public void animal_instantiatesCorrectly_true() {
        assertEquals(true, testAnimal instanceof Animal);
    }





















































}
