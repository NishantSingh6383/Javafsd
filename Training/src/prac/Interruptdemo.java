package prac;

public class Interruptdemo {
	public static void main(String[] args) {
		utils.printmessage ("Start");
		
		
		Thread t = new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
		
		}
		catch (InterruptedException e) {
		e.printStackTrace();}
		
		utils.printmessage("End");
		}
		}
		class Worker implements Runnable {
		@Override
		public void run() {
		
		utils.printmessage("Start");
		for (int i=1; i<=10; i++) {
		utils.printmessage(""+i);
		
		
		try {
			Thread.sleep(5000);
		
		} catch (InterruptedException e) {
		utils.printmessage("Thread interrupted");
		}
		}
		utils.printmessage("End");
		}

}
