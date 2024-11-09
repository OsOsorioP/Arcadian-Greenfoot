import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    int op = 0,t=0;
    Selector s = new Selector();
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 400, 1); 
        addObject(new Jugar(),240,240);
        addObject(new Instrucciones(),240,300);
        addObject(new Creditos(),240,360);  
        addObject(s,170,240);
    }
    
    public void act(){
        if(t >0){
            t--;
        }
        if(t == 0){
            if(Greenfoot.isKeyDown("W") && op>0){
                op--;
                t = 30;
            }
            if(Greenfoot.isKeyDown("S") && op<=3){
                op++;
                t = 30;
            }
            if(op >= 3){
                op=2;
            }
            if(op < 0){
                op=1;
            }
        }
        s.setLocation(170,240+(op*60));
        if(Greenfoot.isKeyDown("ENTER") || Greenfoot.isKeyDown("SPACE")){
            switch(op){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.setWorld(new Instru());
                    break;
                case 2:
                    Greenfoot.setWorld(new Credito());
                    break;
            }
        }
    }
    
}
