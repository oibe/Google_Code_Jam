import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Googlerese 
{
	static HashMap<Character,Character> map;
	public static String translate(String input)
	{
		String result = "";
		for(int i = 0; i < input.length();i++)
			if(map.containsKey(input.charAt(i)))
				result+=map.get(input.charAt(i));
			else
				result+=input.charAt(i);
		return result;
	}
	public static void main(String[] args) 
	{
		String[] foreign = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String[] translated = {"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"};
		 map = new HashMap<Character,Character>();
		 map.put('a', 'y');
		 map.put('e','o');
		 map.put('z', 'q');
		 map.put('q', 'z');
		for(int i = 0; i < foreign.length;i++)
		{
			String f = foreign[i];
			String t = translated[i];
			for(int j =0; j < f.length();j++)
				if(!map.containsKey(f.charAt(j)))
					map.put(f.charAt(j), t.charAt(j));
		}
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\oibe\\Desktop\\A-small-attempt5.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(map.keySet());
		int cases = Integer.parseInt(sc.nextLine());
		for(int k = 1; k <= cases;k++)
			System.out.println("Case #"+k+": "+translate(sc.nextLine()));
	}
		
	

}
