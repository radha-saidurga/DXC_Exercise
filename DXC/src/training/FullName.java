package training;

public class FullName {
	public static void main(String [] ags) {
		String name="Kaithepalli Radha ";
				StringBuffer myfullname = new StringBuffer();
		int length = name.length();
		for(int i =0;i<length;i++)
		{
			if(Character.isUpperCase(name.charAt(i))) {
				myfullname.append(name.charAt(i));
			}
		}
		System.out.println("My intial is:"+myfullname);
	}

}
