package Array;

import java.util.Scanner;
/*
2. ���̴� �л�
����

�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�

�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)


�Է�
ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.


���
�������� �� �� �ִ� �ִ��л����� ����Ѵ�.

*/
public class Student_2 {
	
	public int solution(int num, int[] arr) {
		int answer = 1; //ù��° ����� ������ ���̱� ������ 1�� �ʱ�ȭ
		int max = arr[0];
		
		for(int i =1; i<num; i++) {
			if(arr[i] > max) {
				answer ++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_2 S = new Student_2();
		
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = in.nextInt();
		}
		
	    System.out.println(S.solution(num, arr));
	    
	}

}
