package p3;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void doTransactions(List<? extends Payment> arr) {
		for(Payment p:arr) {
			p.doPayment();
		}
	}
	public static void main(String[] args) {
		CardPayment[] card = {new CardPayment(8000), new CardPayment(7000)};
		
		CashPayment[] cash = {new CashPayment(6000), new CashPayment(9000)};
		
		List<CardPayment> card2=Arrays.asList(card);
		List<CashPayment> cash2=Arrays.asList(cash);
		
		doTransactions(card2);
		doTransactions(cash2);
	}
}
