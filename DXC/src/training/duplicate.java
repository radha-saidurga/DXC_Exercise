package training;
public class duplicate {
public static void main(String[] args) 
    {
        String[] str = {"java", "inheritance", "exception", "java", "class", "obj", "class"};
 
        for (int i = 0; i < str.length-1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if( (str[i].equals(str[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+str[j]);
                }
            }
        }
    }    
}
