package training;

public class Check {
	public static void main(String args[])
	{
		String[] stringArray = new String[]{"Radha", "deepthi", "likki", "Shruthi", "Amrutha"};
		boolean found = false;
		String searchedValue = "deepthi";

		for(String x : stringArray){
		    if(x.equals(searchedValue)){
		        found = true;
		        break;
		    }
		}

		System.out.println(found);
	}

}
