package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class PanagramString {

	public static void main(String[] args) {
		System.out.println(isPanagram("abcdeFFhijklmnOpqrstuvwxyz"));
		

	}
	public static boolean isPanagram(String str)
	{
		if(str.length()<26 || str.length()>26) {
		return false;}
		
		List<String> list= new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			String temp=String.valueOf(str.charAt(i));
			temp=temp.toUpperCase();
			if(!(list.contains(temp)))
			{
				
				list.add(temp);
			}
			
		}
		
		if(list.size()==26)
			return true;
		return false;
	}

}
