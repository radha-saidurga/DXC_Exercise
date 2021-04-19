package training;

import java.util.Collections;
import java.util.Scanner;

public class SCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		country ct = new country();
		Scanner sc = new Scanner(System.in);
		String str;
	
		for(int i=0;i<10;i++)
		{  	String ar[] = new String[2];
			str = sc.next();
			str.replace('|',' ');
			ar = str.split(" ");
			state st = new state();
			st.setname(ar[0], ar[1]);
			ct.setlist(st);
			
		}
		
		Collections.sort(ct.countrylist, new sortcountry());
		
		for(state a : ct.countrylist)
			System.out.println(a.getcname()+" "+a.getsname());
		
		

	}

}
