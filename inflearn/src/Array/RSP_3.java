package Array;

import java.util.Scanner;

/*
3. ���� ���� ��
����

A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.

����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.

���� ��� N=5�̸�

Image1.jpg

�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.

�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.


���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.
*/

public class RSP_3 {

	public char[] solution(int num, int[] a , int[] b) {
		char[] answer = new char[num];
		String str ="";
		for(int i =0; i<num ; i++) {
			if(a[i] == b[i]) {
				str +="D";
			}else if(a[i] == 1 && b[i] ==3) {
				str +="A";
			}else if(a[i]==2 && b[i] ==1) {
				str +="A";
			}else if(a[i] == 3 && b[i]==2) {
				str +="A";
			}else {
				str +="B";
			}
		}
		answer = str.toCharArray();
		
		return answer;
	}

	public static void main(String[] args) {
		RSP_3 R = new RSP_3();
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);	
	    int num = in.nextInt();	    	//����Ƚ��
	    int[] a = new int[num];			//A�� ����������
	    int[] b = new int[num];			//B�� ����������
	    
	    for(int i=0; i<num;i++) {
	    	a[i] = in.nextInt();
	    
	    }
	    for(int i=0; i<num;i++) {
	    	b[i] = in.nextInt();
	    }
	    for(char x : R.solution(num, a, b)) {
	    	System.out.println(x);
	    }
	}

}
