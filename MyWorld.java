import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int t = 0,t3=150;
    boolean b = true;
    Score s = new Score();
    Vida v = new Vida();
    VidaJefe vf = new VidaJefe();
    public MyWorld()
    {    
        super(800, 450, 1); 
        addObject(new Nave(), 50,200);
        Puntos();
        Vida();
        Greenfoot.playSound("Musica_de_fondo.mp3");
    }
    
    public void Puntos(){
        addObject(s,40,20);
    }
    
    public Score getS(){
        return s;
    }
    
    public void Vida(){
        addObject(v,400,20);
    }
    
    public Vida getV(){
        return v;
    }
    
    public VidaJefe getF(){
        return vf;
    }
    
    public void act(){
        t++;
        if(t == 150){
            addObject(new Enemigo1(),RandomNumber(700,780),RandomNumber(35,400));
            if(RandomNumber(1,4)== 2){
               addObject(new Enemigo2(),RandomNumber(700,780),RandomNumber(50,380)); 
            }
            t = 0;
        }
        if(s.Scoree == 2){
            if(b == true){
                addObject(vf,740,20);
                addObject(new Jefe(),RandomNumber(700,780),RandomNumber(100,300));
                b = false;
            }
            
        }
        if(t==0 && (RandomNumber(1,5) == 3)){
            addObject(new Hambu(),RandomNumber(80,780),RandomNumber(80,400));
            t3 = 300;
        }
    }
    
    public int RandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}
