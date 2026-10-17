interface payment 
{
	void pay(double amount);
}
interface Upipayment extends payment
{
	void verifyupi();
}
interface Cardpayment extends Payment
{
	void validatecard();
}
class Googlepay implements Upipayment
{
	public void Pay(double amt) 	
	{
		System.out.println("Payment of RS."+amt+"iscompleted");
	}
	public void verifyupi(){
		System.out.println("upi successful");
	}
}
class Viscard implements Cardpayment
{
   public void pay(double amt)
   {
      System.out.println("payment of Rs: "+ iscompleted);
   }
}
public class ExtendInterface
{
   public static void main(String[] args)
   {
      Googlepay gpay = new Googlepay();
      gpay.verifyupi();
      gpay.pay(2500.00);
      Viscard card = new Viscard();
      card.validatecard();
      card.pay(5500.00);
   }
}

