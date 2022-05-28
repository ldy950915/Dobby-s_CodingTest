package sortAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mischief_6 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i=0; i<n;i++) {
			if(arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mischief_6 M = new mischief_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : M.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
