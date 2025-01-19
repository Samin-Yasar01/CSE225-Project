/*  Group 3 Students info
 *  1. Name: Samin Yasar || ID number: 2011279642
 *  2. Name: Abu Sufian Shanto || ID number: 2011844642
 *  3. Name: Azfat Sadat Khan  || ID number: 2012395642
 * */
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Banani 
{
public Banani()
    {
	
    }

public static void banani()
    {
	System.out.println("\n\t\t\t\t_________________________________________");
	System.out.println("\t\t\t\tYou have selected Banani.");
    System.out.println("\n\t\t\t\tDo you want to see the Hospitals?");
    System.out.println("\t\t\t\t_________________________________________");
    System.out.println("\t\t\t\t*****************************************");
    String institution;
    Scanner inHospital = new Scanner (System.in);
    institution = inHospital.next();
    
          switch (institution)
              {
                  case ("Yes"):
                     {
                	   System.out.println("\n\n\t\t\t\t_________________________________________");
               	       System.out.println("\t\t\t\tWhich hospital do you want to see?");
               	       System.out.println("\t\t\t\tWe have the following hospitals in Banani: \n\t\t\t\t(Please select numberwise!!!!!)");
               	       System.out.println("\t\t\t\t_________________________________________");
               	       System.out.println("\n\t\t\t\t1. Prescription point. \n\t\t\t\t2. M.R. Center Ltd.\n\t\t\t\t3. Square Hospital Consultation & Diagnostic Center \n\t\t\t\t4. Banani Clinic Ltd. \n\t\t\t\t5. Labaid Diagnostic Center. ");
               	       System.out.println("\t\t\t\t_________________________________________");
               	       System.out.println("\t\t\t\t*****************************************");
               	       Scanner inHospital1 = new Scanner (System.in);
               	      
               	      int h = inHospital1.nextInt();
               	      switch (h)
               	      {
               	        case 1 :
               	        {
               	           System.out.println("\t\t\t\t_________________________________________");
               	     	   System.out.println("\n\t\t\t\tPrescription Point Ltd. \n\t\t\t\tAddress: House-105, Road-12, Block-E, Banani, Dhaka-1213");
               	     	   System.out.println("\t\t\t\tPhone Numbers: 01713-333233");
               	     	   System.out.println("\t\t\t\tOpens at 7.30am & closes at 12.00am");
               	     	   System.out.println("\t\t\t\t_________________________________________");
               	     	   
               	     	   
               	           System.out.println("\t\t\t\t_________________________________________");
               	     	   System.out.println("\t\t\t\tDo you want to get an appointment for this hospital?\n\t\t\t\t1.Yes   2.No");
               	     	   System.out.println("\t\t\t\t_________________________________________");
            	     	   System.out.println("\t\t\t\t*****************************************");
               	     	   
               	     	   int a;
               	     	   Scanner pP = new Scanner (System.in);
               	     	   a = pP.nextInt();
               	     	   if(a == 1)
               	     	   {
               	     		   int disease, serial;
               	     		   String name, add, doc1, age, phnumb, date;
               	     		   Scanner n = new Scanner (System.in);
               	     		   Scanner ag = new Scanner (System.in);
               	     		   Scanner phn = new Scanner (System.in);
               	     		   Scanner ad = new Scanner (System.in);
               	     		   Scanner di = new Scanner (System.in);
               	     		   Scanner dte = new Scanner (System.in);
               	     		   System.out.println("\n\n\n\t\t\t\t_________________________________________");
               	     		   System.out.println("\t\t\t\t\tPlease fill up the form.");
               	     		   System.out.println("\t\t\t\t_________________________________________");
               	     		   System.out.println("\t\t\t\tName:");
               	     		   name = n.nextLine();
               	     		   System.out.println("\t\t\t\tAge:");
               	     		   age = ag.nextLine();
               	     		   System.out.println("\t\t\t\tPhone Number:");
               	     		   phnumb = phn.nextLine();
               	     		   System.out.println("\t\t\t\tAddress");
               	     		   add = ad.nextLine();
               	     		   System.out.println("\t\t\t\tEnter the date you want to get appointment on");
               	     		   date = dte.nextLine();
               	     		   System.out.println("\t\t\t\tChief complains: ");
               	     		   System.out.println("\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
               	     		   System.out.println("\t\t\t\t_________________________________________");
        	     			   System.out.println("\t\t\t\t*****************************************");
               	     		   disease = di.nextInt();
               	     		   if (disease == 1)
               	     		   {
               	     			   
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   
            	     			  
                   	     		   System.out.println("_______________________________________________________________________________________________");
                   	     		   System.out.println("\t\t\t\t Your Appointment Notice");
                   	     		   System.out.println("_______________________________________________________________________________________________");
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	     		  
                   	     		   System.out.println("On "+date+", you have an appointment under "+ doc1+" (ENT spetialist)");
                   	     		  
                   	     		   Random rnum = new Random();
                   	     		   
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		Random rnum2 = new Random();
             	     		   serial = rnum2.nextInt(22);
             	     		   if (serial == 0)
             	     		   {
             	     			serial = 1;
             	     			System.out.println("\nYour serial number is: "+serial);
             	     		   }
             	     		   else
             	     		   {
             	     		     System.out.println("\nYour serial number is: "+serial);
             	     		   }
                   	     		   System.out.println("\n_______________________________________________________________________________________________");
                   	     		   System.out.println("***********************************************************************************************");
               	     		   }
               	     		   else if (disease == 2)
               	     		   {
               	     			   System.out.println("_______________________________________________________________________________________________");
                	     		   System.out.println("\t\t\t\t Your Appointment Notice");
                	     		   System.out.println("_______________________________________________________________________________________________");
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Cardiologist)");
                   	     		   Random rnum = new Random();
                   	     		   
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			 
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		   Random rnum2 = new Random();
                	     		   serial = rnum2.nextInt(22);
                	     		   if (serial == 0)
                	     		   {
                	     			serial = 1;
                	     			System.out.println("\nYour serial number is: "+serial);
                	     		   }
                	     		   else
                	     		   {
                	     		     System.out.println("\nYour serial number is: "+serial);
                	     		   }
                   	     		   System.out.println("\n_______________________________________________________________________________________________");
                	     		   System.out.println("***********************************************************************************************");
               	     		   }
               	     		  else if (disease == 3)
               	     		   {
               	     			   System.out.println("_______________________________________________________________________________________________");
             	     		       System.out.println("\t\t\t\t Your Appointment Notice");
             	     		       System.out.println("_______________________________________________________________________________________________");
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
                   	     		   Random rnum = new Random();
                   	     		  
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		Random rnum2 = new Random();
             	     		   serial = rnum2.nextInt(22);
             	     		   if (serial == 0)
             	     		   {
             	     			serial = 1;
             	     			System.out.println("\nYour serial number is: "+serial);
             	     		   }
             	     		   else
             	     		   {
             	     		     System.out.println("\nYour serial number is: "+serial);
             	     		   }
                   	     		  System.out.println("\n_______________________________________________________________________________________________");
             	     		      System.out.println("***********************************************************************************************");
               	     		   }
               	     		 else if (disease == 4)
               	     		   {
               	     			   System.out.println("_______________________________________________________________________________________________");
          	     		           System.out.println("\t\t\t\t Your Appointment Notice");
          	     		           System.out.println("_______________________________________________________________________________________________");
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Gastrologist)");
                   	     		   Random rnum = new Random();
                   	     		   
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			  
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		Random rnum2 = new Random();
             	     		   serial = rnum2.nextInt(22);
             	     		   if (serial == 0)
             	     		   {
             	     			serial = 1;
             	     			System.out.println("\nYour serial number is: "+serial);
             	     		   }
             	     		   else
             	     		   {
             	     		     System.out.println("\nYour serial number is: "+serial);
             	     		   }
                   	     		   System.out.println("\n_______________________________________________________________________________________________");
           	     		           System.out.println("***********************************************************************************************");
               	     		   }
               	     		else if (disease == 5)
               	     		   {
               	     		       System.out.println("_______________________________________________________________________________________________");
   	     		                   System.out.println("\t\t\t\t Your Appointment Notice");
   	     		                   System.out.println("_______________________________________________________________________________________________");
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	               System.out.println("On "+date+", you have an appointment under "+ doc1+ " (Urologist)");
                   	     		   Random rnum = new Random();
                   	     		   
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		   Random rnum2 = new Random();
             	     		       serial = rnum2.nextInt(22);
             	     		       if (serial == 0)
             	     		        {
             	     			     serial = 1;
             	     			     System.out.println("\nYour serial number is: "+serial);
             	     		        }
             	     		      else
             	     		       {
             	     		         System.out.println("\nYour serial number is: "+serial);
             	     		       }
                   	     		   System.out.println("\n_______________________________________________________________________________________________");
        	     		           System.out.println("***********************************************************************************************");
               	     		   }
               	     		else if (disease == 6)
               	     		   {
               	     		       System.out.println("_______________________________________________________________________________________________");
     		                       System.out.println("\t\t\t\t Your Appointment Notice");
     		                       System.out.println("_______________________________________________________________________________________________");
               	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
                   	     		   doc1 = docname[new Random().nextInt(docname.length)];
                   	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
                   	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
                   	     		   Random rnum = new Random();
                   	     		   
                   	     		   int t=rnum.nextInt(11);
                   	     		   if (t>=7)
                   	     		   {
                   	     			  
                   	     			   System.out.print("At: "+t+":00"+"am");
                   	     		   }
                   	     		   else if (t==0)
                   	     		   {
                   	     			   t=12;
                   	     			   
                   	     			   System.out.print("At: "+t+":00"+"pm"); 
                   	     		   }
                   	     		   else 
                   	     		   {
                   	     			  
                   	     			  System.out.print("At: "+t+":00"+"pm");  
                   	     		   }
                   	     		Random rnum2 = new Random();
             	     		   serial = rnum2.nextInt(22);
             	     		   if (serial == 0)
             	     		   {
             	     			serial = 1;
             	     			System.out.println("\nYour serial number is: "+serial);
             	     		   }
             	     		   else
             	     		   {
             	     		     System.out.println("\nYour serial number is: "+serial);
             	     		   }
                   	     		  System.out.println("\n_______________________________________________________________________________________________");
     	     		              System.out.println("***********************************************************************************************");
               	     		   }
               	     		   
               	     		   
               	     	   }
               	     	   else
               	     	   {
               	     		   System.out.println("Thanks for visiting");
               	     	   }
               	     	   break;

               	        }
               	        
               	        
               	        
               	        
               	        case 2 :
               	        {
               	        	   System.out.println("\t\t\t\t_________________________________________");
               	        	   System.out.println("\n\t\t\t\tM.R. Center Ltd.\n\t\t\t\tAddress: Shorgo, Level-10th, House # # # E, Banani C/A, 1213., 49 Rd No 17, Dhaka");
                   	     	   System.out.println("\t\t\t\tPhone Numbers: 01713-333233");
                   	     	   System.out.println("\t\t\t\tOpens at 7.00 am & closes at 9.00 pm.");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
                	     	   
                	     	   
                	           System.out.println("\t\t\t\t_________________________________________");
                   	     	   System.out.println("\t\t\t\tDo you want to get an appointment for this hospital?\n\t\t\t\t1.Yes   2.No");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
             	     	       System.out.println("\t\t\t\t*****************************************");
                   	     	   
                   	     	   int a;
                   	     	   Scanner pP = new Scanner (System.in);
                   	     	   a = pP.nextInt();
                   	     	   if(a == 1)
                   	     	   {
                   	     		  
                   	     		   String name, add, age, phnumb, date;
									   int disease, serial;
                   	     		   Scanner n = new Scanner (System.in);
                   	     		   Scanner ag = new Scanner (System.in);
                   	     		   Scanner phn = new Scanner (System.in);
                   	     		   Scanner ad = new Scanner (System.in);
                   	     		   Scanner di = new Scanner (System.in);
                   	     		   Scanner dte = new Scanner (System.in);
                   	     		   System.out.println("\n\n\n\t\t\t\t_________________________________________");
                	     		   System.out.println("\t\t\t\tPlease fill up the form.");
                	     		   System.out.println("\t\t\t\t_________________________________________");
                   	     		   System.out.println("\t\t\t\tName:");
                   	     		   name = n.nextLine();
                   	     		   System.out.println("\t\t\t\tAge:");
                   	     		   age = ag.nextLine();
                   	     		   System.out.println("\t\t\t\tPhone Number:");
                   	     		   phnumb = phn.nextLine();
                   	     		   System.out.println("\t\t\t\tAddress");
                   	     		   add = ad.nextLine();
                   	     		   System.out.println("\t\t\t\tEnter the date you want to get appointment on");
                   	     		   date = dte.nextLine();
                   	     		   System.out.println("\t\t\t\tChief complains:");
                   	     		   System.out.println("\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
                   	     		   System.out.println("\t\t\t\t_________________________________________");
         	     			       System.out.println("\t\t\t\t*****************************************");
                   	     		   disease = di.nextInt();
                   	     		   if (disease == 1)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		   System.out.println("On "+date+", you have an appointment under "+ doc1+" (ENT spetialist)");
	                    	     		   Random rnum = new Random();
	                    	     		  
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   else if (disease == 2)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Cardiologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		  else if (disease == 3)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		 else if (disease == 4)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("You have an appointment under "+ doc1+" (Gastrologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 5)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("You have an appointment under "+ doc1+" (Urologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 6)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   String doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     	   }
                   	     	   else
                   	     	   {
                   	     		   System.out.println("Thanks for visiting");
                   	     	   }
                   	     	   break;
               	        }
               	        
               	        
               	        
               	        case 3 :
               	        {
               	        	   System.out.println("\t\t\t\t_________________________________________");
               	        	   System.out.println("\n\t\t\t\tSquare Hospital Consultation & Diagnostic Center.\n\t\t\t\tAddress- Classic Tower (2nd Floor), House-1, Road-11, Block-F");
                   	     	   System.out.println("\t\t\t\tPhone Numbers:  09610-010616");
                   	     	   System.out.println("\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
                	     	   
                	     	   
                	           System.out.println("\t\t\t\t_________________________________________");
                   	     	   System.out.println("\t\t\t\tDo you want to get an appointment for this hospital?\n\t\t\t\t1.Yes   2.No");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
             	     	       System.out.println("\t\t\t\t*****************************************");
                   	     	  
                   	     	   int a;
                   	     	   Scanner pP = new Scanner (System.in);
                   	     	   a = pP.nextInt();
                   	     	   if(a == 1)
                   	     	   {
                   	     		   
                   	     		   String name, add, age, phnumb, date;
								   int disease, serial;
                   	     		   Scanner n = new Scanner (System.in);
                   	     		   Scanner ag = new Scanner (System.in);
                   	     		   Scanner phn = new Scanner (System.in);
                   	     		   Scanner ad = new Scanner (System.in);
                   	     		   Scanner di = new Scanner (System.in);
                   	     		   Scanner dte = new Scanner (System.in);
                   	     		   System.out.println("\n\n\n\t\t\t\t_________________________________________");
                	     		   System.out.println("\t\t\t\tPlease fill up the form.");
                	     		   System.out.println("\t\t\t\t_________________________________________");
                   	     		   System.out.println("\t\t\t\tName:");
                   	     		   name = n.nextLine();
                   	     		   System.out.println("\t\t\t\tAge:");
                   	     		   age = ag.nextLine();
                   	     		   System.out.println("\t\t\t\tPhone Number:");
                   	     		   phnumb = phn.nextLine();
                   	     		   System.out.println("\t\t\t\tAddress");
                   	     		   add = ad.nextLine();
                   	     		   System.out.println("\t\t\t\tEnter the date you want to get appointment on");
                   	     		   date = dte.nextLine();
                   	     		   System.out.println("\t\t\t\tChief complains:");
                   	     		   System.out.println("\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
                   	     		   System.out.println("\t\t\t\t_________________________________________");
         	     			       System.out.println("\t\t\t\t*****************************************");
                   	     		   disease = di.nextInt();
                   	     		   String doc1;
									if (disease == 1)
                   	     		   {
										   System.out.println("_______________________________________________________________________________________________");
		                   	     		   System.out.println("\t\t\t\t Your Appointment Notice");
		                   	     		   System.out.println("_______________________________________________________________________________________________");
										   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		   System.out.println("On "+date+", you have an appointment under "+ doc1+" (ENT spetialist)");
	                    	     		   Random rnum = new Random();
	                    	     		 
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				  
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				
	                    	     				 System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					   
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				
	                    	     			    System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   else if (disease == 2)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Cardiologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				  
	                    	     				  System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					   
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				
	                    	     			    System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		  else if (disease == 3)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		  int t=rnum.nextInt(11);
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				   
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				 
	                    	     				 System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					 
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		 else if (disease == 4)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Gastrologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				   
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				  
	                    	     				  System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					   
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 5)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+ " (Urologist)");
	                    	     		   Random rnum = new Random();
	                    	     		 
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				   
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				  
	                    	     				  System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					   
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 6)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		 
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				  
	                    	     				   System.out.println("At: "+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				
	                    	     				  System.out.print("At: "+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                   	     				   {
                   	     					   t = 5;
                   	     					  
                   	     					   System.out.println("At: "+t+":00"+"pm"); 
                   	     				   }
	                    	     			  else
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     			  }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   
                   	     	   }
                   	     	   else
                   	     	   {
                   	     		   System.out.println("Thanks for visiting");
                   	     	   }
                   	     	   break;
                   	     	   }
                   	     	   }
               	        
               	        
               	        
               	        case 4 :
               	        {
               	        	   System.out.println("\t\t\t\t_________________________________________");
               	        	   System.out.println("\n\t\t\t\tBanani Clinic.\n\t\t\t\tAddreess- Rd No 13C, Dhaka 1212");
                   	     	   System.out.println("\t\t\t\tPhone Numbers: 01611-443345");
                   	     	   System.out.println("\t\t\t\tOpens 7.00 am & closes at 9.00pm");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
                	     	   
                	     	   
                	           System.out.println("\t\t\t\t_________________________________________");
                   	     	   System.out.println("\t\t\t\tDo you want to get an appointment for this hospital?\n\t\t\t\t1.Yes   2.No");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
             	     	       System.out.println("\t\t\t\t*****************************************");
                   	     	   
                   	     	   int a;
                   	     	   Scanner pP = new Scanner (System.in);
                   	     	   a = pP.nextInt();
                   	     	   if(a == 1)
                   	     	   {
                   	     		   
                   	     		   String age, phnumb, name, add, date;
									   int disease, serial;
                   	     		   Scanner n = new Scanner (System.in);
                   	     		   Scanner ag = new Scanner (System.in);
                   	     		   Scanner phn = new Scanner (System.in);
                   	     		   Scanner ad = new Scanner (System.in);
                   	     		   Scanner di = new Scanner (System.in);
                   	     		   Scanner dte = new Scanner (System.in);
                   	     		   System.out.println("\n\n\n\t\t\t\t_________________________________________");
                	     		   System.out.println("\t\t\t\tPlease fill up the form.");
                	     		   System.out.println("\t\t\t\t_________________________________________");
                   	     		   System.out.println("\t\t\t\tName:");
                   	     		   name = n.nextLine();
                   	     		   System.out.println("\t\t\t\tAge:");
                   	     		   age = ag.nextLine();
                   	     		   System.out.println("\t\t\t\tPhone Number:");
                   	     		   phnumb = phn.nextLine();
                   	     		   System.out.println("\t\t\t\tAddress");
                   	     		   add = ad.nextLine();
                   	     		   System.out.println("\t\t\t\tEnter the date you want to get appointment on");
                   	     		   date = dte.nextLine();
                   	     		   System.out.println("\t\t\t\tChief complains:");
                   	     		   System.out.println("\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
                   	     		   System.out.println("\t\t\t\t_________________________________________");
         	     			       System.out.println("\t\t\t\t*****************************************");
                   	     		   disease = di.nextInt();
                   	     		   String doc1;
									if (disease == 1)
                   	     		   {
										   System.out.println("_______________________________________________________________________________________________");
		                   	     		   System.out.println("\t\t\t\t Your Appointment Notice");
		                   	     		   System.out.println("_______________________________________________________________________________________________");
										   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		   System.out.println("On "+date+", you have an appointment under "+ doc1+" (ENT spetialist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   else if (disease == 2)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Cardiologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(9);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		  else if (disease == 3)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		 else if (disease == 4)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Gastrologist)");
	                    	     		   Random rnum = new Random();
	                    	     		 
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 5)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+ " (Urologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			 
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 6)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
	                    	     		   Random rnum = new Random();
	                    	     		  
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=7)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if(t==0) 
	                    	     		   {
	                    	     			  t=12;
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		  else 
	                    	     		   {
	                    	     			  
	                    	     			  System.out.print("At: "+t+":00"+"pm");  
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   
                   	     	   }
                   	     	   else
                   	     	   {
                   	     		   System.out.println("Thanks for visiting");
                   	     	   }
                   	     	   break;
               	        }
               	        
               	        
               	        
               	        case 5:
               	        {
               	        	   System.out.println("\t\t\t\t_________________________________________");
               	        	   System.out.println("\n\t\t\t\tLabaid Diagnostic Center. \n\t\t\t\tAddress: House # 13/A(4th Floor, Road#35, Dhaka 1212");
                   	     	   System.out.println("\t\t\t\tPhone Numbers: 02-9858943");
                   	     	   System.out.println("\t\t\t\tOpens at 8.00 am & closes 5.00pm");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
                	     	   
                	     	   
                	           System.out.println("\t\t\t\t_________________________________________");
                   	     	   System.out.println("\t\t\t\tDo you want to get an appointment for this hospital?\n\t\t\t\t1.Yes   2.No");
                   	     	   System.out.println("\t\t\t\t_________________________________________");
             	     	       System.out.println("\t\t\t\t*****************************************");
                   	     	  
                   	     	   int a;
                   	     	   Scanner pP = new Scanner (System.in);
                   	     	   a = pP.nextInt();
                   	     	   if(a == 1)
                   	     	   {
                   	     		   
                   	     		   String name, add, age, phnumb, date;
									   int disease, serial;
                   	     		   Scanner n = new Scanner (System.in);
                   	     		   Scanner ag = new Scanner (System.in);
                   	     		   Scanner phn = new Scanner (System.in);
                   	     		   Scanner ad = new Scanner (System.in);
                   	     		   Scanner di = new Scanner (System.in);
                   	     		   Scanner dte = new Scanner (System.in);
                   	     		   System.out.println("\n\n\n\t\t\t\t_________________________________________");
                	     		   System.out.println("\t\t\t\tPlease fill up the form.");
                	     		   System.out.println("\t\t\t\t_________________________________________");
                   	     		   System.out.println("\t\t\t\tName:");
                   	     		   name = n.nextLine();
                   	     		   System.out.println("\t\t\t\tAge:");
                   	     		   age = ag.nextLine();
                   	     		   System.out.println("\t\t\t\tPhone Number:");
                   	     		   phnumb = phn.nextLine();
                   	     		   System.out.println("\t\t\t\tAddress");
                   	     		   add = ad.nextLine();
                   	     		   System.out.println("\t\t\t\tEnter the date you want to get appointment on");
                   	     		   date = dte.nextLine();
                   	     		   System.out.println("\t\t\t\tChief complains");
                   	     		   System.out.println("\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
                   	     		   System.out.println("\t\t\t\t_________________________________________");
         	     			       System.out.println("\t\t\t\t*****************************************");
                   	     		   disease = di.nextInt();
                   	     		   String doc1;
									if (disease == 1)
                   	     		   {
										   System.out.println("_______________________________________________________________________________________________");
		                   	     		   System.out.println("\t\t\t\t Your Appointment Notice");
		                   	     		   System.out.println("_______________________________________________________________________________________________");
										   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		   System.out.println("On "+date+", you have an appointment under "+ doc1+" (ENT spetialist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  if (t>=8)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				 
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   else if (disease == 2)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Cardiologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  if (t>=8)
	                    	     		   {
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				   
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		    }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		  else if (disease == 3)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  if (t>=8)
	                    	     		   {
	                    	     			  
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				  
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		 else if (disease == 4)
                   	     		   {
                   	     			       System.out.println("_______________________________________________________________________________________________");
                    	     		       System.out.println("\t\t\t\t Your Appointment Notice");
                    	     		       System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Gastrologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		   if (t>=8)
	                    	     		   {
	                    	     			 
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				   
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 5)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+ " (Urologist)");
	                    	     		   Random rnum = new Random();
	                    	     		   
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  if (t>=8)
	                    	     		   {
	                    	     			 
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				   
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		else if (disease == 6)
                   	     		   {
                   	     		           System.out.println("_______________________________________________________________________________________________");
                	     		           System.out.println("\t\t\t\t Your Appointment Notice");
                	     		           System.out.println("_______________________________________________________________________________________________");
                   	     			       String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
	                    	     		   Random rnum = new Random();
	                    	     		  
	                    	     		   int t=rnum.nextInt(11);
	                    	     		  if (t>=8)
	                    	     		   {
	                    	     			 
	                    	     			   System.out.print("At: "+t+":00"+"am");
	                    	     		   }
	                    	     		  else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   
	                    	     			   System.out.print("At: "+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			   if (t==6 && t==7)
	                    	     			   {
	                    	     				   t=5;
	                    	     				   
	                    	     				   System.out.print("At: "+t+":00"+"pm");
	                    	     			   }
	                    	     			  else 
	                    	     			  {
	                    	     				 
	                    	     			     System.out.print("At: "+t+":00"+"pm");  
	                    	     		      }
	                    	     		   }
	                    	     		   Random rnum2 = new Random();
	                    	     		   serial = rnum2.nextInt(22);
	                    	     		   if (serial == 0)
	                    	     		   {
	                    	     			serial = 1;
	                    	     			System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else
	                    	     		   {
	                    	     		     System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   System.out.println("\n_______________________________________________________________________________________________");
	                      	     		   System.out.println("***********************************************************************************************");
                   	     		   }
                   	     		   
                   	     	   }
                   	     	   else
                   	     	   {
                   	     		   System.out.println("Thanks for visiting");
                   	     	   }
                   	     	   break;
               	        }
               	      }
                     }
                  
                  default :
               	   System.out.println("  ");
                 
                  
              }
          
	}

}
