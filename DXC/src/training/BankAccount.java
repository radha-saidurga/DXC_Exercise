package training;
class BankAccount
{
   public static void main (String [] args)
   {
      FTrans ft = new FTrans ();
      TThread t1 = new TThread (ft, "Deposit Thread");
      TThread t2 = new TThread (ft, "Withdrawal Thread");
      t1.start ();
      t2.start ();
   }
}
class FTrans
{
   public static String tName;
   public static double amount;
}
class TThread extends Thread
{
   private FTrans ft;
   TThread (FTrans ft, String name)
   {
      super (name); 
      this.ft = ft; 
   }
   public void run ()
   {
      for (int i = 0; i < 5; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               ft.tName = "Deposit";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 5000.0;
               System.out.println (ft.tName + " " + ft.amount);
             
           }
           else
           {
               ft.tName = "Withdrawal";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 100.0;
               System.out.println (ft.tName + " " + ft.amount);
           }
      }
   }
}