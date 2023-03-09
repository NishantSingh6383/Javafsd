package prac;
import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		int arr[]= { 10,3,7,14,6,21,9};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int cvalue=arr[i];
			int position=i;
			while ((position>0) && (arr[position-1]>cvalue)) {
				arr[position]=arr[position-1];
				position=position-1;	
			}
			arr[position]=cvalue;	
		}
		System.out.println(Arrays.toString(arr));
	}
}
