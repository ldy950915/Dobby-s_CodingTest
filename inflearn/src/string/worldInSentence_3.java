package string;

import java.util.Scanner;

/*3. ���� �� �ܾ�
����

�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.

������� �� �ܾ�� �������� ���е˴ϴ�.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

*/
public class worldInSentence_3 {

	public String solution(String str) {
		String answer = "";
		String[] arr = str.split(" ");//it is time to study : ���� �������� �迭�� �ܾ� ����
		int max = Integer.MIN_VALUE;
		for(String x : arr) {
			if(x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		worldInSentence_3 W = new worldInSentence_3();
		
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();	//���پ� �б�
	    
	    System.out.println(W.solution(input1));
	    
	    
	    
	}

}
