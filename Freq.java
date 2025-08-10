package Hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Freq {
	public static void main(String[] args) {
		HashMap<Character,Integer>s=new HashMap<>();

		String st="balaji";
		for(char ch:st.toCharArray()) {
			s.put(ch,s.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>i:s.entrySet()) {
			if(i.getValue()==1) {
				System.out.println(i.getKey());
			}
		}
		System.out.println(s);
	}

}
