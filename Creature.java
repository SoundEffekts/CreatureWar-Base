import java.util.Random;       //To be used by the damage function.

/**
 * The creature class serves as the superclass for all other creatures in the wars soon . 
 * Contains values/methods for all other creature classes.
 * 
 * @author Chris Boardman 
 * @version 11.14.15
 */
public class Creature
{
   protected int hp;
   protected int strength;
   protected final int minHP;
   protected final int minStr;
/** Initalizes values for all fields.
 * 
 */      
   public Creature()
   {
       hp=10;
       strength=10;
       minHP=5;
       minStr=5;
   }
/** Returns an int equal to a random number based on the creature's strength.
 * @return int damage
 */       
   public int damage(){
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       return damage;
    }
/** Sets the strength of the creature
 * @param str
 */    
   public void setStrength(int str)
   {
       strength=str;
       if(strength<minStr)
       {
           strength=minStr;
       }
           
   }
/** Sets the health of the creature
 * @param str
 */          
   public void setHealth(int health)
   {
       hp=health;
       if(hp<minHP)
       {
           hp=minHP;
       }
           
   }   
    
   
}
