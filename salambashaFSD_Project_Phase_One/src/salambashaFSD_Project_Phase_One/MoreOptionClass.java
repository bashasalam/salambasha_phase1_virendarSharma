package salambashaFSD_Project_Phase_One;

import java.io.IOException;
import java.util.Scanner;

class MoreOptionClass {
		 int option;
		    int showMenu() {
		        System.out.println("Kinldy Enter Your Option: ");
		        System.out.println("1--> Add a File");
		        System.out.println("2---> Search a file");
		        System.out.println("3---->Delete a file");
		        System.out.println("4---->Go Back");
		       // System.out.println("3---->Exit");

		             
		        Scanner scan = new Scanner(System.in);
		        //option = scan.nextInt();
		        
		        if(scan.hasNextInt()) {
		        	option = scan.nextInt();
		        }else {
		        	try{
		        		option = Integer.parseInt(scan.next());
		        	}catch (NumberFormatException ex) {
		        	    
		        		System.out.println("Kindly enter the numeric input 1 2 ,3 or 4");
		        		showMenu();
		        	}
		        }
		            
		        
		        mainOption(option);
		        return option;
		        
		    }
	 
	 void mainOption(int user_option)  {
	        if (user_option == 1) {
	        	
	        	// C:\Users\Abdhussalam\eclipse-workspace\salambashaFSD_Project_Phase_One\src\resources\FileFolder
	        	
	        	FileHandlingClass fileObj = new FileHandlingClass();
	        	
	        	fileObj.createFile();
	        	//files.listOffiles();
	        }else if(user_option == 2){
	        	FileHandlingClass fhc = new FileHandlingClass();
	        	fhc.search();
	        	
	        }else if(user_option == 3) {
	        
	        	FileHandlingClass fhc = new FileHandlingClass();
	        	
	        	fhc.deleteFile();
	        	        	
	        }else if(user_option == 4) {
	        	MethodClass mc = new MethodClass();
	        	mc.showMenu();
	        }
	        else {
	        	System.out.println("Kindly enter the valid input which is 1 2 3 or 4");
	        	showMenu();
	        }
			
		}
	 

}
