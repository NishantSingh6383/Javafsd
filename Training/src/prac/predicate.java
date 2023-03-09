package prac;
import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) {
		Predicate<Integer> even = (i) -> (i%2 == 0);
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		m1(even, x);

	}
	
	static void m1(Predicate<Integer> p, int[] x) {
		for (int j : x) {
			if(p.test(j)) {
				System.out.println(j);
			}
		}
	}


	}
//		Predicate<Integer> lesserThan=i -> (i<18);
//		System.out.println(lesserThan.test(10));
//	}
//
//}
