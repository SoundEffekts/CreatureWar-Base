import java.util.Random;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
    /**
     * Constructor for objects of class Human
     */
    public Demon()
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
