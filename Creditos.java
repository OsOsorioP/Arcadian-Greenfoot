import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Actor
{
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Creditos(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight();
        int ancho = (int)dimension.getWidth() / 5;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
}
