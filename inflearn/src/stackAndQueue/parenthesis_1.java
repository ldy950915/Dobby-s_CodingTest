package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_1 {

	//괄호 문제일 경우 stack 확율이 높음
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		for(char x : s.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}else {
				//닫는괄호일때 stack이 비어있을경우
				if(stack.isEmpty()) {
					answer = "NO";
				}else {					
					stack.pop();
				}
			}
		}
		//다 돌았는데도 여는 괄호가 남아있는 경우
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
