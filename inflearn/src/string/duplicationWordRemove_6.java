package string;

import java.util.Scanner;

/*6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

*/

public class duplicationWordRemove_6 {

	public String solution(String str) {
		String answer = "";
		
		for(int i =0;i<str.length() ; i++) {
		//	System.out.println(str.charAt(i) + " " + i + " " +str.indexOf(str.charAt(i)));
		//indexOf 함수는 중복되는 문자를 비교하면 먼저 담긴 위치 번호를 리턴한다
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicationWordRemove_6 dwr = new duplicationWordRemove_6();

		Scanner in=new Scanner(System.in);
	    String str = in.next().toLowerCase();
	    
	    System.out.println(dwr.solution(str));
	}

}
