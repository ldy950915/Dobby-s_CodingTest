package string;

import java.util.Scanner;

/*4. �ܾ� ������
����

N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.

�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.

*/
public class flipOverWord_4 {

	public String[] solution(String[] str) {
		String[] answer = new String[str.length];
		int i= 0;
		for(String x : str) {
			String reverse = new StringBuilder(x).reverse().toString();	//������ �Լ�
			answer[i] = reverse;
			i++;			
		}
		return answer ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flipOverWord_4 f = new flipOverWord_4();

		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    String[] arr = new String[n];

	    for(int i =0; i<n;i++) {
	    	arr[i] = in.next();
	    }
	    

	    for(int i = 0; i < n ; i ++) {
	    	System.out.println(f.solution(arr)[i]);
	    }	    
	}

}
