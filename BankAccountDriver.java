package encapsulation;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount ac = new BankAccount("SBI","HADGAON","SBI!@#$","Shital Dashrath Pawar",12345678901l,123,10000.00);
		
		ac.displayDetails();
		
		ac.withdrawMoney(12345678901l, 123,500.00);
//		ac.withdrawMoney(12345678901l, 123,500.00);
		
		
//		ac.updatePin(12345678901l);
//		ac.updatePin(12345678909l);
	}

}
