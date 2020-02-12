package oose.dea;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements ActionListener, Runnable{

	private JButton buttonStart;
	private JButton buttonStop;
	private JTextArea textarea;
	private int value = 1;
	private boolean isRunning = false;


	
	public MyFrame(){
		setSize(640,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttonStart = new JButton("Start Thread");
		buttonStart.addActionListener(this);
		buttonStop = new JButton("Stop Thread");
		buttonStop.addActionListener(this);
		textarea = new JTextArea();
		
		add("North",buttonStart);
		add("Center", textarea);
		add("South",buttonStop);
		
	}
	
	public void writeText(String s){
		textarea.append(s);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setVisible(true);	
	}


	@Override
	public void run() {
		while(isRunning){
			writeText("hoi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
