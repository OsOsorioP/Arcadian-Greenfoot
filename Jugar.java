import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Actor
{
    /**
     * Act - do whatever the Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public Jugar(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight();
        int ancho = (int)dimension.getWidth() / 5;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
}
