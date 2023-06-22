package com.sp.project0621.use;
import com.sp.project0621.bank.Account;

class UseAccount {
	public static void main(String[] args) {
		Account acc= new Account();
		acc.balance=-50000000;
		System.out.println(acc.balance);
	}
}
