import java.applet.Applet;
import java.awt.*;
public class Program_2_15 extends Applet {
	public void paint (Graphics page) {
		int middle = 275;
		int top = 200;
		setBackground (Color.black);
		page.setColor(Color.white);
		page.fillOval(middle+105, top+100, 50, 50); 
		page.fillOval(middle+215, top+100, 50, 50);
		page.setColor(Color.black);
		page.fillOval(middle+117, top+125, 15, 15); 
		page.fillOval(middle+227, top+125, 15, 15);
		page.setColor(Color.orange);
		page.fillOval(middle+185, top+190, 35, 12);
		page.setColor(Color.white);
		page.drawArc(middle+90, top+161, 200, 100, 190, 160);
		page.drawArc(middle+90, top+160, 200, 100, 190, 160);
		page.drawArc(middle+90, top+159, 200, 100, 190, 160);
	}

}
