package training;
import java.util.*;

public class Anagram {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of test cases: ");
		int n = sc.nextInt();
		String arr[] = new String[n+1];
		String arr1[] = new String[n+1];
		
		for(int i =0; i<=n;i++)
		{
		String s = sc.nextLine();
		arr = s.split(" ");
		arr1[i] = arr[arr.length-1];
		}
		
		for(int i =0; i<=n;i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("Enter 1st string: ");
		String s1 = sc.nextLine();

		System.out.println("Enter 2nd string: ");
		String s2 = sc.nextLine();
		
		
	   if(anagram(s1,s2))
	   {
		   System.out.println("Anagram");
	   }
	   else
		   System.out.println("Not Anagram");
	
			
		
	}
	
	public static boolean anagram(String s1, String s2)
	{
		s1.replaceAll("\\s","");
		s2.replaceAll("\\s","");
		
		 int c =0;
			for(int i =0 ;i<s1.length();i++)
			{
				for(int j =0 ; j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						{++c;break;}
					
				}
			}
			if(c==s1.length())
				return true;
		
		
		
		return false;
	}

}
