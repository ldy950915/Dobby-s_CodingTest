package Hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class kMax_5 {

	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		//TreeSet : 중복제거, 정렬O
		//Collections.reverseOrder() -> 설정 시 내림차순 , 없으면 default 오름차순
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int l =j+1; l<n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt =0;
		for(int x : Tset) {
			cnt++;
			if(cnt == k) {
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kMax_5 K = new kMax_5();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(K.solution(n, k, arr));
		
	}

}
