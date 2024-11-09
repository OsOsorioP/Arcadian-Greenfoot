import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instru extends World
{

    /**
     * Constructor for objects of class Instru.
     * 
     */
    public Instru()
    {    
        super(480, 450, 1); 
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("P")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
