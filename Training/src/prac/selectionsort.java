package prac;
import java.util.Arrays;
public class selectionsort {
	public static void main(String[] args) {
		int arr[]= { 10,3,7,14,6,21,9};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int position = i;
			for (int j =i+1;j<n;j++) {
				if (arr[j]<arr[position]) {
					position =j ;	
				}
			}
		int temp = arr[i];
		arr[i] =arr[position];
		arr[position]=temp;
		
		}
	System.out.println(Arrays.toString(arr));
	}
}
