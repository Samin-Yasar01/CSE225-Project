/*  Group 3 Students info
 *  1. Name: Samin Yasar || ID number: 2011279642
 *  2. Name: Abu Sufian Shanto || ID number: 2011844642
 *  3. Name: Azfat Sadat Khan  || ID number: 2012395642
 * */
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Mirpur 
{
  public Mirpur()
  {
	  
  }
  public static void mirpur()
  
  {  
	  System.out.println("\t\t\t\t______________________________________");
	  System.out.println("\n\t\t\t\t You have selected Mirpur. ");
      System.out.println("\n\t\t\t\t Do you want to see the Hospitals? ");
      System.out.println("\t\t\t\t______________________________________");
      System.out.println("\t\t\t\t**************************************");
      
      String institution;
      Scanner inHospital = new Scanner (System.in);
      institution = inHospital.next();
      
            switch (institution)
                {
                    case ("Yes"):
                       {
                    	System.out.println("\t\t\t\t______________________________________");
           
                 	   System.out.println("\t\t\t\tWhich hospital do you want to see?");
                 	   System.out.println("\n\n\t\t\t\tWe have the following hospitals in Mirpur: \n\n\t\t\t\t(Please select numberwise!!!!!)");
                 	  System.out.println("\n\t\t\t\t_________________________________________");
                 	   System.out.println("\n\n\t\t\t\t1. Mirpur General Hospital & Diagnostic Centre \n\t\t\t\t2. Al Helal Specialized Hospital Dhaka.\n\t\t\t\t3. Delta Hospital Ltd.\n\t\t\t\t4. Kingston Hospital.\n\t\t\t\t5. Aalok Health Care & Hospital Ltd. \n");
                 	   System.out.println("\t\t\t\t______________________________________");
                       System.out.println("\t\t\t\t**************************************");
                       
                 	   Scanner inHospital1 = new Scanner (System.in);
                 	      
                 	      int h = inHospital1.nextInt();
                 	      switch (h)
                 	      {
                 	        case 1 :
                 	        {
                 	        System.out.println("\t\t\t\t______________________________________");
                               
                                	
                 	     	   System.out.println("\t\t\t\tMirpur General Hospital & Diagnostic Centre. \n\n\t\t\t\tAddress: Block- B, Plot No, 10 1216 Road 4");
                 	     	   System.out.println("\n\t\t\t\tPhone Numbers: 01785906599");
                 	     	   System.out.println("\n\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
                 	     	 System.out.println("\n\t\t\t\t_________________________________________");
                 	     	System.out.println("\t\t\t\t_________________________________________");
                 	     	   System.out.println("\n\n\t\t\t\tDo you want to get an appointment for this hospital?\n\n\t\t\t\t1.Yes   2.No");
                 	     	   System.out.println("\n\t\t\t\t______________________________________");
                               System.out.println("\t\t\t\t**************************************");
                             
                 	     	   int a;
                 	     	   Scanner pP = new Scanner (System.in);
                 	     	   a = pP.nextInt();
                 	     	   if(a == 1)
                 	     	   {
                 	     		   int disease, serial;
                 	     		   String name, add, doc1,phnumb,date,age;
                 	     		   Scanner n = new Scanner (System.in);
                 	     		   Scanner ag = new Scanner (System.in);
                 	     		   Scanner phn = new Scanner (System.in);
                 	     		   Scanner ad = new Scanner (System.in);
                 	     		   Scanner di = new Scanner (System.in);
                 	     		  Scanner dte = new Scanner (System.in);
                 	     		   System.out.println("\n\t\t\t\t______________________________________");
                 	     		   System.out.println("\t\t\t\tPlease fill up the form.");
                 	     		   System.out.println("\n\t\t\t\tName:");
                 	     		   name = n.nextLine();
                 	     		   System.out.println("\n\t\t\t\tAge:");
                 	     		   age = ag.nextLine();
                 	     		   System.out.println("\n\t\t\t\tPhone Number:");
                 	     		   phnumb = phn.nextLine();
                 	     		   System.out.println("\n\t\t\t\tAddress");
                 	     		   add = ad.nextLine();
                 	     		  System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
                 	     		   date = dte.nextLine();
                 	     		 System.out.println("\n\n\t\t\t\t______________________________________");
                                 System.out.println("\t\t\t\t**************************************");
                                 
                                 System.out.println("\n\t\t\t\t______________________________________");
                                 
                 	     		   System.out.println("\t\t\t\tCheif Complains:");
                 	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
                 	     		 System.out.println("\n\n\t\t\t\t______________________________________");
                                 System.out.println("\t\t\t\t**************************************");
                 	     		   disease = di.nextInt();
                 	     		  if (disease == 1)
                 	     		   {
                 	     			   String docname [] = {"Gerard Henry", "Sitab Ahmed", "Dr. Shahi"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   
	                    	     		  System.out.println("\n\n___________________________________________________________________________________");
	                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
	                    	     		  System.out.println("___________________________________________________________________________________");
	                                      
	                    	     		   System.out.println("Name: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (ENT spetialist)");
	        
                                     Random rnum = new Random();
	                    	     		  
	                    	     		  int t=rnum.nextInt(11);
	                    	     		  if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				   System.out.println("At:"+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				 System.out.print("At:"+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   System.out.print("At:"+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                 	     				   {
                 	     					   t = 5;
                 	     					   System.out.println("At:"+t+":00"+"pm"); 
                 	     				   }
	                    	     			  else
	                    	     			  {
	                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   
                 	     		   }
                 	 
                 	     		  
                 	     		  else if (disease == 2)
                 	     		   {
                 	     			   String docname [] = {"Selina Hossain", "Dr. jojo kabir", "Ahmed Sarker"};
	                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
	                    	     		   
	                    	     		  System.out.println("\n\n___________________________________________________________________________________");
	                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
	                    	     		  System.out.println("___________________________________________________________________________________");
	                                      
	                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
	                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Cardiologist)");
	        
                                   Random rnum = new Random();
	                    	     		 
	                    	     		   int t=rnum.nextInt(11);
	                    	    
	                    	     		   if (t>=9)
	                    	     		   {
	                    	     			   if (t==7 && t==8)
	                    	     			   {
	                    	     				   t = 9;
	                    	     				   System.out.println("At:"+t+":00"+"am");
	                    	     			   }
	                    	     			   else 
	                    	     			   {
	                    	     				 System.out.print("At:"+t+":00"+"am");
	                    	     			   }   
	                    	     		   }
	                    	     		   else if (t==0)
	                    	     		   {
	                    	     			   t=12;
	                    	     			   System.out.print("At:"+t+":00"+"pm"); 
	                    	     		   }
	                    	     		   else 
	                    	     		   {
	                    	     			  if (t==6)
                 	     				   {
                 	     					   t = 5;
                 	     					   System.out.println("At:"+t+":00"+"pm"); 
                 	     				   }
	                    	     			  else
	                    	     			  {
	                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
                 	     		   }
                 	 
                 	     	   
                 	     		   
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			   String docname [] = {"Rupa Kormoker", "Kabir Roy", "Dipto Chowdhury"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Neurologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			   String docname [] = {"Dr.Tashu", "Dr.Kibria", "Dr. Simon"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+", You have an appointment under "+ doc1+" (Gastrologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Nashik ahmed", "Dr.Ryan kabir", "Dr. Shahidullah"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+",You have an appointment under "+ doc1+" (Urologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
	                    	     		else if (disease == 6)
	                    	     		   {
	                    	     			   String docname [] = {"Sufiya kamal", "Dr. Ahmed", "Sahjahhan Kumar"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Rheumatologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
		                    	 
                 	     	   else
                 	     	   {
                 	     		   System.out.println("Thanks for visiting");
                 	     	   }
                 	     	   break;

                 	        }
                 	        }
                 	        case 2 :
                 	        {
                 	        	System.out.println("\t\t\t\t______________________________________");
                 	        	System.out.println("\t\t\t\tAl Helal Specialized Hospital Dhaka.\n\n\t\t\t\tAdress: 150, Begum Rokeya Sarani, Mirpur-10, Dhaka");
	                    	     	   System.out.println("\n\t\t\t\tPhone Numbers: 029008181");
	                    	     	   System.out.println("\n\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
	                    	     	  System.out.println("\n\t\t\t\t_________________________________________");
	                    	     	 System.out.println("\t\t\t\t_________________________________________");
	                    	     	   System.out.println("\n\t\t\t\tDo you want to get an appointment for this hospital?\n\n\t\t\t\t1.Yes   2.No");
	                    	     	  System.out.println("\n\t\t\t\t______________________________________");
	                                  System.out.println("\t\t\t\t**************************************");
	                    	     	   int a;
	                    	     	   Scanner pP = new Scanner (System.in);
	                    	     	   a = pP.nextInt();
	                    	     	   if(a == 1)
	                    	     	   {
	                    	     		  int disease, serial;
	                    	     		   String name, add, doc1,phnumb,date,age;
	                    	     		   Scanner n = new Scanner (System.in);
	                    	     		   Scanner ag = new Scanner (System.in);
	                    	     		   Scanner phn = new Scanner (System.in);
	                    	     		   Scanner ad = new Scanner (System.in);
	                    	     		   Scanner di = new Scanner (System.in);
	                    	     		  Scanner dte = new Scanner (System.in);
	                    	     		 System.out.println("\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\tPlease fill up the form.");
	                    	     		   System.out.println("\n\t\t\t\tName:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAge:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tPhone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAddress");
	                    	     		   add = ad.nextLine();
	                    	     		  System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		  System.out.println("\n\n\t\t\t\t______________________________________");
	                                      System.out.println("\t\t\t\t**************************************");
	                                      
	                                      System.out.println("\n\t\t\t\t______________________________________");
	                                      
	                                      System.out.println("\t\t\t\tCheif Complains:");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		 System.out.println("\n\n\t\t\t\t______________________________________");
	                                    System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   
	                    	     		  if (disease == 1)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Lucas", "Dr.kabir", "Dr.Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (ENT spetialist)");
		        
                                         Random rnum = new Random();
		                    	     		   
                                         int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	 }
	                    	     		  
	                    	     		  else if (disease == 2)
	                    	     		   {
	                    	     			   String docname [] = {"Tasfia Khan", "Dr.Mostafa Khan", "Iftekher Asef"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Cardiologist)");
		        
                                       Random rnum = new Random();
                                       
                                       int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
		                    	     		  else if (disease == 3)
		                    	     		   {
		                    	     			   String docname [] = {"Newaz Khan", "Dipto Roy", "Jahanara"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Neurologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
		                    	     			   String docname [] = {"Fahim Bin Amin", "Dr. Zihad Ahmed", "Mahin Rahman"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
                                                  System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Gastrologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
		                    	     			   String docname [] = {"Samiha Ishrat", "Sanjana Mou", "Dr. Sadia ara"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Urologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Shanto", "Dr.Riana", "Mahir Faisal"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Rheumatologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
			                    	 
	                    	     		   
	                    	     	
	                    	     	   else
	                    	     	   {
	                    	     		   System.out.println("Thanks for visiting");
	                    	     	   }
	                    	     	   break;
                 	          }
                 	        }
                 	        case 3 :
                 	        {
                 	        	System.out.println("\t\t\t\t______________________________________");
                 	        	System.out.println("\t\t\t\t Delta Hospital Ltd.\n\n\t\t\t\tAddress-  2 Tolarbag 1st Ln, Mirpur-1, Dhaka");
	                    	     	   System.out.println("\n\t\t\t\tPhone Numbers:  029022410");
	                    	     	   System.out.println("\n\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
	                    	     	  System.out.println("\n\t\t\t\t_________________________________________");
	                    	     	 System.out.println("\t\t\t\t_________________________________________");
	                    	     	   System.out.println("\n\t\t\t\tDo you want to get an appointment for this hospital?\n\n\t\t\t\t1.Yes   2.No");
	                    	     	  System.out.println("\n\t\t\t\t______________________________________");
	                                  System.out.println("\t\t\t\t**************************************");
	                    	     	   int a;
	                    	     	   Scanner pP = new Scanner (System.in);
	                    	     	   a = pP.nextInt();
	                    	     	   if(a == 1)
	                    	     	   {
	                    	     		  int disease, serial;
	                    	     		   String name, add, doc1,phnumb,date,age;
	                    	     		   Scanner n = new Scanner (System.in);
	                    	     		   Scanner ag = new Scanner (System.in);
	                    	     		   Scanner phn = new Scanner (System.in);
	                    	     		   Scanner ad = new Scanner (System.in);
	                    	     		   Scanner di = new Scanner (System.in);
	                    	     		  Scanner dte = new Scanner (System.in);
	                    	     		 System.out.println("\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\tPlease fill up the form.");
	                    	     		   System.out.println("\n\t\t\t\tName:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAge:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tPhone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAddress");
	                    	     		   add = ad.nextLine();
	                    	     		  System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		  System.out.println("\n\n\t\t\t\t______________________________________");
	                                      System.out.println("\t\t\t\t**************************************");
	                                      
	                                      System.out.println("\n\t\t\t\t______________________________________");
	                                      
	                                      System.out.println("\t\t\t\tCheif Complains:");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		 System.out.println("\n\n\t\t\t\t______________________________________");
	                                    System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   
	                    	     		  if (disease == 1)
	                    	     		   {
	                    	     			   String docname [] = {"Gerard Henry", "Sitab Ahmed", "Dr. Shahi"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (ENT spetialist)");
		        
                                         Random rnum = new Random();
		                    	     		   
                                         int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	 }
	                    	     		  
	                    	     		  else if (disease == 2)
	                    	     		   {
	                    	     			   String docname [] = {"Dr.Shanto", "Dr.Riana", "Mahir Faisal"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Cardiologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
                                       int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
		                    	     		  else if (disease == 3)
		                    	     		   {
		                    	     			   String docname [] = {"Samiha Ishrat", "Sanjana Mou", "Dr. Sadia ara"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Neurologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Tashu", "Dr.Kibria", "Dr. Simon"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Gastrologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
		                    	     			   String docname [] = {"Tasfia Khan", "Dr.Mostafa Khan", "Iftekher Asef"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Urologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
		                    	     			   String docname [] = {"Sufiya kamal", "Dr. Ahmed", "Sahjahhan Kumar"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Rheumatologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
                 	        	System.out.println("\t\t\t\t______________________________________");
                 	        	System.out.println("\t\t\t\tKingston Hospital.\n\n\t\t\t\tAddreess- House 51-54, Road 01 & 02, Block-D, Shahidbag Mirpur -12 Dhaka, 1216");
	                    	     	   System.out.println("\n\t\t\t\tPhone Number: 01952989866");
	                    	     	   System.out.println("\n\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
	                    	     	  System.out.println("\n\t\t\t\t_________________________________________");
	                    	     	 System.out.println("\t\t\t\t_________________________________________");
	                    	     	   System.out.println("\n\t\t\t\tDo you want to get an appointment for this hospital?\n\n\t\t\t\t1.Yes   2.No");
	                    	     	  System.out.println("\n\t\t\t\t______________________________________");
	                                  System.out.println("\t\t\t\t**************************************");
	                    	     	   int a;
	                    	     	   Scanner pP = new Scanner (System.in);
	                    	     	   a = pP.nextInt();
	                    	     	   if(a == 1)
	                    	     	   {
	                    	     		  int disease, serial;
	                    	     		   String name, add, doc1,phnumb,date,age;
	                    	     		   Scanner n = new Scanner (System.in);
	                    	     		   Scanner ag = new Scanner (System.in);
	                    	     		   Scanner phn = new Scanner (System.in);
	                    	     		   Scanner ad = new Scanner (System.in);
	                    	     		   Scanner di = new Scanner (System.in);
	                    	     		  Scanner dte = new Scanner (System.in);
	                    	     		 System.out.println("\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\tPlease fill up the form.");
	                    	     		   System.out.println("\n\t\t\t\tName:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAge:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tPhone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAddress");
	                    	     		   add = ad.nextLine();
	                    	     		  System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		  System.out.println("\n\n\t\t\t\t______________________________________");
	                                      System.out.println("\t\t\t\t**************************************");
	                                      
	                                      System.out.println("\n\t\t\t\t______________________________________");
	                                      
	                                      System.out.println("\t\t\t\tCheif Complains:");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		 System.out.println("\n\n\t\t\t\t______________________________________");
	                                    System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   
	                    	     		  if (disease == 1)
	                    	     		   {
	                    	     			   String docname [] = {"Newaz Khan", "Dipto Roy", "Jahanara"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (ENT spetialist)");
		        
                                         Random rnum = new Random();
		                    	     		   
                                         int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	 }
	                    	     		  
	                    	     		  else if (disease == 2)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Lucas", "Dr.kabir", "Dr.Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Cardiologist)");
		        
                                       Random rnum = new Random();
		                    	     		   
                                       int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
		                    	     		  else if (disease == 3)
		                    	     		   {
		                    	     			   String docname [] = {"Fahim Bin Amin", "Dr. Zihad Ahmed", "Mahin Rahman"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Neurologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
		                    	     			   String docname [] = {"Golam Kibriya", "Rubina Khatun", "Dr.Samin Yasar"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Gastrologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Sabrina", "Dr.Fahim kabir", "Ataur Rahman"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Urologist)");
			        
                                              Random rnum = new Random();
			                    	     		  
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
		                    	     			   String docname [] = {"Ziaul Rahman", "Dr. Mitu Chokrobarty", "Smita Biswas"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Rheumatologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
                 	        	System.out.println("\t\t\t\t______________________________________");
                 	        	System.out.println("\t\t\t\tAalok Health Care & Hospital Ltd. \n\n\t\t\t\tAddress: House# 1& 2 Road# 2 Block# B Section # 10, Dhaka 1216");
	                    	     	   System.out.println("\n\t\t\t\tPhone Numbers: 01919224895");
	                    	     	   System.out.println("\n\t\t\t\tOpens at 9.00 am and closes at 5.00pm");
	                    	     	  System.out.println("\n\t\t\t\t_________________________________________");
	                    	     	 System.out.println("\t\t\t\t_________________________________________");
	                    	     	   System.out.println("\n\t\t\t\tDo you want to get an appointment for this hospital?\n\n\t\t\t\t1.Yes   2.No");
	                    	     	  System.out.println("\n\t\t\t\t______________________________________");
	                                  System.out.println("\t\t\t\t**************************************");
	                    	     	   int a;
	                    	     	   Scanner pP = new Scanner (System.in);
	                    	     	   a = pP.nextInt();
	                    	     	   if(a == 1)
	                    	     	   {
	                    	     		  int disease, serial;
	                    	     		   String name, add, doc1,phnumb,date,age;
	                    	     		   Scanner n = new Scanner (System.in);
	                    	     		   Scanner ag = new Scanner (System.in);
	                    	     		   Scanner phn = new Scanner (System.in);
	                    	     		   Scanner ad = new Scanner (System.in);
	                    	     		   Scanner di = new Scanner (System.in);
	                    	     		  Scanner dte = new Scanner (System.in);
	                    	     		 System.out.println("\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\tPlease fill up the form.");
	                    	     		   System.out.println("\n\t\t\t\tName:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAge:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tPhone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAddress");
	                    	     		   add = ad.nextLine();
	                    	     		  System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		  System.out.println("\n\n\t\t\t\t______________________________________");
	                                      System.out.println("\t\t\t\t**************************************");
	                                      
	                                      System.out.println("\n\t\t\t\t______________________________________");
	                                      
	                                      System.out.println("\t\t\t\tCheif Complains:");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		 System.out.println("\n\n\t\t\t\t______________________________________");
	                                    System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   
	                    	     		  if (disease == 1)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Zakia Sultana", "Dr. Sahriar", "Iqbal Hassan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (ENT spetialist)");
		        
                                         Random rnum = new Random();
		                    	     		   
                                         int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	 }
	                    	     		  
	                    	     		  else if (disease == 2)
	                    	     		   {
	                    	     			   String docname [] = {"Dr.Nahid", "Dr.Arnob", "Shanta Rahman"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                                      
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Cardiologist)");
		        
                                       Random rnum = new Random();
		                    	     		  
                                       int t=rnum.nextInt(11);
		                    	     		  if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.println("At:"+t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print("At:"+t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print("At:"+t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.println("At:"+t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   }
		                    	     		  else if (disease == 3)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Monir Ahmed", "Abrar Nayeem", "Farzia Rafa"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Neurologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Nashik ahmed", "Dr.Ryan kabir", "Dr. Shahidullah"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Gastrologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Jawad Khondoker", "Dr. Mostaq Billah", "Dr. Mahiba Monowar"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Urologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Sanjana Islam", "Pushpita Haque", "Tasnim Islam"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
			                    	     		   
			                    	     		  System.out.println("\n\n___________________________________________________________________________________");
			                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
			                    	     		  System.out.println("___________________________________________________________________________________");
			                                      
			                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
			                    	     		  System.out.println("On "+date+", You have an appointment under "+ doc1+" (Rheumatologist)");
			        
                                              Random rnum = new Random();
			                    	     		   
                                              int t=rnum.nextInt(11);
			                    	     		  if (t>=9)
			                    	     		   {
			                    	     			   if (t==7 && t==8)
			                    	     			   {
			                    	     				   t = 9;
			                    	     				   System.out.println("At:"+t+":00"+"am");
			                    	     			   }
			                    	     			   else 
			                    	     			   {
			                    	     				 System.out.print("At:"+t+":00"+"am");
			                    	     			   }   
			                    	     		   }
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   System.out.print("At:"+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  if (t==6)
		                    	     				   {
		                    	     					   t = 5;
		                    	     					   System.out.println("At:"+t+":00"+"pm"); 
		                    	     				   }
			                    	     			  else
			                    	     			  {
			                    	     			    System.out.print("At:"+t+":00"+"pm");  
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
	                    	     		   
	                    	     	   }
	                    	     	   else
	                    	     	   {
	                    	     		   System.out.println("Thanks for visiting");
	                    	     	   }
	                    	     	   break;
                 	        }
                 	      }
                       }
                   
                 	     System.out.println("\n___________________________________________________________________________________");
                         System.out.println("***********************************************************************************");
                   
                    
                }
  }
  }
  }
