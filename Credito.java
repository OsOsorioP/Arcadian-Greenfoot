import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credito extends World
{

    /**
     * Constructor for objects of class Credito.
     * 
     */
    public Credito()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 420, 1); 
    }
    public void act(){
        if(Greenfoot.isKeyDown("P")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
