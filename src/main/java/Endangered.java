import org.sql2o.*;
import java.util.List;
// endangered animal extends animal but with new attributes age and health

public class Endangered extends Animal {

    public String health;
    public String age;
    public static final String ANIMAL_TYPE = "Endangered";

    public Endangered(String name, String health, String age) {
        super(name);
        if (name.equals("") || health.equals("") || age.equals("")){
            throw new IllegalArgumentException("Please enter all input fields.");
        }
        this.health = health;
        this.age = age;
        type = ANIMAL_TYPE;
    }



}
