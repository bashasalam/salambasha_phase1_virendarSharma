package salambashaFSD_Project_Phase_One;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class FileHandlingClass {
	static String path = "src\\resources\\FileFolder";
    static String filename;
	void listOffiles() {
		String[] fileList;
		
		File pathname = new File("src\\resources\\FileFolder");
		fileList = pathname.list();
		if(fileList == null ) {
			System.out.println("No Files in the directory");
		}else {
		Arrays.sort(fileList);
		
		for(int i = 0; i < fileList.length; i++) {
			
			System.out.println(fileList[i]);
		}
		
		MethodClass methods = new MethodClass();
		
		methods.showMenu();
		}
	}
	
	void createFile() {
		boolean flag = false;
System.out.println("Enter the file name to be created");
Scanner scan = new Scanner(System.in);
String fileName = scan.next();
		// create File object
		File newFile = new File("src\\resources\\FileFolder\\"+fileName);
		try {
		    flag = newFile.createNewFile();
		    if(flag) {
		    	System.out.println(fileName+ " " + newFile.getPath() + " created ");
		    }else {
		    	System.out.println(fileName+ " already exists:  ");
		    	//createFile();
		    	MoreOptionClass option = new MoreOptionClass();
		    	option.showMenu();
		    			
		    }
		} catch (IOException ioe) {
		     System.out.println("Error while Creating File in Java" + ioe);
		}

		MoreOptionClass moc = new MoreOptionClass();
		moc.showMenu();

		}
	
	 public void search() 
	 { 
		 
		 FileHandlingClass obj = new FileHandlingClass();
		 Scanner sc=new Scanner(System.in);
	   //  System.out.println("Enter the path : ");
	   //    path=sc.nextLine(); //storing path in path variable
	       System.out.println("Enter file name : ");
	       filename=sc.nextLine(); //storing filename in filename variable
		 
	     // Create an object of the File class 
	     // Replace the file path with path of the directory 
	     File directory = new File("src\\resources\\FileFolder\\"); 
	 try
	 {

	     String[] flist = directory.list(); 
	     int flag = 0; 
	     if (flist == null) { 
	         System.out.println("Empty directory."); 
	     } 
	     else { 

	         // Linear search in the array 
	         for (int i = 0; i < flist.length; i++) { 
	             String filename1 = flist[i]; 
	             if (filename1.equals(filename)) { 
	                 System.out.println(filename1 + " is present at the location:  "+ "src\\resources\\FileFolder\\"); 
	                 flag = 1; 
	             } 
	         } 
	     } 

	     if (flag == 0) { 
	         System.out.println("File Not Found "); 
	     } 
	   //  obj.file_operation();
	     MoreOptionClass moc = new MoreOptionClass();
	     moc.showMenu();
	 } 

	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 } 
	
	
	 public void deleteFile() 
	 { 
		 
		 FileHandlingClass obj = new FileHandlingClass();
		 Scanner sc=new Scanner(System.in);
	   
	       System.out.println("Enter file name : ");
	       filename=sc.nextLine(); //storing filename in filename variable
		 
	     // Create an object of the File class 
	     // Replace the file path with path of the directory 
	     File directory = new File("src\\resources\\FileFolder\\"); 
	     
	     System.out.println(filename);
	 try
	 {

	     String[] flist = directory.list(); 
	     int flag = 0; 
	     if (flist == null) { 
	         System.out.println("Empty directory."); 
	     } 
	     else { 

	         // Linear search in the array 
	         for (int i = 0; i < flist.length; i++) { 
	             String filename1 = flist[i]; 
	             if (filename1.equals(filename)) { 
	                // System.out.println(filename1 + " is present at the location:  "+ "src\\resources\\FileFolder\\");
	            	// filename.delete();
	            	 File delFile = new File("src\\resources\\FileFolder\\"+filename);
	            	
	            	 delFile.delete();
	            	 System.out.println("file name "   +delFile +  " deleted Succesfuly");
	                 flag = 1; 
	             } 
	         } 
	     } 

	     if (flag == 0) { 
	         System.out.println("File Not Found "); 
	     } 
	   //  obj.file_operation();
	     MoreOptionClass moc = new MoreOptionClass();
	     moc.showMenu();
	 } 

	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 } 
	
//	void searchFile() {
//		System.out.println("Enter the file to search");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String fileName = scan.next();		
//		
//		String filePath = "C:\\Users\\Abdhussalam\\eclipse-workspace\\salambashaFSD_Project_Phase_One\\src\\resources\\FileFolder\\"+fileName;
//		
//		File file = new File(filePath);
//		boolean flag = file.exists();//&& file.getCanonicalPath().equals(filePath);
//		String path ="C:\\Users\\Abdhussalam\\eclipse-workspace\\salambashaFSD_Project_Phase_One\\src\\resources\\FileFolder"; 
//		    // file exists
//		if(flag) {
//		    System.out.println("File is present at: "+path);
//			MoreOptionClass moc = new MoreOptionClass();
//			moc.showMenu();
//		}else {
//			System.out.println("File Not Found");
//			MoreOptionClass moc = new MoreOptionClass();
//			moc.showMenu();
//		}
//		
//
//	
//	}
	
	
	
	
	

	}



//void deleteFile() {
//	System.out.println("Enter the file name to be deleted: ");
//	Scanner sc = new Scanner(System.in);
//	
//	String deFileName = sc.next();
//	int flag = 0;
//	
//	// creating the file path:
//	try {
//	File newFile = new File("src\\resources\\FileFolder\\"+deFileName);
//	if(newFile.exists()) {
//	 newFile.delete();
//	 			System.out.println(deFileName+ " is deleted successfully");
//	}else {
//		System.out.println(deFileName+" file is not in this path.");
//	}
//	
//}		catch (Exception ioe) {
//		System.out.println("Exception Occured" + ioe.getMessage());
//	
//	}
//	MoreOptionClass moc = new MoreOptionClass();
//	moc.showMenu();
//	
//	
//	
//	
//	
//}


