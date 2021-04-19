package training;

import java.util.Comparator;

class sortcountry implements Comparator<state>
{
	public int compare(state s1, state s2)
	{
		int cnamecom = s1.getcname().compareTo(s2.getcname());
		int snamecom = s1.getsname().compareTo(s2.getsname());
		return (snamecom==0)?cnamecom:snamecom;
	}
}