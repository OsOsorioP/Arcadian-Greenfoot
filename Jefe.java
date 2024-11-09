import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe extends Actor
{
    /**
     * Act - do whatever the Jefe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int t = 0, t2=0;
    public void act()
    {
        Movimiento();
        Ataque();
    }
    public Jefe(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 5;
        int ancho = (int)dimension.getWidth() / 5;
        dimension.scale(alto, ancho);
        setRotation(360);
    }
    
    public void Movimiento(){
        if(RandomNumber(1,2) == 1){
            if(t2 == 0){
                setLocation(getX(), getY()-RandomNumber(30,100));               
                t2 = 100;
            }else{
                t2--;
            }
        }else{
            if(t2 == 0){
                setLocation(getX(), getY()+RandomNumber(30,100));               
                t2 = 100;
            }else{
                t2--;
            }   
        }
        if(getY() > 350){
            setLocation(getX(), getY()-RandomNumber(30,100));
        }
        if(getY() < 100){
            setLocation(getX(), getY()+RandomNumber(30,100)); 
        }
    }
    
    public void Ataque(){
        World w = getWorld();
        if(t == 0){
            w.addObject(new Disparo2(), getX()+25, getY()-60);      
            w.addObject(new Disparo2(), getX()+25, getY()); 
            w.addObject(new Disparo2(), getX()+25, getY()+60); 
            t = 240;
        }else{
            t--;
        }
    }
    public int RandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}
