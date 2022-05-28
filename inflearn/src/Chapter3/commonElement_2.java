package Chapter3;

import java.util.*;

public class commonElement_2 {

	public ArrayList<Integer> solution(int n,int[] arr , int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(arr);	//오름차순 정렬 --Collections.sort(arr) 사용가능 
		Arrays.sort(arr2);
		
		
		int p1 =0 , p2 =0;
		
		while(p1<n && p2<m) {	//아무쪽에서 하나가 끝나면 공통원소가 없음
			if(arr[p1] == arr2[p2]) {
				answer.add(arr[p1]);	//둘중에 아무거나 넣으면됨
				//같은 경우 동시에 두개 다 증가 
				p1++;
				p2++;
				
			}else if(arr[p1] < arr2[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commonElement_2 C = new commonElement_2();
		
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    int m = in.nextInt();
	    int[] arr2 = new int[m];
	    for(int j=0;j<m;j++) {
	    	arr2[j] = in.nextInt();
	    }
	    
	    for(int x : C.solution(n, arr, m, arr2)) {
	    	System.out.print(x + " ");
	    }
	    
	}

}
