package training;
import java.lang.Math;
class Random
{

 public static void main(String args[])
{
  int a[] = new int[101];
  for(int i=1;i<=100;i++)
   a[i] = (int)(Math.random()*100);
 for(int i=1;i<=100;i++)
 System.out.print(a[i]+" ");
}
}
