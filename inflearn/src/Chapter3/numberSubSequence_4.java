package Chapter3;

import java.util.Scanner;

public class numberSubSequence_4 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0 , sum =0 , p1 =0, p2 =0;
		
		while(p1<n) {
			sum += arr[p1];
			if(sum < m) {
				p1++;
			}else {
				if(sum == m) {
					answer++;
				}
				sum = 0; 
				p2++;
				p1 = p2;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		numberSubSequence_4 N = new numberSubSequence_4();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(N.solution(n,m,arr));
	}

}
