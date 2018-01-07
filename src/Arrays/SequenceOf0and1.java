package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SequenceOf0and1 {

	public static void main(String[] args) {
		String pattern = "0?0?";

		System.out.println(add(pattern));
	}
	
	public static List<String> add(String pattern) {
		
		List<String> list = new ArrayList<>();
		
		if(!pattern.contains("?")) {
			list.add(pattern);
		}else {
			int pos = pattern.indexOf("?");
			String newstring = pattern.substring(0, pos)+"0"+pattern.substring(pos+1);
			String newstring1= pattern.substring(0, pos)+"1"+pattern.substring(pos+1);
			
			list.addAll(add(newstring));
			list.addAll(add(newstring1));
			
		}
		return list;
	}

}
