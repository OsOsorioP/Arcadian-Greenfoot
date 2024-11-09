import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo1 extends Actor
{
    /**
     * Act - do whatever the Enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
        Pared();
    }
    
    public Enemigo1(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 7;
        int ancho = (int)dimension.getWidth() / 7;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
    
    private void movimiento(){
        move(-4);
    }
    
    private void Pared(){
        World w = getWorld();
        if(isAtEdge()){
            w.removeObject(this);
        }else{
            if(isTouching(Nave.class)){
                w.removeObject(this);
                MyWorld m = (MyWorld)w;
                Vida v = m.getV();
                v.menosVida();
            }
        }
        
    } 
    
}
