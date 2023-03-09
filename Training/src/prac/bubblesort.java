package prac;
import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		int arr[]= { 10,3,7,14,6,21,9};
//		for ( int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			
//		}
Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		
		}
	}
	


