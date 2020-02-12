package oose.dea;

public class MyThread extends Thread {

	private MyFrame mf;
	private int value;
	
	public MyThread(MyFrame mf, int value){
		this.mf = mf;
		this.value = value;
	}
	
	public void run(){
		while (true){
			mf.writeText("" + value);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
