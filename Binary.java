package kirisaite;

import java.util.*;
public class Binary {
	public static void main(String[]args){
		
		int[] A = new int[10];
		int searchValue = 0, index;
		
		System.out.println ("Enter 10 numbers");
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < A.length; i++){
			A[i] = input.nextInt();
		}
		
		System.out.println ("Enter a number to search for: ");
		searchValue = input.nextInt();
		index = binarySearch(A, searchValue);
		
		if (index != -1){
			System.out.println ("Found at index: " + index);
		}
		else {
			System.out.println("Not found");
		}
	}
	static int binarySearch (int[] search, int find){
		int start , end, midPt;
		start = 0;
		end = search.length - 1;
		
		while (start <= end){
			midPt = (start + end) / 2;
			
			if (search[midPt] == find){
				return midPt;
			}
			else if (search[midPt] < find){
				start = midPt + 1;
			}
			else {
				end = midPt - 1;
			}
		}
		return -1;
	}
}