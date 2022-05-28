package sortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class duplication_5 {

	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++ ) {
			if(arr[i] == arr[i+1]) {
				answer = "D";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplication_5 D = new duplication_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(D.solution(n, arr));
		
	}
}
