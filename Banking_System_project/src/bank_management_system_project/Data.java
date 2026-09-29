package bank_management_system_project;

import java.util.Comparator;
import java.util.Scanner;

public class Data  {
	
	// private premetives
	private double balance;
	private double dwposite;
	private double withdraw;

	// getters and seters
	public double getBalance() {
		return balance;
	}
	public double getDwposite() {
		return dwposite;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setDwposite(double dwposite) {
		this.dwposite = dwposite;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	//----------------------------------------------------------------
	
	// user info private premetives
	private String acHolder;
	private long acountNumber;
	private String userID;
	private Object getBalance;
	
	
	

	
	// get and set methods
	public String getAcHolder() {
		return acHolder;
	}
	public long getAcountNumber() {
		return acountNumber;
	}
	public String getUserID() {
		return userID;
	}
	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}
	public void setAcountNumber(long acountNumber) {
		this.acountNumber = acountNumber;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	//------------------------------------------------------------
	
	// default constructors
	public Data() {
		
	}
	// parameterise constructor    assinging it
	public Data(String acHolder , long acountNumber,String userID , double balance ) {
		this.setAcHolder(acHolder);
		this.setAcountNumber(acountNumber);
		this.setUserID(userID);
		this.setBalance(balance) ;
	
//this set variables = local variables
		
		
		
	}
	
	
	
	
	

}
