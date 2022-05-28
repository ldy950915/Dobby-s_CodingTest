package string;

import java.util.Scanner;

public class specificWordChange_5 {

	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray(); //문자배열로 변경
		int lt = 0 , rt = str.length() -1 ; //배열은 0번째 부터이므로  -1 해줘야함
		
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(c);
		//toString()과 같은 경우 Null PointerException(NPE)을 발생시키지만 valueOf는 "null"이라는 문자열로 처리한다.

		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specificWordChange_5 sf = new specificWordChange_5();
		
		Scanner in=new Scanner(System.in);
		String str = in.next();
		
		System.out.println(sf.solution(str));
		
	}

}
