package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class pStringRemove_2 {

	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}else {
				stack.push(x);
			}
		}
		for(int i=0; i<stack.size();i++) {
			answer +=stack.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pStringRemove_2 P = new pStringRemove_2();
		Scanner in=new Scanner(System.in);
		String str = in.next();
		System.out.println(P.solution(str));
	}

}
