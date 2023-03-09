package prac;
import java.util.Scanner;
import java.lang.*;

public class multithreadingdemo {

	public static void main(String[] args) {
		
			printmessage("Sum of first 'N' numbers");
			printmessage("Enter a value");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt ();
			
			
			Calculator calc = new Calculator (n);
			calc.start();
			try {
				calc.join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			printmessage("Sum of first " +n + " numbers = " + calc.getSum());
	}
			private static void printmessage(String message) {
			System.out.println(Thread.currentThread().getName() + "_" + message);
			} 
			}
			
			printmessage("Sum of first " +n + " numbers = " + calc.getSum());
			
			class Calculator extends Thread {
			}
			int n;
			int sum;
			Calculator(int n) {
			this.n = n;
			}
			public void run() {
			for (int i=1;i<=n; i++) {
			this.sum += i;
			try {
			Thread.sleep(100);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			

	}

}
