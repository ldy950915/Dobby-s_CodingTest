package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
4. �Ǻ���ġ ����
����

1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.

2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.


�Է�
ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.


���
ù �ٿ� �Ǻ���ġ ������ ����մϴ�.

*/
public class fibonacciNumbers_4 {

	public int[] solution(int num) {
		int[] answer = new int[num];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2;i<num;i++) {
			answer[i] = answer[i-1]+answer[i-2];
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciNumbers_4 F = new fibonacciNumbers_4();
		
		Scanner in=new Scanner(System.in);
	    int num = in.nextInt();
	    
	    for(int x : F.solution(num)) {
	    	System.out.println(x+" ");
	    }


	}

}
