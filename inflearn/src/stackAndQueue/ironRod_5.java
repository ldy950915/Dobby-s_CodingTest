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
			}else {	//닫는괄호
				stack.pop(); //일단 닫는괄호 만나면 삭제
				if(str.charAt(i-1) == '(') {	//앞에 (일 경우 레이저 
					answer += stack.size();
				}else {	//아닐경우 1개만 더하기
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
