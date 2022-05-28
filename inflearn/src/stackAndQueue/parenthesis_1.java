package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_1 {

	//��ȣ ������ ��� stack Ȯ���� ����
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		for(char x : s.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}else {
				//�ݴ°�ȣ�϶� stack�� ����������
				if(stack.isEmpty()) {
					answer = "NO";
				}else {					
					stack.pop();
				}
			}
		}
		//�� ���Ҵµ��� ���� ��ȣ�� �����ִ� ���
		if(!stack.isEmpty()) {
			answer = "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		parenthesis_1 P = new parenthesis_1();
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String s =in.next();
	    System.out.println(P.solution(s));
	}

}
