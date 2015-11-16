import java.util.Random;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int maxHP=25;
    private int maxStrength=13;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super();
        Random rand = new Random();
        setHealth(rand.nextInt(maxHP)+minHP);
        setStrength(rand.nextInt(maxStrength)+minHP);
        
    }

}
