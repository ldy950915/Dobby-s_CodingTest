package DFS_BFS;

public class subset_6 {

	static int num;	//��
	static int[] ch;//o,xüũ
	public void DFS(int L) {
		if(L == num+1) {
			String tmp = "";
			for(int i=1;i<=num;i++) {
				if(ch[i] == 1) {
					tmp +=i + " ";
				}
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
			
		}else {
			ch[L] = 1;	//������ 1
			DFS(L+1);		//����
			ch[L] =0;	//�������� 0
			DFS(L+1);		//������
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset_6 S = new subset_6();
		num =3;
		ch = new int[num +1]; //0�迭 �ʱ�ȭ
		S.DFS(1);
	}

}
