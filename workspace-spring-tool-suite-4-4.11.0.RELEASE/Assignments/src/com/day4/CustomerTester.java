package com.day4;

public class CustomerTester {
	
	public void acceptCutomerInfo(){
	//Displaying the menu in the console
	System.out.println("\n\n\tPlease enter the details of the customer");
	//accepting the customer id
	System.out.print("Customer Id :"); String custId=ReadData.acceptString();
	//accepting the customer name
	System.out.print("Customer Name :"); String custName=ReadData.acceptString();
	Customer customer=new Customer(); customer.setCustomerId(Integer.parseInt(custId)); customer.setCustomerName(custName);
	int status=new CustomerFileDB().saveCustomer(customer);
	if(status==0){
	System.out.println("Your details are saved"); 
	ReadData.acceptString(); 
	System.out.println("\n\n\n\n\n\n\n");
	}else{
	System.out.println("Your details could not be saved.Please try later");
	ReadData.acceptString();
	System.out.println("\n\n\n\n\n\n\n");
	}
	}
	public void displayCustInfo(){
	//Accepting the customer id 
	System.out.print("\n\nPlease enter customer Id :"); String custId=ReadData.acceptString();
	Customer customer=new
	CustomerFileDB().getCustomer(Integer.parseInt(custId));
	if(customer!=null){
	//displaying the details
	System.out.println("\n Customer Id
	"+customer.getCustomerId());
	System.out.println(" Customer Name
	"+customer.getCustomerName());
	}else{
	//displaying the error message if the customer id is
	invalid




	}
	}
	/**


	System.out.println("Invalid customer Id!!!"); ReadData.acceptString(); System.out.println("\n\n\n\n\n\n\n");
	* <h3>Description :</h3>This method is used to display the
	Customer menu.
	*/
	public void customerMenu(){
	while(true){
	//Displaying the menu
	System.out.println("\tCustomer Menu"); System.out.println("----------------------------------
	------");










	option







	option");

	System.out.println("1. Add Customer"); System.out.println("2. Get customer Info"); System.out.println("3. Exit"); System.out.print("\nEnter option :");
	String optedValue=ReadData.acceptString();
	int option=Integer.parseInt(optedValue);
	//calling the appropriate method for the entered


	switch(option){
	case 1: acceptCutomerInfo(); break; case 2: displayCustInfo();break; case 3: System.exit(0);break;
	default :System.out.println("Enter a valid


	ReadData.acceptString();



	ER/CORP/CRS/ ED112/007 	CONFIDENTIAL 	Version No. 1.0   7 of 36
	Asreet	Lab Guide for Business Tier using POJO


	}
	}
	}

}
