package sortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

//10. 마구간 정하기(결정알고리즘)

public class stall_10 {

	public int count(int[] arr, int mid) {
		int cnt =1;//말의 마리 수
		int ep = arr[0];//end position
		for(int i=1; i<arr.length;i++) {
			if(arr[i]-ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid) >= c) {
				answer = mid;
				lt = mid+1;
			}else {
				rt = mid-1;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stall_10 S = new stall_10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(S.solution(n, c, arr));
	}

}
