package string;

import java.util.Scanner;

/*6. �ߺ���������
����

�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.

*/

public class duplicationWordRemove_6 {

	public String solution(String str) {
		String answer = "";
		
		for(int i =0;i<str.length() ; i++) {
		//	System.out.println(str.charAt(i) + " " + i + " " +str.indexOf(str.charAt(i)));
		//indexOf �Լ��� �ߺ��Ǵ� ���ڸ� ���ϸ� ���� ��� ��ġ ��ȣ�� �����Ѵ�
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicationWordRemove_6 dwr = new duplicationWordRemove_6();

		Scanner in=new Scanner(System.in);
	    String str = in.next().toLowerCase();
	    
	    System.out.println(dwr.solution(str));
	}

}
