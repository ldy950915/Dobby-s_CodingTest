package string;

import java.util.Scanner;

/*
10. ���� ª�� ���ڰŸ�
����

�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.

���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.

*/
public class ShortestString_10 {

	public int[] solution(String str , char c) {
		
		char[] ch = str.toCharArray(); //teachermode
		int[] answer = new int[ch.length]; //���� ����
		
		System.out.println(ch);
		System.out.println(c);
		int p = 1000;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != c) {
				p ++;
			}else {
				p=0;
			}
			answer[i] = p;
		}
		
		p=1000; //1000���� �ٽ� �ʱ�ȭ
		for(int j = ch.length-1; j >= 0;j--) { 
			if(ch[j] != c) {
				p ++;
			}else {
				p=0;
			}
			answer[j] = Math.min(answer[j], p); 
		}
		//teachermode e
	
		return answer;
	}
	public static void main(String[] args) {
		ShortestString_10 S = new ShortestString_10();
		
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    char input2 = in.next().charAt(0); //�����ϳ��� ��������
	    
	    for(int x : S.solution(input1, input2)) {
	    	System.out.print( x + " ");
	    }
	    
	}

}
