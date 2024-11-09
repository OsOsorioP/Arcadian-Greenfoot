import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hambu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hambu extends Actor
{
    /**
     * Act - do whatever the Hambu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int t = 200; 
    public void act()
    {
        World w = getWorld();
        MyWorld m = (MyWorld)w;
        if(isTouching(Nave.class)){
            Vida v = m.getV();
            v.masVida();                
            w.removeObject(this);
        }
        if(t ==0){
            w.removeObject(this);
        }else{
            t--;
        }
    }
    
    public Hambu(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 3;
        int ancho = (int)dimension.getWidth() / 3;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
}
