import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int v = 3;
    public void act()
    {
        setImage(new GreenfootImage("Vidas: "+v, 20, greenfoot.Color.RED, null));
        if(v ==0){
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public void menosVida(){
        v--;
    }
    
    public void masVida(){
        if(v < 3){
            v++;
        }
    }
    
}
