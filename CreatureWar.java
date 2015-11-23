import java.util.*;

/**
 * This class creates two arrays of creatures and has them "battle" one vs one
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureWar
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        // initialise instance variables
        x = 0;
    }

    /**

     */
    public void battle()
    {
        int i=0;
        Random rand = new Random();
        ArrayList<Creature> team1 = new ArrayList<Creature>();
        ArrayList<Creature> team2 = new ArrayList<Creature>();
        
        for( i=0; i<20; i++)
        {
            team1.add(i,new Elf());
            team2.add(i,new Human());
        }
        team1.add(10,new CyberDemon());
        team2.add(10,new CyberDemon()); 
        team2.add(20,new Balrog()); 
        team2.add(20,new Balrog()); 
  
        int teamOneIndex=0;
        int teamTwoIndex=0;
    System.out.println("Begin the battle!");    
    
    while( teamOneIndex < 21 || teamTwoIndex < 21 )
    {
        while(team1.get(teamOneIndex).getHealth() > 0 && team2.get(teamTwoIndex).getHealth() > 0)
        {
            team1.get(teamOneIndex).takeDamage(team2.get(teamTwoIndex).damage());
            team2.get(teamTwoIndex).takeDamage(team1.get(teamOneIndex).damage());

        }
            if(team1.get(teamOneIndex).getHealth()<0 && team2.get(teamTwoIndex).getHealth()<0)
            {
                teamOneIndex++; 
                teamTwoIndex++;
                System.out.println("both died!");
            }
            else if(team1.get(teamOneIndex).getHealth()<0)
            {
                teamOneIndex++;
                System.out.println("1 died");
            }
            else if(team2.get(teamTwoIndex).getHealth()<0)
            {
                teamTwoIndex++;
                System.out.println("2 died");
            }
            
    }
    
    String result=""; 
    System.out.println(teamOneIndex);
    System.out.println(teamTwoIndex);  
    if(teamOneIndex==21 && teamOneIndex==21)
        result="Nobody!";
    if(teamOneIndex==20)
        result="Team Two!";
    if(teamTwoIndex==20)
        result="Team One!" ;       
    System.out.println("And the winner is...." + result);
    
    }
}
        
