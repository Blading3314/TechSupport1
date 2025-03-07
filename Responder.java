import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random random_generator;
    private ArrayList<String> responses;
   
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
     random_generator = new Random();
     responses = new ArrayList<>(); 
    
     fillResponses();

    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */ //27
    public String generateResponse()
    {
        int index = random_generator.nextInt(responses.size()); 
        return responses.get(index);
    
    }
    private String pickDefaultResponse(){
        return "no idea, sorry"; 
    }
    public void fillResponses(){ //22
        responses.add("yes");
        responses.add("no");
        responses.add("Who knows?");
        responses.add("Probably");
        responses.add("Maybe");
        responses.add("No idea");
    }
    public String generateResponse(String word){ 
        String responses = responses.get(word);
        if (answer == null){ 
            response = pickDefaultResponse(); 
}
return response;
}
}
