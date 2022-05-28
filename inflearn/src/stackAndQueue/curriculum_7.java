package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class curriculum_7 {

	public String solution(String str , String hyun) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<Character>();
		
		//필수과목
		for(char x : str.toCharArray()) {
			Q.offer(x);
		}
		//현수가 짠 수업
		for(char c : str.toCharArray()) {
			if(Q.contains(c)) {
				if(c!=Q.poll()) {
					answer="NO";
					break;
				}
			}
		}
		//필수과목을 수강 안했을 경우
		if(!Q.isEmpty()) {
			answer = "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		curriculum_7 C = new curriculum_7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String hyun = sc.next();
		
		System.out.println(C.solution(str, hyun));
	}

}
