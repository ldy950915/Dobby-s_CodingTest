package Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class president_1 {

	public char solution(int n , String str) {

		char answer = ' ';
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) +1); 	//getOrDefault map에 value 값이 있으면 x +1 없으면 0 + 1 넣어주기
		}
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		president_1 P = new president_1();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		System.out.println(P.solution(n, str));
	}

}
