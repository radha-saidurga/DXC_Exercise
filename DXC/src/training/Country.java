package training;
import java.util.*;
class country
{   String name;
   
	List<state> countrylist = new ArrayList<state>();
	
	 void setlist(state s)
	{
		countrylist.add(s);
	}
	 List getlist()
	{
		return countrylist;
	}
}