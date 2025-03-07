import java.util.Random;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ //question 14 below
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random random_generator;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        random_generator = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        System.out.println("Random number: "+ random_generator.nextInt(1000)); //15
       
    }
    public void printMultiRandom(int howMany){
        int index = 0;
        while(index < howMany){
            printOneRandom(); 
            index++; 
        }
        
    }
    public String getResponse(){ //18
        int index = random_generator.nextInt(3);
        if (index ==0){
            return "yes"; 
        } else if(index == 1){
            return "no";
        } else{
            return "maybe"; 
        }
    }
}
