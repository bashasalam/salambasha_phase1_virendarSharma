package salambashaFSD_Project_Phase_One;

import java.io.*;
import java.util.Scanner; 


 
 // overriding the accept method of FilenameFilter 
 // interface 


public class Search_files { 
	static String path;
    static String filename;
   
 
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
     File directory = new File("C://"); 
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
                 System.out.println(filename1 + " is present at the location:  "+ "C://"); 
                 flag = 1; 
             } 
         } 
     } 

     if (flag == 0) { 
         System.out.println("File Not Found"); 
     } 
   //  obj.file_operation();
 } 

 catch(Exception e)
 {
	 e.printStackTrace();
 }
 } 
}
