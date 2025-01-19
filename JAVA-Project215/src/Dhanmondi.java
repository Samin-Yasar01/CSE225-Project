/*  Group 3 Students info
 *  1. Name: Samin Yasar || ID number: 2011279642
 *  2. Name: Abu Sufian Shanto || ID number: 2011844642
 *  3. Name: Azfat Sadat Khan  || ID number: 2012395642
 * */
import java.util.Random;
import java.util.*;
public class Dhanmondi
{
	public Dhanmondi()
    {
	
    }
   public static void dhanmondi()
   {
	   System.out.println("\t\t\t\t______________________________________");
	   System.out.println("\n\t\t\t\t You have selected Dhanmondi. ");
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
                  	   System.out.println("\t\t\t\t _____________________________________________");
                  	   System.out.println("\t\t\t\t Which hospital do you want to see?           ");                	   
                  	   System.out.println("\t\t\t\t _____________________________________________");System.out.println("\n\n\t\t\t\tWe have the following hospitals in Dhanmondi:");
                  	   System.out.println("\n\n\t\t\t\t(Please select numberwise!!!!!)");
                  	   System.out.println("\n\t\t\t\t____________________________________________");
                  	   System.out.println("\n\n\t\t\t\t1. Bangladesh Eye Hospital.\n\t\t\t\t2. Central Hospital Limited.\n\t\t\t\t3. Delta Medical Center Ltd.\n\t\t\t\t4. Dhaka pediatric & Neonatal Hospital.\n\t\t\t\t5. Green Eye and General Hospital.");
                  	   System.out.println("\t\t\t\t______________________________________________");
                  	   System.out.println("\t\t\t\t**********************************************");
                  	   
                  	   Scanner inHospital1 = new Scanner (System.in);
                  	      
                  	      int h = inHospital1.nextInt();
                  	      switch (h)
                  	      {
                  	      case 1 :
                  	        {
                  	        	System.out.println("\t\t\t\t_________________________________________");
                  	        	System.out.println("\t\t\t\tBangladesh Eye Hospital.\n\n\t\t\t\tAddress- Classic Tower (2nd Floor), House-1, Road-11, Block-F");
	                    	    System.out.println("\n\t\t\t\tPhone Numbers:  09610-010616");
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
	                    	     		   
	                    	     		   String name, add, age, phnumb, date;
		                                   int disease, serial;
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
	                                       System.out.println("\t\t\t\tChief complains: ");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		   System.out.println("\n\n\t\t\t\t______________________________________");
	                                       System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							                   String docname [] = {"Dr. Md Riazul Hossain","Dr. Miran Islam", "Dr. Kabil Kabir", "Dr. Habil Choudhury"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (ENT spetialist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     				  System.out.print(t+":00"+"pm");  
		                    	     			  }
		                    	     		   }
		                    	     		   Random rnum2 = new Random();
		                    	     		   serial = rnum2.nextInt(22);
		                    	     		   if(serial == 0)
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
	                    	     			  String docname [] = {"Dr. Rehana Begum","Dr. Nobita Karim", "Dr. Ahsan Milon", "Dr. Musarrat Hossain"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Cardiologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			 String docname [] = {"Dr. Nayem Kabir","Dr. Faiaus Ahsan", "Dr. Nahira Sultana", "Dr. Troye Karim"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Neurologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		  int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Hasan Mahmud","Dr. Spriha Islam", "Dr. Younus Islam", "Dr. Anik Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Gastrologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			   System.out.println("\n___________________________________________________________________________________");
	                      	     		       System.out.println("\t\t\t\t Your Appointment Notice");
	                     	     		       System.out.println("\n___________________________________________________________________________________");
	                    	     			   String docname [] = {"Dr. Rahid Mollah","Dr. Bushra Islam", "Dr. Jannatul Nisa", "Dr. Shreya Zaman"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+ " (Urologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
		                    	     			  }
		                    	     		   }
		                    	     		   Random rnum2 = new Random();
		                    	     		   serial = rnum2.nextInt(22);
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 6)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Kablu Hasan","Dr. Motu Patlu", "Dr. Noyon Bishwas", "Dr. Sowkot Alamgir"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Rheumatologists)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		 
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
                  	        	 System.out.println("\t\t\t\tCentral Hospital Limited.\n\n\t\t\t\tHouse No-02, Road No-05, Green road Dhanmondi, Dhaka");
                  	        	 System.out.println("\n\t\t\t\tPhone Numbers: 02 9660015-19, 02 8624514-19");
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
	                    	     		   
	                    	     		   String name, add, age, phnumb, date;
		                                   int disease, serial;
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
	                                       System.out.println("\t\t\t\tChief complains: ");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		   System.out.println("\n\n\t\t\t\t______________________________________");
		                                   System.out.println("\t\t\t\t**************************************");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							   String docname [] = {"Dr. Manik Borua","Dr. Shikha Sultana", "Dr. Shahin Sultana", "Dr. Alvina Akter"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (ENT spetialist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			  String docname [] = {"Dr. Moyna Binte Hasan","Dr. Jobbar Alam", "Dr. Riyan Mia", "Dr. Hasan Boura"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Cardiologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			 String docname [] = {"Dr. Arby Frank","Dr. Mutlab Khan", "Dr. John Kabir", "Dr. Tahsan Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Neurologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		  int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Mithila Kabir","Dr. Arefin Islam", "Dr. Adnan Bareq", "Dr. Milon Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Gastrologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Mannan Khan","Dr. Mahfuz Kabir", "Dr. Prottoy Hasan", "Dr. Badhon Bari"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+ " (Urologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			   String docname [] = {"Dr. Habil Khan","Dr. Mina Islam", "Dr. Mitali Kabir", "Dr. Mintu Hasan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Rheumatologists)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		 
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
                  	        	 System.out.println("\t\t\t\tDelta Medical Center Ltd.\n\n\t\t\t\tAddress- House No-20, Road No-04, Dhanmondi Dhaka");
                  	        	 System.out.println("\n\t\t\t\tPhone Numbers:  02 8617141, 02 8617142, 02 8617143, 8314887");
                  	        	 System.out.println("\n\t\t\t\tOpens at 9.00 AM closes at 5.00");
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
	                    	     		   
	                    	     		   String name, add, age, phnumb, date;
		                                   int disease, serial;
	                    	     		   Scanner n = new Scanner (System.in);
	                    	     		   Scanner ag = new Scanner (System.in);
	                    	     		   Scanner phn = new Scanner (System.in);
	                    	     		   Scanner ad = new Scanner (System.in);
	                    	     		   Scanner di = new Scanner (System.in);
	                    	     		   Scanner dte = new Scanner (System.in);
	                    	     		   
	                    	     		   System.out.println("\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\tPlease fill up the form.");
	                    	     		   System.out.println("\t\t\t\t______________________________________");
	                    	     		   System.out.println("\n\t\t\t\tName:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAge:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tPhone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tAddress:");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("\n\t\t\t\tEnter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("\n\n\t\t\t\t______________________________________");
	                    	     		   System.out.println("\t\t\t\t**************************************");
	                    	     		   System.out.println("\n\t\t\t\t______________________________________"); 
	                    	     		  System.out.println("\t\t\t\tChief complains: ");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
											   String docname [] = {"Dr. Mintu Kabir","Dr. Sentu Islam", "Dr. Rahid Kabir", "Dr. Monamy Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (ENT spetialist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			  String docname [] = {"Dr. Jabed Khan","Dr. Kakon Kabir", "Dr. Shakib Hasan", "Dr. Montu Barua"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Cardiologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			 String docname [] = {"Dr. Bushra Begum","Dr. Anonto Khan", "Dr. Maisha Hossain", "Dr. Bushra Hossain"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Neurologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		  int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Namirah Islam","Dr. Mita Khan", "Dr. KD Hasan", "Dr. Miraz Hasan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		   System.out.println("\n\n___________________________________________________________________________________");
		                    	     		   System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		   System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Gastrologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. DL Khan","Dr. Moushumi Hasan", "Dr. Shanto Hasan", "Dr. Abu Sufian Shanto"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+ " (Urologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			   String docname [] = {"Dr. Azfar Sadat","Dr. Samin Yasar", "Dr. Samin Khan", "Dr. Azfar Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Rheumatologists)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		 
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
                  	        	System.out.println("\t\t\t\tDhaka pediatric & Neonatal Hospital.\n\n\t\t\t\tAddreess- 4, 4A Zakir Hosain Rd, Dhaka 1207");
                  	        	System.out.println("\n\t\t\t\tPhone Numbers: 01618-225566");
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
	                    	     		   
	                    	     		   String name, add, age, phnumb, date;
		                                   int disease, serial;
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
	                    	     		   System.out.println("\t\t\t\tChief complains: ");
	                    	     		   System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							                   String docname [] = {"Dr. Billu Khan","Dr. Maria Sharaprova", "Dr. Mithun Khan", "Dr. Bijli Kabir"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (ENT spetialist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			  String docname [] = {"Dr. Mimi Khan","Dr. Jinnat Karim", "Dr. Sumaiya Nishi", "Dr. Apon Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Cardiologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			 String docname [] = {"Dr. Sadia Khan","Dr. Sumaiya Kabir", "Dr. Jakir Hossain", "Dr. Mishu Mahbub"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Neurologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		  int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Siam Ahmed","Dr. Shajib Mitra", "Dr. Bilkis Alamgir", "Dr. Asad Mohammad"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Gastrologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Nargis Sultana","Dr. Bilkis Sultana", "Dr. Shahin Sultana", "Dr. Trepty Sultana"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+ " (Urologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			   String docname [] = {"Dr. Fatema Akter","Dr. Monmoy Jalal", "Dr. Habu Khan", "Dr. Shahrukh Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Rheumatologists)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		 
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
                  	      case 5 :
                  	        {
                  	        	System.out.println("\t\t\t\t______________________________________");
                  	        	System.out.println("\t\t\t\tGreen Eye and General Hospital. \n\n\t\t\t\tAddress: Dhanmondi Plaza, House #18 Rd No. 6, Dhaka 1205");
                  	        	 System.out.println("\n\t\t\t\tPhone Numbers: 01770-408060");
                  	        	 System.out.println("\n\t\t\t\tOpens at 9.00 AM closes at 5.00");
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
	                    	     		   
	                    	     		   String name, add, age, phnumb, date;
		                                   int disease, serial;
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
	                                      System.out.println("\t\t\t\tChief complains: ");
	                    	     		  System.out.println("\n\n\t\t\t\t1. Hearing problem or Sore Throat or Nasal congestion\n\t\t\t\t2. Chest pain\n\t\t\t\t3. Headache or Vertigo\n\t\t\t\t4. Lower abdominal pain\n\t\t\t\t5. Upper abdominal pain\n\t\t\t\t6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
											   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	     		   System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (ENT spetialist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			  String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+" 2021, you have an appointment under "+ doc1+" (Cardiologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			 String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Neurologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		  int t=rnum.nextInt(11);
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Gastrologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+ " (Urologist)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		  
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
	                    	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
		                    	     		  System.out.println("\n\n___________________________________________________________________________________");
		                    	     		  System.out.println("\t\t\t\tYour Appointment Notice");
		                    	     		  System.out.println("___________________________________________________________________________________");
		                    	     		   System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone number: "+phnumb+"\nAddress: "+add);
		                    	               System.out.println("On "+date+", you have an appointment under "+ doc1+" (Rheumatologists)");
		                    	     		   Random rnum = new Random();
		                    	     		   System.out.print("At: ");
		                    	     		   int t=rnum.nextInt(11);
		                    	     		 
		                    	     		   if (t>=9)
		                    	     		   {
		                    	     			   if (t==7 && t==8)
		                    	     			   {
		                    	     				   t = 9;
		                    	     				   System.out.print(t+":00"+"am");
		                    	     			   }
		                    	     			   else 
		                    	     			   {
		                    	     				 System.out.print(t+":00"+"am");
		                    	     			   }   
		                    	     		   }
		                    	     		   else if (t==0)
		                    	     		   {
		                    	     			   t=12;
		                    	     			   System.out.print(t+":00"+"pm"); 
		                    	     		   }
		                    	     		   else 
		                    	     		   {
		                    	     			  if (t==6)
	                    	     				   {
	                    	     					   t = 5;
	                    	     					   System.out.print(t+":00"+"pm"); 
	                    	     				   }
		                    	     			  else
		                    	     			  {
		                    	     			    System.out.print(t+":00"+"pm");  
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
                       }
                     
                     default :
                  	   System.out.println("  ");
                    
                     
      }
             System.out.println("\n___________________________________________________________________________________");
             System.out.println("***********************************************************************************");
   }
}