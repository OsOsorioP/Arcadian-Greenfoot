import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int Scoree = 0;
    public void act()
    {
        inter();
    }
    public void inter(){
        setImage(new GreenfootImage("Puntos: "+Scoree, 20, greenfoot.Color.YELLOW, null));
    }
    public void addScore(){
        Scoree++;
    }
}
