import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class loopbox {
	public static void main(String[] args) throws InterruptedException {
for (int l=0; l<60;l++){
    for (int x=0; x<1400; x++){
    	Random rand = new Random();
    	int  n = rand.nextInt(660) + 0;
	    TimeUnit.MILLISECONDS.sleep(1);
		try {
		    int X = x;
		    int Y = n;   
		    Robot robot = new Robot();
		    robot.mouseMove(X, Y);
		} catch (AWTException e) {
		}   	
    }
}
	}
}
