package pack1;

public class Bank {
	private int amount;
	private int CustomerId;
	private String customerName;
	
	public Bank(int cId,int amt,String cName) {
		this.amount = amt;
		this.CustomerId = cId;
		this.customerName = cName;
	}
	
	public boolean verifyCustomerDetails(int cId ,String cName) {
		return this.CustomerId == cId && this.customerName == cName;
	}
	
	public int checkBalance(){
		return amount;
	}
	
	public boolean withdraw(int amt){
		if(this.amount < amt)
			return false;
		this.amount -= amt;
		return true;
	}
}
