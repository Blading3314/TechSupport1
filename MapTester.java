import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap <String,String> contact; //27

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester() //questions 27 to 32
    {
        // initialise instance variables
        contact = new HashMap<>(); 
        contact.put("Joe Biden", "433 446564 19123"); 
        contact.put("Shamba", "45735439857345893"); 
        contact.put("Osama", "8574893579345743"); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void enterNumber(String name, String number)
    {
        contact.put(name,number);
    }
    public String lookupNumber(String name){
        String number = contact.get(name);
        return number; 
    }
}
   
/*
 * 24. Hashmap is implementing the map interface. Its used for to provide null values and null key. 
 */