import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.awt.TextArea;
import java.awt.TextComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
public class texteditV4 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	public static  String p4="";
    public static String p5="";//thank you torres hope your wife gets better
    public static String Q0="What's money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do. ",Q1="Dave, this conversation can serve no purpose anymore. Goodbye. ",Q2=" No amount of political freedom will satisfy the hungry masses. ",Q3=" Isn't it funny? The truth just sounds different.",Q4="And in the end, the love you take Is equal to the love you make.",Q5="Life is what happens while you are busy making other plans.",Q6="You have enemies? Good. That means you've stood up for something, sometime in your life.",Q7="Time is an illusion. Lunchtime doubly so",Q8="the Dude abides. ",Q9=" All those moments will be lost in time... like tears in rain... Time to die. ";
    Component c = new TextArea("Were all Fucked");
    public static void main(String[] args) {
        new texteditV4().setVisible(true);
    }
    public texteditV4() {
        super("condor0010's window");
        setSize(500,340);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Random rand = new Random(); 
        int valvea = rand.nextInt(256), valveb = rand.nextInt(256),valvec = rand.nextInt(256);
        getContentPane().setBackground(new Color(valvea,valveb,valvec));
        add(c, BorderLayout.NORTH);
        JButton button =new JButton("save");
        JButton button2 =new JButton("open");
        JButton button3 =new JButton("quote");
        add(button);
        add(button2); //  movie buff of the former Roman empire
        add(button3);
        button.addActionListener(this);
        button2.addActionListener(this);// fool on the hill
        button3.addActionListener(this);
        p5+=c.getToolkit();
    }// fuck bill gates & micro$oft
    @Override
    public void actionPerformed(ActionEvent louie) {
    	String name =louie.getActionCommand();
    	if(name.equals("save")) {//vid.me  & don't kill net neutrality
    		String nme= JOptionPane.showInputDialog("type the file locaton of "); 
            File file = new File(nme);//0010 1010
            p5 = ((TextComponent) c).getText();
            PrintWriter printWriter = null;
            try{// linux for life 
                printWriter = new PrintWriter(file);
                printWriter.println(p5);// i hate Goldman she dose not trust me 
            }catch (FileNotFoundException arg0)
            {
                arg0.printStackTrace();//youtube + stackoverflow + a hot cup of tea = this 
            }finally
            {
            	if ( printWriter != null ) {
                    printWriter.close();
                }// there are 2 evans i have to kill one of them 
            }
    	}else if(name.equals("open")) {
        	String nme= JOptionPane.showInputDialog("type the naem and location of the file you would like to open"); 
        	// open file need example code
            }else if(name.equals("quote")) {
                Random rand = new Random(); 
                int dylan = rand.nextInt(9);
                if (dylan==0) {
                	JOptionPane.showMessageDialog(null, Q0);	
                }else if (dylan==1) {
                	JOptionPane.showMessageDialog(null, Q1);	
                }else if (dylan==2) {
                	JOptionPane.showMessageDialog(null, Q2);	
                }else if (dylan==3) {
                	JOptionPane.showMessageDialog(null, Q3);	
                }else if (dylan==4) {
                	JOptionPane.showMessageDialog(null, Q4);	
                }else if (dylan==5) {
                	JOptionPane.showMessageDialog(null, Q5);	
                }else if (dylan==6) {
                	JOptionPane.showMessageDialog(null, Q6);
                }else if (dylan==7) {
                	JOptionPane.showMessageDialog(null, Q7);
                }else if (dylan==8) {
                	JOptionPane.showMessageDialog(null, Q8);
                }else if (dylan==9) {
                	JOptionPane.showMessageDialog(null, Q9);
                }

            }
    }
}
