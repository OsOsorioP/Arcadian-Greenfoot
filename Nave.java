import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x = 3;
    private int t = 0;
    public void act()
    {
        Colision();
        movimiento();
        Ataque();
    }
    
    public void movimiento(){
        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY()-x);
        }
        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY()+x);
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-x, getY());
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+x, getY());
        }
    }
    
    public Nave(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 3;
        int ancho = (int)dimension.getWidth() / 10;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
    
    public void Ataque(){
        World w = getWorld();
        if(t == 0){
          if(Greenfoot.isKeyDown("Space")){ 
            Greenfoot.playSound("Bola_de_fuego.mp3");
            w.addObject(new Disparo(), getX()+25, getY());                
            t = 30;
            }
        }else{
            t--;
        }
    }
    
    public void Colision(){
        if(getY() > 440){
            setLocation(getX(), getY()-6);
        }
        if(getY() < 10){
            setLocation(getX(), getY()+6); 
        }
        if(getX() > 790){
            setLocation(getX()-6, getY());
        }
        if(getX() < 10){
            setLocation(getX()+6, getY()); 
        }
    }
}
