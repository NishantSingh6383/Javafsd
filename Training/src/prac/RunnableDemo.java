package prac;
import java.lang.*;

public class RunnableDemo {
	public static void main(String[] args) {
		utils.printmessage("Begin main");
				ImageProcessor ip =new ImageProcessor();
				Thread t= new Thread (ip);
				t.start();
				
				Thread t1=new Thread(new Runnable() {
					public void run() {
						utils.printmessage("Do same work ");
					}
					
				});
				t1.start();
				utils.printmessage("End main");
		}

}

class ImageProcessor  implements Runnable{
	public void run() {
		utils.printmessage("Processing an image");
	}
}
