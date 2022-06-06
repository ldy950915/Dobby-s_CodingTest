package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//�۾��� ã��
public class findCalf_8 {
	int answer = 0;//�ּ� Ƚ��
	int[] dis = {1,-1,5};//�̵�
	int[] ch;//�湮 üũ
	Queue<Integer> Q = new LinkedList<Integer>(); //���� ���� 
	public int BFS(int s, int e) {
		ch = new int[10001]; //�������� indexũ�Ⱑ 10000�̶� ��� �Ǿ�����.
		ch[s] = 1; //��������� 1~10000����
		Q.offer(s);	//Q�� ��� ���� �ʱⰪ ����
		int L = 0;//��Ʈ ��� - ������ 0����
		while(!Q.isEmpty()) { //Q�� ���� �������� while�� ����
			int len = Q.size();//������ �ִ� ������ ����
			for(int i =0; i<len; i++) {
				int x = Q.poll();
				System.out.println("x :" + x);
				for(int j=0;j<3;j++) {
					int nx = x+dis[j];
					if(nx==e) return L+1; //�θ��� �����̶� +1�� �������
					if(nx >1 && nx<=10000 && ch[nx]==0) { //ch[nx] ==0 -> �湮 üũ ����
						ch[nx] = 1; //�ű� ��� �� 1�� �� �ֱ�
						Q.offer(nx);
					}
				}
			}
			L++;//���� ����
		}
		return answer;
	}
	
	public static void main(String[] args) {
		findCalf_8 F = new findCalf_8();
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();	//���� ��ġ
		int e = in.nextInt(); 	//�۾��� ��ġ
		System.out.println(F.BFS(s, e));
	}

}
