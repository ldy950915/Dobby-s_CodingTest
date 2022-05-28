package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram_2 {

	public String solution(String input1 , String input2) {
		String answer = "YES";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char x : input1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) +1);
		}
		
		for(char x : input2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x)-1);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram_2 A = new anagram_2();
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		
		System.out.println(A.solution(input1, input2));
	}

}
