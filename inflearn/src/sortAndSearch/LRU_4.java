package sortAndSearch;

import java.util.Scanner;

public class LRU_4 {

	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		for(int x : arr) {
			int pos = -1; //위치 번호
			for(int i=0; i<s;i++) {
				if(x==answer[i]) {	//cache hit일 경우
					pos = i;
				}
			}
			//miss일 경우
			if(pos == -1) {
				for(int i=s-1;i>=1;i--) {
					answer[i] = answer[i-1];
				}
				answer[0] = x;
			}else {	//hit일 경우
				for(int i=pos;i>=1;i--) {
					answer[i] = answer[i-1];
				}
				answer[0] = x;	
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU_4 L = new LRU_4();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : L.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}

}
