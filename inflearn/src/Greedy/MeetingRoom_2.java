package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Time implements Comparable<Time>{
	public int s,e;
	Time(int s, int e) {
		// TODO Auto-generated constructor stub
		this.s = s;	//����
		this.e = e;	//��
	}
	
	@Override
	public int compareTo(Time t) {	//���Ĺ��
		// TODO Auto-generated method stub
		if(this.e == t.e) return this.s-t.s; //��������
		else return this.e-t.e;	//
	}
	
}
public class MeetingRoom_2 {
	
	public int solution(ArrayList<Time> arr, int n) {
		int answer = 0;
		Collections.sort(arr);	//Comparable �޼ҵ�� �ڵ����� ����
		int endTime = 0; //������ �ð��� 0���� �ʱ�ȭ
		for(Time t : arr) {
			if(t.s >= endTime) {
				answer++;
				endTime = t.e; //����Ǳ� ������ t�� endTime�� �־���
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRoom_2 M = new MeetingRoom_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<Time>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(M.solution(arr,n));
	}

}
