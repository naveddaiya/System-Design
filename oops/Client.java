package oops;
public class Client {
    public static void main(String[] args) {
        PaymentService pm = new PaymentService();

        pm.addPaymentMethod("NavedDebitCard", new DebitCard("1234", "Naved"));
        pm.addPaymentMethod("NavedCreditCard", new CreditCard("4567", "Naved"));

        pm.makePayment("NavedCreditCard");
    }
}
