import java.util.Random;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
    /**
     * Constructor for objects of class Human
     */
    public Elf()
    {
        super();
        
    }
    
    public int damage()
    {
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       int crit= rand.nextInt(10)+1;
       if(crit==10)
       {
           damage=damage*2;
        }
       
    
       return damage;
        
    }

}

