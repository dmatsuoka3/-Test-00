import java.util.Arrays;
import java.util.Scanner;

public class DriverTest {
	
	public static int binarySearch(int arr[], int x) {
		
		int low = 0;
		int high = arr.length - 1;
		
		System.out.println(high);
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[mid] == x) {
				return mid;
			} else if(arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 16, 20, 14, 13, 5, 24, 6, 12, 7};
		System.out.println("Unsorted array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		
		while(true) {
			try {
				System.out.print("Enter an integer input: ");
				Scanner input = new Scanner(System.in);
				int readInput = input.nextInt();
				
				int result = binarySearch(arr, readInput);
				
				if(result == -1) {
					System.out.println("This element is not in array.");
				} else {
					System.out.println("Element is present at index " + result);
					break;
				}
				
			} catch (Exception e) {
				System.out.println("This is a string, not an integer.");
			}
		}
	}

}
