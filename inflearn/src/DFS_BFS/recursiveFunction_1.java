package DFS_BFS;

//재귀함수 - 깊이 우선 탐색
public class recursiveFunction_1 {
	//무한적으로 작동되므로 if~else로 멈추게 하기!
	public void DFS(int n) {
		if(n==0) {
			return;//void에서는 종료를 뜻함.
		}else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveFunction_1 R = new recursiveFunction_1();
		R.DFS(3);
	}

}
