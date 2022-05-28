package string;

import java.util.Scanner;

/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

*/
public class ShortestString_10 {

	public int[] solution(String str , char c) {
		
		char[] ch = str.toCharArray(); //teachermode
		int[] answer = new int[ch.length]; //담을 공간
		
		System.out.println(ch);
		System.out.println(c);
		int p = 1000;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != c) {
				p ++;
			}else {
				p=0;
			}
			answer[i] = p;
		}
		
		p=1000; //1000으로 다시 초기화
		for(int j = ch.length-1; j >= 0;j--) { 
			if(ch[j] != c) {
				p ++;
			}else {
				p=0;
			}
			answer[j] = Math.min(answer[j], p); 
		}
		//teachermode e
	
		return answer;
	}
	public static void main(String[] args) {
		ShortestString_10 S = new ShortestString_10();
		
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    char input2 = in.next().charAt(0); //문자하나만 가져오기
	    
	    for(int x : S.solution(input1, input2)) {
	    	System.out.print( x + " ");
	    }
	    
	}

}
