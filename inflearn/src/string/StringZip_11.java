package string;

import java.util.Scanner;

/*
11. ���ڿ� ����
����

���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�

���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.
*/
public class StringZip_11 {

	public String solution(String str) {
		int cnt = 1;

		String answer = "";
		
		for(int i=0;i<str.length();i++) {
			if(i+1 == str.length()) {
				
				if(cnt >1) {
					answer += str.charAt(i) + String.valueOf(cnt);					
				}else {
					answer += str.charAt(i);
				}
				
				break;
			}else {
				
				if(str.charAt(i) == str.charAt(i+1)) {
					cnt ++;
				}else {
					if(cnt >1) {
						answer += str.charAt(i) + String.valueOf(cnt);					
					}else {
						answer += str.charAt(i);
					}
					cnt = 1;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringZip_11 S = new StringZip_11();
		Scanner in=new Scanner(System.in);
	    String str = in.next();
		
	    System.out.println(S.solution(str));
	    
	}

}
