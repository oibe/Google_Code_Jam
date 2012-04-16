import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


public class RecycledNumbers 
{
	static HashSet<String> set;
	public static int solve(int A, int B)
	{
		int count = 0;
		for(int n = A; n < B;n++)
		{
			String temp = n+"";
			int len = temp.length();
			for(int j = 0;j < len-1;j++)
			{
				temp = temp.charAt(len-1)+temp.substring(0,len-1);
				
				int m = Integer.parseInt(temp);
				if(set.contains(""+m))
					continue;
				if(m > n && m <= B)
					count++;
					
				set.add(""+m);
			}
			set.clear();
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		set = new HashSet<String>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\oibe\\Desktop\\C-large.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int numCases = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= numCases;i++)
		{
			String[] vals = sc.nextLine().split(" ");
			int A = Integer.parseInt(vals[0]);
			int B = Integer.parseInt(vals[1]);
			System.out.println("Case #"+i+": "+solve(A,B));
		}
	}

}
