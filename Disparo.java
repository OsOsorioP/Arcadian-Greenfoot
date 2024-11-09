import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Vida vid = new Vida();
    public void act()
    {
        movimiento();
        Pared();
    }
    
    public Disparo(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 20;
        int ancho = (int)dimension.getWidth() / 30;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
    public void movimiento(){
        move(5);
        
    }
    public void Pared(){
        World w = getWorld();
        MyWorld m = (MyWorld)w;
        if(isAtEdge()){
            w.removeObject(this);
        }else{
            if(isTouching(Enemigo1.class)){
                Greenfoot.playSound("Muerte_aliens.mp3");
                removeTouching(Enemigo1.class);
                Score s = m.getS();
                s.addScore();
                w.removeObject(this);
            }else{
                if(isTouching(Enemigo2.class)){
                Greenfoot.playSound("Muerte_aliens.mp3");
                removeTouching(Enemigo2.class);
                Score s = m.getS();
                s.addScore();
                w.removeObject(this);
            }else{
                if(isTouching(Jefe.class)){
                Greenfoot.playSound("Muerte_aliens.mp3");
                VidaJefe vf = m.getF();
                vf.menosVida2();
                Score s = m.getS();
                s.addScore();
                w.removeObject(this);
                }
            }
            }
        }
    }
}
