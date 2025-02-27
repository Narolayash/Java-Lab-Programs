// Create a class named Bank_Account with data memebers accountNo, userName, email, 
// accountType and accountBalance, Also create methods setAccountDetails() and 
// displayAccountDetails().

// import java.util.Scanner;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	public void setAcoountDetails(int accountNo, String userName, String email, String accountType, double accountBalance){
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public void displayAccountDetails(){
		System.out.println("Account Number  = " + accountNo);
		System.out.println("User Name = " + userName);
		System.out.println("Email = " + email);
		System.out.println("Account Type = " + accountType);
		System.out.println("Blaance = " + accountBalance);		
	}

	public String getAccountDetails(){
		return accountNo +" "+ userName +" "+ email +" "+ accountType +" "+ accountBalance;
	}

}

public class P6A4{
	public static void main(String[] args){
		Bank_Account b1 = new Bank_Account();
		b1.setAcoountDetails(101, "Nakul Kachva", "nakual_kachva@gmail.com", "SA", 400000);
		// b1.displayAccountDetails();


		String s1 = b1.getAccountDetails();
		System.out.println(s1); 
	}
}