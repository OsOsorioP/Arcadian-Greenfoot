import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo2 extends Actor
{
    /**
     * Act - do whatever the Disparo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=5;
    public void act()
    {
        movimiento();
        Pared();
    }
    
    public Disparo2(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 20;
        int ancho = (int)dimension.getWidth() / 30;
        dimension.scale(alto, ancho);
        setRotation(90);
    }
    public void movimiento(){
        setLocation(getX()-x, getY());
    }
    public void Pared(){
        World w = getWorld();
        MyWorld m = (MyWorld)w;
        if(isAtEdge()){
            w.removeObject(this);
        }else{
            if(isTouching(Nave.class)){
                Vida v = m.getV();
                v.menosVida();
                w.removeObject(this);
            }
        }
    }
}
