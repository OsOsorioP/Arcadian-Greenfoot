import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VidaJefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaJefe extends Actor
{
    /**
     * Act - do whatever the VidaJefe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int vf = 3;
    public void act()
    {
        setImage(new GreenfootImage("Vidas Jefe: "+vf, 20, greenfoot.Color.ORANGE, null));
        if(vf ==0){
            Greenfoot.setWorld(new Winner());
        }
    }
    
    public void menosVida2(){
        vf--;
    }
    
}
