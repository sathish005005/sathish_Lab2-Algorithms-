package com.greatlearning.transaction.main;

import java.util.Scanner;

import com.greatlearning.transaction.service.TransactionService;


public class TransactionDriver {
	public static void main (String [] args) {
           Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter the size of the Transaction array");
		 
		 int size =s.nextInt();
		 int arr [] = new int[size];
		 
		 System.out.println("Enter the values of the array");
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 System.out.println("Enter the total number of targets needs to be achieved");
		 int targetNo = s.nextInt();
		 
		 TransactionService transactionService = new TransactionService();
		 transactionService.checkTransaction(arr,targetNo);
		 
		 s.close();
	}

}
