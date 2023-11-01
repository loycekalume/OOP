package topicinheritance;
class BankAccount{
	int acNO;
	String acName,acPhone,acEmail;
	double acBal;
	public BankAccount(int acNO, String acName, String acPhone, String acEmail, double acBal) {
		this.acNO=acNO;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.acBal=acBal;
		
		}
	public void accountholder() {
		System.out.println("Account Number :"+acNO);
		System.out.println("Account Holder Name :"+acName);
		System.out.println("Account Holder Phone:"+acPhone);
		System.out.println("Account Holder Address:"+acEmail);
		System.out.println("Account Holder Balance:"+acBal);
	}
	public void deposit(double amount) {
		acBal+=amount;
		System.out.println("Deposited:$"+amount);
		}
	public void displayBalance(){
		System.out.println("Account Number:"+ acNO+"Balance: $"+ acBal);
	  }	
	}
class SavingsAccount extends BankAccount{
	public SavingsAccount(int acNO, String acName, String acPhone, String acEmail, double acBal) {
		super(acNO,acName,acPhone,acEmail,acBal);
  }}
class CurrentAccount extends BankAccount {
	public CurrentAccount(int acNO, String acName, String acPhone, String acEmail, double acBal) {
		super(acNO,acName,acPhone,acEmail,acBal);
	  }
}
			

public class Account {

	public static void main(String[] args) {
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount sac= new SavingsAccount(1001,"Ann Kamau","07200000","test@gmail.com",1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
		System.out.println("CURRENT ACCOUNT DETAILS");
		CurrentAccount cac= new CurrentAccount (1001,"Peter Smith","08100000","admin@gmail.com",0);
		cac.accountholder();
		cac.deposit(300);
		cac.displayBalance();
		
		
	

	}

}
