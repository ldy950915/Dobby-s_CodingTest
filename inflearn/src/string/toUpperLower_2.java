package string;

import java.util.Scanner;

/*2. ��ҹ��� ��ȯ
����

�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
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
