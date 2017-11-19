import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;
public class keybord_FU {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
	    TimeUnit.SECONDS.sleep(6);
	    for (int x=0; x<150; x++){
    			r.keyPress(KeyEvent.VK_ENTER);  
    		    r.keyRelease(KeyEvent.VK_ENTER);
    			r.keyPress(KeyEvent.VK_Y);  
    		    r.keyRelease(KeyEvent.VK_Y);
    			r.keyPress(KeyEvent.VK_O);  
    		    r.keyRelease(KeyEvent.VK_O);
    			r.keyPress(KeyEvent.VK_U);  
    		    r.keyRelease(KeyEvent.VK_U);
    			r.keyPress(KeyEvent.VK_SPACE);  
    		    r.keyRelease(KeyEvent.VK_SPACE);
    			r.keyPress(KeyEvent.VK_A);  
    		    r.keyRelease(KeyEvent.VK_A);
    			r.keyPress(KeyEvent.VK_R);  
    		    r.keyRelease(KeyEvent.VK_R);
    			r.keyPress(KeyEvent.VK_E);  
    		    r.keyRelease(KeyEvent.VK_E);
    			r.keyPress(KeyEvent.VK_SPACE);  
    		    r.keyRelease(KeyEvent.VK_SPACE);
    			r.keyPress(KeyEvent.VK_V);  
    		    r.keyRelease(KeyEvent.VK_V);
    			r.keyPress(KeyEvent.VK_E);  
    		    r.keyRelease(KeyEvent.VK_E);
    			r.keyPress(KeyEvent.VK_R);  
    		    r.keyRelease(KeyEvent.VK_R);
    			r.keyPress(KeyEvent.VK_Y);  
    		    r.keyRelease(KeyEvent.VK_Y);
    			r.keyPress(KeyEvent.VK_SPACE);  
    		    r.keyRelease(KeyEvent.VK_SPACE);
    			r.keyPress(KeyEvent.VK_N);  
    		    r.keyRelease(KeyEvent.VK_N);
    			r.keyPress(KeyEvent.VK_I);  
    		    r.keyRelease(KeyEvent.VK_I);
    			r.keyPress(KeyEvent.VK_C);  
    		    r.keyRelease(KeyEvent.VK_C);
    			r.keyPress(KeyEvent.VK_E);  
    		    r.keyRelease(KeyEvent.VK_E);
	}
	}
}
