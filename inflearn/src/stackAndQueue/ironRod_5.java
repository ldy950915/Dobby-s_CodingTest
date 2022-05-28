package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ironRod_5 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}else {	//�ݴ°�ȣ
				stack.pop(); //�ϴ� �ݴ°�ȣ ������ ����
				if(str.charAt(i-1) == '(') {	//�տ� (�� ��� ������ 
					answer += stack.size();
				}else {	//�ƴҰ�� 1���� ���ϱ�
					answer++;
				}
				
			}
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		ironRod_5 I = new ironRod_5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(I.solution(str));
	}

}
