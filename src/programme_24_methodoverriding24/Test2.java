package programme_24_methodoverriding24;
//Test class to create object and call the methods.
public class Test2 {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        Axis a =new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("Axis Rate Of Interest: "+a.getRateOfInterest());
    }
}
