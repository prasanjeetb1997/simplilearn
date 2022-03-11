package first_simplilearn_project;

import java.io.File; 
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Phase1Assessment {
	Scanner sc=new Scanner(System.in);
	File file=new File("c:\\start\\");
	         void welcomescreen() {
	        	    System.out.println("  WELCOME TO THE APPLICATION");
		     		System.out.println("******   LockedMe.com   *******");
		     		System.out.println("DEVELOPED by Prasanjeet");
		     		}
	         
	         void mainmenu() {
	        	 System.out.println();
	        	System.out.println("The root directory is c:\\start\\ ");
	     		System.out.println("Select one of the option from menu:");
	     		System.out.println("1. Retrieve current files name");
	     		System.out.println("2. Add,Delete,Search files ");
	     		System.out.println("3. Exit the application"); }
	         
	         int userinput() {
	        	 return sc.nextInt();
	         }
	        	 
	         
	         void mainfirstopt() {
	        	
	        		 Arrays.sort(file.list());
	 	 			for(String i: file.list()) {
	 	 				System.out.println(i);}
	        	 }
	        
	         
	         void submenu(){
	        	 System.out.println();
	        	System.out.println("Enter '1' to add a file to directory");
	 			System.out.println("Enter '2' to delete a file from directory");
	 			System.out.println("Enter '3' to search a file in directory");
	 			System.out.println("Enter '4' to go back");
	         }
	       
	         
	         void sub1stopt() throws IOException {
	        	 System.out.println("Enter the file name you want");
					File ob=new File("c:\\start\\"+sc.next());
					boolean bl= ob.createNewFile();
					if(bl) {
						System.out.println("File created successfully");}
					else {
						System.out.println("This file name is already present in directory");
					}
	         }
	         void sub2ndopt() {
	        	 System.out.println("Name the file you want to delete");
				 File ob1=new File("c:\\start\\"+sc.next());
				 boolean bl= ob1.delete();
				 if(bl) {
					 System.out.println("File deleted successfully");
					 ob1.delete();}
				 else {
					 System.out.println("File not found!");}
	         }
	         void subthirdopt() {
	        	 System.out.println("Enter the file name you want to search");
			      File ob2=new File("c:\\start\\"+sc.next());
			      boolean bl= ob2.exists();
			      if(bl) {
			    	  System.out.println("Yes! The file is in the directory");
			      }else {
			    	  System.out.println("The file is not in the directory");}
	         }
	         
	         
	         
	         
	        
	         

	public static void main(String[] args) throws IOException {
		Phase1Assessment ob =new Phase1Assessment();
		File file=new File("c:\\start\\");
		file.mkdir();
		         ob.welcomescreen();
		        
		 while(true) {
		         ob.mainmenu();
		         int a=ob.userinput();
		         if(a==1) {
		        	 ob.mainfirstopt();
		         }
		         else if(a==2) {
		        	 while(a==2) {
		        	 ob.submenu();
		        	 int b= ob.userinput();
		        	    if(b==1) {
		        	    	ob.sub1stopt();
		        	    }else if(b==2) {
		        	    	ob.sub2ndopt();
		        	    }else if(b==3) {
		        	    	ob.subthirdopt();
		        	    }else if(b==4) {
		        	    	
		        	    	break;
		        	    }else {
		        	    	System.out.println("Wrong input!");
		        	    	System.out.println("Please provide a valid input");
		        	    }
		        	    }
		         }else if(a==3) {
		        	 System.out.println("Thank you for using LockedMe.com");
		        	 break;
		         }else {
		        	 System.out.println("Wrong input!");
		        	 System.out.println("Please provide a valid input");
		         }
		         
		         }

	}

}