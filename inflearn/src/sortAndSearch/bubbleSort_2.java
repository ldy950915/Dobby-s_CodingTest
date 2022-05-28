package sortAndSearch;

import java.util.Scanner;

//버블정렬 - 맨뒤에 값을 확정하는 방식
public class bubbleSort_2 {
	public int[] solution(int n, int[] arr){
		int tmp =0;
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSort_2 B = new bubbleSort_2();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : B.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
