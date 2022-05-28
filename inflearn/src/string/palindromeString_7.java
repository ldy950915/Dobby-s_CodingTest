package string;

import java.util.Scanner;

public class palindromeString_7 {

	public String solution(String str) {
		Boolean t = true;
		char[] c = str.toCharArray();
		int lt=0;
		int rt=str.length()-1;
		
		while(lt<rt) {
			if(c[lt]!=c[rt]) {
				t = false;
				break;
			}
			lt++;
			rt--;
		}
		
		return t?"YES":"NO";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeString_7 P = new palindromeString_7();
		
		Scanner in=new Scanner(System.in);
	    String str = in.next().toLowerCase();
		
	    System.out.println(P.solution(str));
	}

}
