package training;


class Bank{  
float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
float getRateOfInterest(){return 4.4f;}  
}  
class ICICI extends Bank{  
float getRateOfInterest(){return 6.3f;}  
}  
class PNB extends Bank{  
float getRateOfInterest(){return 7.6f;}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Bank b;  
b=new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new PNB();  
System.out.println("PNB Rate of Interest: "+b.getRateOfInterest());  
}  
} 
