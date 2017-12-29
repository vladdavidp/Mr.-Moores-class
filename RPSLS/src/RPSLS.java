import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class RPSLS extends JFrame implements ActionListener{
		public static String M;
	    public static void main(String[] args) {
	        new RPSLS().setVisible(true);
	    }
	    public RPSLS() {
	        super("rock paper scissors lizard spock");
	        setSize(1048,132);
	        setResizable(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new GridLayout());
	        String name[]={"0.jpg","1.jpg","2.jpg","3.jpg","4.jpg"};
	         Icon icons[]={ new ImageIcon( name[0] ), new ImageIcon( name[1] ), new ImageIcon( name[2] ), new ImageIcon( name[3] ), new ImageIcon( name[4] )};
	            JLabel im0 = new JLabel(icons[0]);
	            JLabel im1 = new JLabel(icons[1]);
	            JLabel im2 = new JLabel(icons[2]);
	            JLabel im3 = new JLabel(icons[3]);
	            JLabel im4 = new JLabel(icons[4]);
	        JButton button0 =new JButton("rock");
	        JButton button1 =new JButton("paper");
	        JButton button2 =new JButton("scissors");
	        JButton button3 =new JButton("lizard");
	        JButton button4 =new JButton("spock");
	        add(button0);
	        add(im0);
	        add(button1);
	        add(im1);
	        add(button2);
	        add(im2);
	        add(button3);
	        add(im3);
	        add(button4);
	        add(im4);
	        button0.addActionListener(this);
	        button1.addActionListener(this);
	        button2.addActionListener(this);
	        button3.addActionListener(this);
	        button4.addActionListener(this);
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
    	String name=e.getActionCommand();
    	Random en = new Random();
        int r = en.nextInt(4);
    	if (r==0) {
    		M="rock";	
    	}if (r==1) {
    		M="paper";
    	}if (r==2) {
    		M="scissors";
    	}if (r==3) {
    		M="lizard";
    	}if (r==4) {
    		M="spock";
    	}
    	if(name.equals(M)) {
    		JOptionPane.showMessageDialog(null,"it's a tie, you both picked "+name, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
    	}else if (name=="rock" && M=="paper" || name=="rock" &&M=="spock"||name=="paper"&& M=="scissors"||name=="paper"&&M=="lizard"||name=="scissors"&&M=="rock"||name=="scissors"&&M=="spock"||name=="lizard"&&M=="rock"||name=="lizard"&&M=="scissors"||name=="spock"&& M=="paper"||name=="spock"&&M=="lizard") {
    		JOptionPane.showMessageDialog(null,"you lost, you picked "+name+" and they picked "+M, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
        	}else {
        		JOptionPane.showMessageDialog(null,"you won, you picked "+name+" and they picked "+M, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
    		}
    	}
	}