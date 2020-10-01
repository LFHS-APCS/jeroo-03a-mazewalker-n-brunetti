/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /** 
     * Precondition:  The Jeroo will start with a wall on its right (You do NOT need to check this.)
     * Postcondition:  The Jeroo has moved so that it again has a wall on its right
     *
     *  Here are the 3 cases:
     *     WW  goes to  WW       
     *     ^W           <W
     
     *      W  goes to  ^W
     *     ^W            W
     *
     *         goes to   >
     *     ^W            W
     */
   

   turn(LEFT);
    

   hop();
   
    hop();
   turn(RIGHT);
   hop();
 


    public void followWallRight() {
while(!isFlower(HERE)){
    if ((isWater(AHEAD))&&(isWater(RIGHT))){
      turn(LEFT);
    }

if (isClear(AHEAD)){
    hop();
   if(isClear(RIGHT)){
       turn(RIGHT);
       hop();
   }else{ 
       ;
   }
   }
   }
    }

    
    /**
     * The Jeroo should navigate the maze until it finds a flower.
     * HINT:  Use followWallRight
     */
    public void mazeWalker() {
        followWallRight();
    }
    
    
    
    
    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

