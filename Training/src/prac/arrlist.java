package prac;
import java.util.*;
import java.util.stream.Collectors;

public class arrlist {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("MAX");
		names.add("MILLEN");
		names.add("JOHN");
		names.add("COLLINS");
		

		List<String> lowerlist = names.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
    	System.out.println(lowerlist);
	}

}
