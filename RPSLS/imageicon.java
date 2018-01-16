import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
public class RPSLS extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
		public static String M;
	    public static void main(String[] args) {
	        new RPSLS().setVisible(true);
	    }
	        public RPSLS() {
	        super("rock paper scissors lizard spock");
	        setSize(703,145);
	        setResizable(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());
            JButton button0 = new JButton(new ImageIcon("0.jpg"));
            JButton button1 = new JButton(new ImageIcon("1.jpg"));
            JButton button2 = new JButton(new ImageIcon("2.jpg"));
            JButton button3 = new JButton(new ImageIcon("3.jpg"));
            JButton button4 = new JButton(new ImageIcon("4.jpg"));//dwatchseries.2 // black mirror
	        add(button0);
	        add(button1);
	        add(button2);
	        add(button3);
	        add(button4);
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
    	System.out.println(this);
    	if(name.equals(M)) {
    		JOptionPane.showMessageDialog(null,"it's a tie, you both picked "+name, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
    	}else if (name=="rock" && M=="paper" || name=="rock" &&M=="spock"||name=="paper"&& M=="scissors"||name=="paper"&&M=="lizard"||name=="scissors"&&M=="rock"||name=="scissors"&&M=="spock"||name=="lizard"&&M=="rock"||name=="lizard"&&M=="scissors"||name=="spock"&& M=="paper"||name=="spock"&&M=="lizard") {
    		JOptionPane.showMessageDialog(null,"you lost, you picked "+name+" and they picked "+M, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
        	}else {
        		JOptionPane.showMessageDialog(null,"you won, you picked "+name+" and they picked "+M, name+" VS "+M, JOptionPane.INFORMATION_MESSAGE);
    		}
    	}
	}
