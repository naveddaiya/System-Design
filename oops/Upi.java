package oops;
public class Upi implements PaymentMethod{
    
    String upiId;

    @Override
    public void pay(){
        System.out.println("making payment via UPI " +upiId);
    }

}
