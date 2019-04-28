import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;


public class Sighting implements DatabaseManagement {

    private int id;
    private int animal_id;
    private String location;
    private String ranger_name;
    private Timestamp timestamp;

    // constructor for sighting which implements abstract method save in Database management class

    public Sighting(int animal_id, String location, String ranger_name) {
        if (ranger_name.equals("")) {
            throw new IllegalArgumentException("Please enter Ranger name.");
        }
        this.animal_id = animal_id;
        this.location = location;
        this.ranger_name = ranger_name;
        this.save();
    }
    //get methods
    public int getId(){
        return id;
    }

    public int getAnimalId(){
        return animal_id;
    }

    public String getLocation(){
        return location;
    }

    public String getRangerName(){
        return ranger_name;
    }

    public String getTimeSeen(){
        return String.format("%1$TD %1$TR", timestamp);
    }

    public void setLocation(String location) {
        this.location = location;
    }

















































}