import java.awt.*;
import java.util.concurrent.TimeUnit;
public class lol {
	public static void main(String[] args) throws InterruptedException {
	    for (int x=0; x>-1; x++){
		    TimeUnit.MILLISECONDS.sleep(1);
		try {
    		    int xCoord = 500;
    		    int yCoord = 500;   
    		    Robot robot = new Robot();
    		    robot.mouseMove(xCoord, yCoord);
    		} catch (AWTException e) {
    		}   	
    		    }
	}
}

