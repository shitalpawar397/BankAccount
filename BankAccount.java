package encapsulation;

public class BankAccount
{
	private String bankName;
	private String location;
	private String ifsccode;
	private String account_holder_name;
	private long account_no;
	private int  pin;
	private double balance;
	
	
	public double getBalance() {
		return balance;
	}

	

	public String getBankName() {
		return bankName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getIfsccode() {
		return ifsccode;
	}
	
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	
	public long getAccount_no() {
		return account_no;
	}
	
	public double getPin() {
		return pin;
	}
	
	public void setPine(int pin) {
		this.pin = pin;
	}
	
	
	BankAccount()
	{
		
	}
	
	
	BankAccount(String bankName,String location,String ifsccode,String account_holder_name,long account_no,int  pin,double balance)
	{
		this.bankName = bankName;
		this.location = location;
		this.ifsccode = ifsccode;
		this.account_holder_name = account_holder_name;
		this.account_no = account_no;
		this.pin = pin;
		this.balance = balance;
	}
	
	public void withdrawMoney(long account_no,int pin,double withdraw)
	{
		if(this.account_no == account_no && this.pin== pin)
		{
			
			
			if( balance >= 500)
			{
//				System.out.println("Enter amount to be withdraw:");
//				double withdraw = 0 ;
				balance = balance - withdraw;
				System.out.println("Withdraw Amount 500");
				System.out.println("Your Current Balance:"+balance);
			}
			else
			{
				System.out.println("Sorry... You don't have efficient balance");
				
			}
		}
		else
		{
			System.out.println("INVALID CREDENTIALS");
		}
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name Of Bank : "  +bankName);
		System.out.println("Location Of Bank : "  +location);
		System.out.println("IFSC Code  Of Bank : "  +ifsccode);
		System.out.println("Account Holder Name : "  +account_holder_name);
		System.out.println("Account number : "  +account_no);
		System.out.println("Balance : "  +balance);
	}
	
	
	public void updatePin(long account_no)
	{
		if(this.account_no == account_no)
		{
			System.out.println("Pin Changed");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
}
