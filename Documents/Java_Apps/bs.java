// Java implementation of iterative Binary Search

//import java.io.*;
import java.util.*;

class bs {

	// Returns index of x if it is present in arr[].
	static int binarySearch(int arr[], int x,int n)
	{
		int l = 0, r = n - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// If we reach here, then element was
		// not present
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{       
                Scanner sc=new Scanner(System.in);
		//bs ob = new bs();
                
		//int arr[] = { 2, 3, 4, 10, 40 };
                System.out.println("enter no. of values");
		int n = sc.nextInt();
                int arr[]=new int[n];
                System.out.println("enter the values");
                for(int i=0;i<n;i++){  
                         arr[i]=sc.nextInt();        }
                System.out.println("enter the value to search");
                int x = sc.nextInt();
		//int x = 10;
		
		if (binarySearch(arr, x,n) == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println("Element is present at "
							+ "index " + binarySearch(arr, x,n));
	}
}
