import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.setup();
        test.test1_followWallRight();
        test.test2_mazeWalker();
    }

    @Before
    public void setup() {
        Map.getInstance().loadMap("maps/followWallRight.jev");
    }

    @Test
    public void test1_followWallRight()
    {   
        Jeroo j1 = new Jeroo(2, 1, NORTH, 0);
        j1.followWallRight();
        assertTrue("jeroo should be at (2,1)", Map.getInstance().isJeroo(2,1));
        assertTrue("jeroo should be facing west", j1.isFacing(WEST));

        Jeroo j2 = new Jeroo(2, 5, NORTH, 0);
        j2.followWallRight();
        assertTrue("jeroo should be at (1,5)", Map.getInstance().isJeroo(1,5));
        assertTrue("jeroo should be facing north", j2.isFacing(NORTH));
        
        Jeroo j3 = new Jeroo(2, 9, NORTH, 0);
        j3.followWallRight();
        assertTrue("jeroo should be at (1,5)", Map.getInstance().isJeroo(1,10));
        assertTrue("jeroo should be facing east", j3.isFacing(EAST));

    }
    
    @Test
    public void test2_mazeWalker()
    {   
        Jeroo j1 = new Jeroo(7, 0, EAST, 0);
        j1.mazeWalker();
        assertTrue("jeroo should be at (7,13)", Map.getInstance().isJeroo(7,13));


    }

}
