package DFS_BFS;

public class subset_6 {

	static int num;	//값
	static int[] ch;//o,x체크
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
			ch[L] = 1;	//왼쪽은 1
			DFS(L+1);		//왼쪽
			ch[L] =0;	//오른쪽은 0
			DFS(L+1);		//오른쪽
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset_6 S = new subset_6();
		num =3;
		ch = new int[num +1]; //0배열 초기화
		S.DFS(1);
	}

}
