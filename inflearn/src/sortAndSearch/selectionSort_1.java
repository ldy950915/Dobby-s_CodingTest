package sortAndSearch;

import java.util.Scanner;

public class selectionSort_1 {

	public int[] solution(int n, int[] arr){
		int idx = 0;
		for(int i=0; i<n-1;i++) {
			idx = i;
			for(int j=i+1;j<n; j++) {
				if(arr[i] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort_1 S = new selectionSort_1();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : S.solution(n, arr)) {
			System.out.print(x + " ");
		}		
	}

}
