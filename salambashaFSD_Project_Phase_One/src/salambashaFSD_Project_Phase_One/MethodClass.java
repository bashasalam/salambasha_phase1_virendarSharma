package salambashaFSD_Project_Phase_One;

import java.util.Scanner;
class MethodClass {
	protected int option;
	protected int yourNumber;
	//protected int user_option;
	FileHandlingClass obj = new FileHandlingClass();
	
	void mainOption(int user_option) {
        if (user_option == 1) {
        	
        	FileHandlingClass files = new FileHandlingClass();
        	files.listOffiles();
        }else if(user_option == 2){
        	//moreOptions();
        	MoreOptionClass options = new MoreOptionClass();
        	
        	options.showMenu();
        	
        	
        }else if(user_option == 3) {
        	System.out.println("Are you Sure? You want to exit from the application?");
        	
        	System.out.println("To confirm (yes): press: Y");
        	
        	System.out.println("To continue (No): press: N");
        	
        	Scanner sc = new Scanner(System.in);
        	 // Character input 
        	
        	
            char c = sc.next().charAt(0);  
              	
        	if((c == 'Y') ||(c=='y') ) {
        		
        		System.out.println("Thank you");
        		System.exit(0);
        	}else if((c=='n')||(c=='N')) {
        		
        		showMenu();
        		
        	}
        	else {
        		MoreOptionClass options = new MoreOptionClass();

        		options.showMenu();
        	}
        	        	
        }else {
        	System.out.println("Kindly enter the valid input");
        	showMenu();
        }
		
	}

	

    int showMenu() {
        System.out.println("Kinldy Enter Your Option: ");
        System.out.println("1--> To get the File names ");
        System.out.println("2---> For more options choose 2 ");
        System.out.println("3---->Exit");
            
        Scanner scan = new Scanner(System.in);
        
        if(scan.hasNextInt()) {
        	option = scan.nextInt();
        }else {
        	try{
        		option = Integer.parseInt(scan.next());
        	}catch (NumberFormatException ex) {
        	    
        		System.out.println("Kindly enter the numeric input 1 2 or 3");
        		showMenu();
        	}
        }
                        
        mainOption(option);
        return option;
        
    }


	

}

