package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chaithanya.reddy
 * Aug 16, 2019
 */
public class AdditivePrime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements in the array:");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array:");
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		
		for(int i  = 0; i < arr.length; i++) {
			if(arr[i] != 1 && checkPrime(arr[i])) {
				if(checkSum(arr[i]))
					System.out.println(arr[i]);
			}
		}
		
	}
	
	public static boolean checkPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0)
				return false;
		}
		
		return true;
		
	}
	public static boolean checkSum(int num) {
		int i = num;
		int sum = 0;
		while(i != 0) {
			sum += i%10;
			i = i/10;
		}
		return checkPrime(sum);
	}

}
