// hello some change
package com.web.CustomerWebService;

public class Customer {
	
	public int id;
	public String name;
	public double balance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	Customer(){}
	Customer(int id, double balance, String name)
	{
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	
	
	public void printCustomerDetails()
	{
		String space = "  ";
		System.out.println(id+space+balance+space+name);
	}
}
