package training;

public class Holiday {
	
	private String name;
	private int day; 
	private String month;

public String setname()
{       this.name="ugadhi";
		return name;
}
	public int setday()
	{       this.day=13;
			return day;
	}
	public String setmonth()
	{       this.month = "apr";
			return month;
	}
 public static void main(String args[])
 {
	 Holiday h = new Holiday();
	 System.out.println(h.setday()+"-"+h.setmonth()+"="+h.setname());
 }
		
	
}


