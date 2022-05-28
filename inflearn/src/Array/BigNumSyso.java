package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. ū �� ����ϱ�
����

N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

(ù ��° ���� ������ ����Ѵ�)


�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.


���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
*/
public class BigNumSyso {
	
	public ArrayList<Integer> solution(int n , int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		//0�� ������ ���
		answer.add(arr[0]);
		for(int i =1; i<n;i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigNumSyso B = new BigNumSyso();
		
		Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[] input2 = new int[input1]; //input1 ũ������ �迭�����
	    for(int i =0;i< input1;i++) {	    	
	    	input2[i] += in.nextInt(); //�迭�� ���� ����
	    }
	    
	    for(int x : B.solution(input1, input2)) {
	    	System.out.print(x + " ");
	    }
	    
	}

}
