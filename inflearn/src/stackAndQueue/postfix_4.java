package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class postfix_4 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48); //�ƽ�Ű �ڵ忡�� -48�� �ϸ� ������ ����
			}else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+') {
					stack.push(lt+rt);
				}else if(x=='-') {
					stack.push(lt-rt);
				}else if(x=='*') {
					stack.push(lt*rt);
				}else if(x=='/') {
					stack.push(lt/rt);
				}
			}
		}
		answer = stack.get(0);	//������ 0��°�� ��
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postfix_4 P = new postfix_4();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(P.solution(str));
	}

}
