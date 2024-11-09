import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo2 extends Actor
{
    /**
     * Act - do whatever the Enemigo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int t = 0, x = 50,t2=0;
    public void act()
    {
        Movimiento();
        Ataque();
    }
    public Enemigo2(){
        GreenfootImage dimension = getImage();
        int alto = (int)dimension.getHeight() / 7;
        int ancho = (int)dimension.getWidth() / 7;
        dimension.scale(alto, ancho);
        setRotation(90);
    }
     
    public void Movimiento(){
        if(RandomNumber(1,2) == 1){
            if(t2 == 0){
                setLocation(getX(), getY()-x);               
                t2 = 150;
            }else{
                t2--;
            }
        }else{
            if(t2 == 0){
                setLocation(getX(), getY()+x);               
                t2 = 150;
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
            w.addObject(new Disparo2(), getX()+25, getY());                
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
