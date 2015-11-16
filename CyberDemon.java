
import java.util.Random;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
    /**
     * Constructor for objects of class Human
     */
    public CyberDemon()
    {
        super();
        
    }
    
    public int damage()
    {
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       int crit= rand.nextInt(100)+1;
       if(crit==5)
       {
           damage=damage+50;
        }
       
    
       return damage;
        
    }

}
