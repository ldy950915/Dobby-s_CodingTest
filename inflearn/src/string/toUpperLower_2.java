package string;

import java.util.Scanner;

/*2. 대소문자 변환
설명

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/
public class toUpperLower_2 {

	public String solution(String str){
		
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			}else {
				answer += Character.toUpperCase(x);
			}
			
		}
		
		/*
		 * char[] arr = new char[str.length()];
		 * 
		 * for(int i =0; i < str.length();i++) { char c = str.charAt(i);
		 * 
		 * if(Character.isUpperCase(c)) { c = Character.toLowerCase(c); }else {
		 * 
		 * c= Character.toUpperCase(c); } arr[i] = c; }
		 * 
		 * String answer = new String(arr);
		 */
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toUpperLower_2 t = new toUpperLower_2();
		
		Scanner in = new Scanner(System.in);
	    String input1 = in.next();
	  
	    System.out.println(t.solution(input1));
	    
	}

}
