package Array;

import java.util.Scanner;
/*
2. 보이는 학생
설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.

*/
public class Student_2 {
	
	public int solution(int num, int[] arr) {
		int answer = 1; //첫번째 사람은 무조건 보이기 때문에 1로 초기화
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
