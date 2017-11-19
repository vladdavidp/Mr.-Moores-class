import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		for (int ll=1; ll>0; ll++) {
		    for (int x=0; x<1200; x++){
			    TimeUnit.MILLISECONDS.sleep(1);
			try {
					Random rand = new Random();
					int  n = rand.nextInt(800) + 0;
	    		    int xCoord = x;
	    		    int yCoord = n;
	    		    Robot robot = new Robot();
	    		    robot.mouseMove(xCoord, yCoord);
	    		} catch (AWTException e) {
	    		}   	
	    		    }	
		}
	}
}