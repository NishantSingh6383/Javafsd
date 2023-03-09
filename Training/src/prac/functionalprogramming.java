package prac;
import java.util.function.Function;

public class functionalprogramming {

	public static void main(String[] args) {
		Function<String,Integer> f1=s -> s.length();
		System.out.println("Length of 'hello' is  " + f1.apply("Hellooo"));
	}

}
