package Chapter3;

import java.util.Scanner;

public class twoPointersAlgorithm_1 {

	public int[] solution(int num1, int[] arr1 , int num2, int[] arr2) {
		int[] answer = new int[num1+num2]; // Ãâ·Â °¹¼ö´Â num1 + num2
		int p1 =0, p2 =0;
		int cnt =0;
/*		
 		3			-- num1
		1 3 5		-- arr1
		5			-- num2
		2 3 6 7 9	-- arr2
*/		
		while(p1<num1 && p2<num2) {
			if(arr1[p1]<arr2[p2]) {
				answer[cnt] = arr1[p1++];
			}else {
				answer[cnt] = arr2[p2++];
			}
			cnt++;
		}
		
		while(p1<num1) {
			answer[cnt] = arr1[p1++];
			cnt++;
		}
		
		while(p2<num2) {
			answer[cnt] = arr2[p2++];
			cnt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoPointersAlgorithm_1 T = new twoPointersAlgorithm_1();
		
		Scanner in=new Scanner(System.in);
	    int num1 = in.nextInt();
	    int[] arr1 = new int[num1];
	    
	    for(int i=0;i<num1;i++) {
	    	arr1[i] = in.nextInt();
	    }
	    
	    int num2 = in.nextInt();
	    int[] arr2 = new int[num2];
	    
	    for(int j=0;j<num2;j++) {
	    	arr2[j] = in.nextInt();
	    }
	    
	    for(int x : T.solution(num1,arr1,num2,arr2)){
	    	System.out.print(x + " ");
	    }
	}

}
