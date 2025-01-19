import java.util.Random;
import java.util.Scanner;
public class project215 
{
 
	public static void main (String [] args)
  {
	  String dhaka = null;
	  Scanner in = new Scanner (System.in);
	  System.out.println("Select location namewise: \n1.Banani.\n2.Dhanmondi.\n3.Mirpur.");
	 
	  city (dhaka);
	 
	
  }
  
  
  
  
  public static void city(String d)
  {
	  Scanner input = new Scanner (System.in);
	  String dh;
	  dh = input.next();
	  switch (dh)
	  {
	 
	  case ("Banani"):
	         {
		         System.out.println("You have selected Banani.\n");
		         System.out.println("Do you want to see the Hospitals?");
		         
		         String institution;
		         Scanner inHospital = new Scanner (System.in);
		         institution = inHospital.next();
		         
		               switch (institution)
		                   {
		                       case ("Yes"):
		                          {
		                    	   System.out.println("Which hospital do you want to see?");
		                    	   System.out.println("We have the following hospitals in Banani: \n(Please select numberwise!!!!!)");
		                    	   System.out.println("1. Prescription point. \n2. M.R. Center Ltd.\n3. Square Hospital Consultation & Diagnostic Center \n4. Banani Clinic Ltd. \n5. Labaid Diagnostic Center. ");
		                    	   Scanner inHospital1 = new Scanner (System.in);
		                    	      
		                    	      int h = inHospital1.nextInt();
		                    	      switch (h)
		                    	      {
		                    	        case 1 :
		                    	        {
		                    	     	   System.out.println("\n\nPrescription Point Ltd. \nAddress: House-105, Road-12, Block-E, Banani, Dhaka-1213");
		                    	     	   System.out.println("Phone Numbers: 01713-333233");
		                    	     	   System.out.println("Opens at 7.30am & closes at 12.00am");
		                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
		                    	     	   
		                    	     	   int a;
		                    	     	   Scanner pP = new Scanner (System.in);
		                    	     	   a = pP.nextInt();
		                    	     	   if(a == 1)
		                    	     	   {
		                    	     		   int disease;
		                    	     		   String name, add, doc1, age, phnumb, date;
		                    	     		   Scanner n = new Scanner (System.in);
		                    	     		   Scanner ag = new Scanner (System.in);
		                    	     		   Scanner phn = new Scanner (System.in);
		                    	     		   Scanner ad = new Scanner (System.in);
		                    	     		   Scanner di = new Scanner (System.in);
		                    	     		   Scanner dte = new Scanner (System.in);
		                    	     		   System.out.println("Please fill up the form.");
		                    	     		   System.out.println("Name:");
		                    	     		   name = n.nextLine();
		                    	     		   System.out.println("Age:");
		                    	     		   age = ag.nextLine();
		                    	     		   System.out.println("Phone Number:");
		                    	     		   phnumb = phn.nextLine();
		                    	     		   System.out.println("Address");
		                    	     		   add = ad.nextLine();
		                    	     		   System.out.println("Enter the date you want to get appointment on");
		                    	     		   date = dte.nextLine();
		                    	     		   System.out.println("Chief complains: ");
		                    	     		   System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
		                    	     		   disease = di.nextInt();
		                    	     		   if (disease == 1)
		                    	     		   {
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
			                    	     		   else if (t==0)
			                    	     		   {
			                    	     			   t=12;
			                    	     			   
			                    	     			   System.out.print("At: "+t+":00"+"pm"); 
			                    	     		   }
			                    	     		   else 
			                    	     		   {
			                    	     			  
			                    	     			  System.out.print("At: "+t+":00"+"pm");  
			                    	     		   }
		                    	     		   }
		                    	     		   else if (disease == 2)
		                    	     		   {
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
		                    	     		   }
		                    	     		  else if (disease == 3)
		                    	     		   {
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
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
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
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
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
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
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
		                    	        	System.out.println("\n\nM.R. Center Ltd.\nShorgo, Level-10th, House # # # E, Banani C/A, 1213., 49 Rd No 17, Dhaka");
			                    	     	   System.out.println("Phone Numbers: 01713-333233");
			                    	     	  System.out.println("Opens at 7.00 am & closes at 9.00 pm.");
			                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
			                    	     	   
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
			                    	     		   System.out.println("Please fill up the form.");
			                    	     		   System.out.println("Name:");
			                    	     		   name = n.nextLine();
			                    	     		   System.out.println("Age:");
			                    	     		   age = ag.nextLine();
			                    	     		   System.out.println("Phone Number:");
			                    	     		   phnumb = phn.nextLine();
			                    	     		   System.out.println("Address");
			                    	     		   add = ad.nextLine();
			                    	     		   System.out.println("Enter the date you want to get appointment on");
			                    	     		   date = dte.nextLine();
			                    	     		   System.out.println("Chief complains:");
			                    	     		   System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
			                    	     		   disease = di.nextInt();
			                    	     		   if (disease == 1)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		   else if (disease == 2)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
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
		                    	        	System.out.println("\n\nSquare Hospital Consultation & Diagnostic Center.\nAddress- Classic Tower (2nd Floor), House-1, Road-11, Block-F");
			                    	     	   System.out.println("Phone Numbers:  09610-010616");
			                    	     	  System.out.println("Opens at 9.00 am and closes at 5.00pm");
			                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
			                    	     	  
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
			                    	     		   System.out.println("Please fill up the form.");
			                    	     		   System.out.println("Name:");
			                    	     		   name = n.nextLine();
			                    	     		   System.out.println("Age:");
			                    	     		   age = ag.nextLine();
			                    	     		   System.out.println("Phone Number:");
			                    	     		   phnumb = phn.nextLine();
			                    	     		   System.out.println("Address");
			                    	     		   add = ad.nextLine();
			                    	     		   System.out.println("Enter the date you want to get appointment on");
			                    	     		   date = dte.nextLine();
			                    	     		   System.out.println("Chief complains:");
			                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
			                    	     		   disease = di.nextInt();
			                    	     		   String doc1;
												if (disease == 1)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		   else if (disease == 2)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   
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
		                    	        	   System.out.println("\n\nBanani Clinic.\nAddreess- Rd No 13C, Dhaka 1212");
			                    	     	   System.out.println("Phone Numbers: 01611-443345");
			                    	     	  System.out.println("Opens 7.00 am & closes at 9.00pm");
			                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
			                    	     	   
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
			                    	     		   System.out.println("Please fill up the form.");
			                    	     		   System.out.println("Name:");
			                    	     		   name = n.nextLine();
			                    	     		   System.out.println("Age:");
			                    	     		   age = ag.nextLine();
			                    	     		   System.out.println("Phone Number:");
			                    	     		   phnumb = phn.nextLine();
			                    	     		   System.out.println("Address");
			                    	     		   add = ad.nextLine();
			                    	     		   System.out.println("Enter the date you want to get appointment on");
			                    	     		   date = dte.nextLine();
			                    	     		   System.out.println("Chief complains:");
			                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
			                    	     		   disease = di.nextInt();
			                    	     		   String doc1;
												if (disease == 1)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		   else if (disease == 2)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
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
		                    	        	   System.out.println("Labaid Diagnostic Center. \nAddress: House # 13/A(4th Floor, Road#35, Dhaka 1212");
			                    	     	   System.out.println("Phone Numbers: 02-9858943");
			                    	     	   System.out.println("Opens at 8.00 am & closes 5.00pm");
			                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
			                    	     	  
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
			                    	     		   System.out.println("Please fill up the form.");
			                    	     		   System.out.println("Name:");
			                    	     		   name = n.nextLine();
			                    	     		   System.out.println("Age:");
			                    	     		   age = ag.nextLine();
			                    	     		   System.out.println("Phone Number:");
			                    	     		   phnumb = phn.nextLine();
			                    	     		   System.out.println("Address");
			                    	     		   add = ad.nextLine();
			                    	     		   System.out.println("Enter the date you want to get appointment on");
			                    	     		   date = dte.nextLine();
			                    	     		   System.out.println("Chief complains");
			                    	     		   System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
			                    	     		   disease = di.nextInt();
			                    	     		   String doc1;
												if (disease == 1)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		   else if (disease == 2)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
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
		                       
		                       default :
		                    	   System.out.println("  ");
		                      
		                       
		                   }
		               
		               
		               
		     }
	  
	  
	  
	  
	  
	  
	  
	  case ("Dhanmondi"):
      {
	  System.out.println("You have selected Dhanmondi.\n");
       System.out.println("Do you want to see the Hospitals?");
       
       String institution;
       Scanner inHospital = new Scanner (System.in);
       institution = inHospital.next();
       
             switch (institution)
                 {
                     case ("Yes"):
                        {
                  	   System.out.println("Which hospital do you want to see?");
                  	   System.out.println("We have the following hospitals in Dhanmondi: \n(Please select numberwise!!!!!)");
                  	   System.out.println("1. Bangladesh Eye Hospital. \n2. Central Hospital Limited.\n3. Delta Medical Center Ltd. \n4. Dhaka pediatric & Neonatal Hospital. \n5. Green Eye and General Hospital. ");
                  	   Scanner inHospital1 = new Scanner (System.in);
                  	      
                  	      int h = inHospital1.nextInt();
                  	      switch (h)
                  	      {
                  	      case 1 :
                  	        {
                  	        	System.out.println("\n\nSquare Hospital Consultation & Diagnostic Center.\nAddress- Classic Tower (2nd Floor), House-1, Road-11, Block-F");
	                    	     	   System.out.println("Phone Numbers:  09610-010616");
	                    	     	  System.out.println("Opens at 9.00 am and closes at 5.00pm");
	                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
	                    	     	  
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							                   String docname [] = {"Dr. Md Riazul Hossain","Dr. Miran Islam", "Dr. Kabil Kabir", "Dr. Habil Choudhury"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else if (disease == 2)
	                    	     		   {
	                    	     			  String docname [] = {"Dr. Rehana Begum","Dr. Nobita Karim", "Dr. Ahsan Milon", "Dr. Musarrat Hossain"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			 String docname [] = {"Dr. Nayem Kabir","Dr. Faiaus Ahsan", "Dr. Nahira Sultana", "Dr. Troye Karim"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Hasan Mahmud","Dr. Spriha Islam", "Dr. Younus Islam", "Dr. Anik Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   
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
                  	        	 System.out.println("\n\nCentral Hospital Limited.\nHouse No-02, Road No-05, Green road Dhanmondi, Dhaka");
                  	        	 System.out.println("Phone Numbers: 02 9660015-19, 02 8624514-19");
                  	        	 System.out.println("Opens at 9.00 am and closes at 5.00pm");
                  	        	 System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							   String docname [] = {"Dr. Manik Borua","Dr. Shikha Sultana", "Dr. Shahin Sultana", "Dr. Alvina Akter"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else if (disease == 2)
	                    	     		   {
	                    	     			  String docname [] = {"Dr. Moyna Binte Hasan","Dr. Jobbar Alam", "Dr. Riyan Mia", "Dr. Hasan Boura"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			 String docname [] = {"Dr. Arby Frank","Dr. Mutlab Khan", "Dr. John Kabir", "Dr. Tahsan Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Mithila Kabir","Dr. Arefin Islam", "Dr. Adnan Bareq", "Dr. Milon Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Mannan Khan","Dr. Mahfuz Kabir", "Dr. Prottoy Hasan", "Dr. Badhon Bari"};
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
	                    	     			   String docname [] = {"Dr. Habil Khan","Dr. Mina Islam", "Dr. Mitali Kabir", "Dr. Mintu Hasan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   
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
                  	        	 System.out.println("\n\nDelta Medical Center Ltd.\nAddress- House No-20, Road No-04, Dhanmondi Dhaka");
                  	        	 System.out.println("Phone Numbers:  02 8617141, 02 8617142, 02 8617143, 8314887");
                  	        	 System.out.println("Opens at 9.00 AM closes at 5.00");
                  	        	 System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
											   String docname [] = {"Dr. Mintu Kabir","Dr. Sentu Islam", "Dr. Rahid Kabir", "Dr. Monamy Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else if (disease == 2)
	                    	     		   {
	                    	     			  String docname [] = {"Dr. Jabed Khan","Dr. Kakon Kabir", "Dr. Shakib Hasan", "Dr. Montu Barua"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			 String docname [] = {"Dr. Bushra Begum","Dr. Anonto Khan", "Dr. Maisha Hossain", "Dr. Bushra Hossain"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Namirah Islam","Dr. Mita Khan", "Dr. KD Hasan", "Dr. Miraz Hasan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
	                    	     			String docname [] = {"Dr. DL Khan","Dr. Moushumi Hasan", "Dr. Shanto Hasan", "Dr. Abu Sufian Shanto"};
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
	                    	     			   String docname [] = {"Dr. Azfar Sadat","Dr. Samin Yasar", "Dr. Samin Khan", "Dr. Azfar Choudhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   
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
                  	        	 System.out.println("\n\nDhaka pediatric & Neonatal Hospital.\nAddreess- 4, 4A Zakir Hosain Rd, Dhaka 1207");
                  	        	 System.out.println("Phone Numbers: 01618-225566");
                  	        	 System.out.println("Opens at 9.00 am and closes at 5.00pm");
                  	        	 System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
							                   String docname [] = {"Dr. Billu Khan","Dr. Maria Sharaprova", "Dr. Mithun Khan", "Dr. Bijli Kabir"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else if (disease == 2)
	                    	     		   {
	                    	     			  String docname [] = {"Dr. Mimi Khan","Dr. Jinnat Karim", "Dr. Sumaiya Nishi", "Dr. Apon Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			 String docname [] = {"Dr. Sadia Khan","Dr. Sumaiya Kabir", "Dr. Jakir Hossain", "Dr. Mishu Mahbub"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Siam Ahmed","Dr. Shajib Mitra", "Dr. Bilkis Alamgir", "Dr. Asad Mohammad"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Nargis Sultana","Dr. Bilkis Sultana", "Dr. Shahin Sultana", "Dr. Trepty Sultana"};
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
	                    	     			   String docname [] = {"Dr. Fatema Akter","Dr. Monmoy Jalal", "Dr. Habu Khan", "Dr. Shahrukh Khan"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   
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
                  	        	 System.out.println("Islami General Hospital. \nAddress: Dhanmondi Plaza, House #18 Rd No. 6, Dhaka 1205");
                  	        	 System.out.println("Phone Numbers: 01770-408060");
                  	        	 System.out.println("Opens at 9.00 AM closes at 5.00");
                  	        	 System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		   System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		   String doc1;
										if (disease == 1)
	                    	     		   {
											   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		   else if (disease == 2)
	                    	     		   {
	                    	     			  String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		  else if (disease == 3)
	                    	     		   {
	                    	     			 String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		 else if (disease == 4)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 5)
	                    	     		   {
	                    	     			String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	     		else if (disease == 6)
	                    	     		   {
	                    	     			   String docname [] = {"Dr. Md Mahfuzul Hussain","Dr. Shirazul Islam", "Dr. Ahsan Kabir", "Dr. Shahil Chawdhuri"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   
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
             
             
             
      }



	  
	  
	  
	  
	  
	  
	  case ("Mirpur"):
      {
	         System.out.println("You have selected Mirpur.\n");
	         System.out.println("Do you want to see the Hospitals?");
	         
	         String institution;
	         Scanner inHospital = new Scanner (System.in);
	         institution = inHospital.next();
	         
	               switch (institution)
	                   {
	                       case ("Yes"):
	                          {
	                    	   System.out.println("Which hospital do you want to see?");
	                    	   System.out.println("We have the following hospitals in Mirpur: \n(Please select numberwise!!!!!)");
	                    	   System.out.println("1. Mirpur General Hospital & Diagnostic Centre \n2. Al Helal Specialized Hospital Dhaka.\n3. Delta Hospital Ltd.\n4. Kingston Hospital.\n5. Aalok Health Care & Hospital Ltd. \n");
	                  
	                    	   Scanner inHospital1 = new Scanner (System.in);
	                    	      
	                    	      int h = inHospital1.nextInt();
	                    	      switch (h)
	                    	      {
	                    	        case 1 :
	                    	        {
	                    	     	   System.out.println("\n\nMirpur General Hospital & Diagnostic Centre. \nAddress: Block- B, Plot No, 10 1216 Road 4");
	                    	     	   System.out.println("Phone Numbers: 01785906599");
	                    	     	   System.out.println("Opens at 9.00 am and closes at 5.00pm");
	                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
	                    	     		   System.out.println("Please fill up the form.");
	                    	     		   System.out.println("Name:");
	                    	     		   name = n.nextLine();
	                    	     		   System.out.println("Age:");
	                    	     		   age = ag.nextLine();
	                    	     		   System.out.println("Phone Number:");
	                    	     		   phnumb = phn.nextLine();
	                    	     		   System.out.println("Address");
	                    	     		   add = ad.nextLine();
	                    	     		  System.out.println("Enter the date you want to get appointment on");
	                    	     		   date = dte.nextLine();
	                    	     		   System.out.println("Disease:");
	                    	     		   System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
	                    	     		   disease = di.nextInt();
	                    	     		  if (disease == 1)
	                    	     		   {
	                    	     			   String docname [] = {"Gerard Henry", "Sitab Ahmed", "Dr. Shahi"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	 
	                    	     		  
	                    	     		  else if (disease == 2)
	                    	     		   {
	                    	     			   String docname [] = {"Selina Hossain", "Dr. jojo kabir", "Ahmed Sarker"};
		                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
		                    	     		   System.out.println("\nYour serial number is: "+serial);
	                    	     		   }
	                    	 
	                    	     	   
	                    	     		   
		                    	     		  else if (disease == 3)
		                    	     		   {
		                    	     			   String docname [] = {"Rupa Kormoker", "Kabir Roy", "Dipto Chowdhury"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
		                    	     		 else if (disease == 4)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Tashu", "Dr.Kibria", "Dr. Simon"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
		                    	     		else if (disease == 5)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Nashik ahmed", "Dr.Ryan kabir", "Dr. Shahidullah"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
		                    	     		else if (disease == 6)
		                    	     		   {
		                    	     			   String docname [] = {"Sufiya kamal", "Dr. Ahmed", "Sahjahhan Kumar"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
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
	                    	        	System.out.println("\n\nAl Helal Specialized Hospital Dhaka.\nAdress: 150, Begum Rokeya Sarani, Mirpur-10, Dhaka");
		                    	     	   System.out.println("Phone Numbers: 029008181");
		                    	     	   System.out.println("Opens at 9.00 am and closes at 5.00pm");
		                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
		                    	     		   System.out.println("Please fill up the form.");
		                    	     		   System.out.println("Name:");
		                    	     		   name = n.nextLine();
		                    	     		   System.out.println("Age:");
		                    	     		   age = ag.nextLine();
		                    	     		   System.out.println("Phone Number:");
		                    	     		   phnumb = phn.nextLine();
		                    	     		   System.out.println("Address");
		                    	     		   add = ad.nextLine();
		                    	     		  System.out.println("Enter the date you want to get appointment on");
		                    	     		   date = dte.nextLine();
		                    	     		   System.out.println("Disease:");
		                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
		                    	     		   disease = di.nextInt();
		                    	     		   
		                    	     		  if (disease == 1)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Lucas", "Dr.kabir", "Dr.Khan"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	 }
		                    	     		  
		                    	     		  else if (disease == 2)
		                    	     		   {
		                    	     			   String docname [] = {"Tasfia Khan", "Dr.Mostafa Khan", "Iftekher Asef"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
			                    	     			   String docname [] = {"Newaz Khan", "Dipto Roy", "Jahanara"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
			                    	     			   String docname [] = {"Fahim Bin Amin", "Dr. Zihad Ahmed", "Mahin Rahman"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
			                    	     			   String docname [] = {"Samiha Ishrat", "Sanjana Mou", "Dr. Sadia ara"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
			                    	     			   String docname [] = {"Dr.Shanto", "Dr.Riana", "Mahir Faisal"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
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
	                    	        	System.out.println("\n\n Delta Hospital Ltd.\nAddress-  2 Tolarbag 1st Ln, Mirpur-1, Dhaka");
		                    	     	   System.out.println("Phone Numbers:  029022410");
		                    	     	   System.out.println("Opens at 9.00 am and closes at 5.00pm");
		                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
		                    	     		   System.out.println("Please fill up the form.");
		                    	     		   System.out.println("Name:");
		                    	     		   name = n.nextLine();
		                    	     		   System.out.println("Age:");
		                    	     		   age = ag.nextLine();
		                    	     		   System.out.println("Phone Number:");
		                    	     		   phnumb = phn.nextLine();
		                    	     		   System.out.println("Address");
		                    	     		   add = ad.nextLine();
		                    	     		  System.out.println("Enter the date you want to get appointment on");
		                    	     		   date = dte.nextLine();
		                    	     		   System.out.println("Disease:");
		                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
		                    	     		   disease = di.nextInt();
		                    	     		   
		                    	     		  if (disease == 1)
		                    	     		   {
		                    	     			   String docname [] = {"Gerard Henry", "Sitab Ahmed", "Dr. Shahi"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	 }
		                    	     		  
		                    	     		  else if (disease == 2)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Shanto", "Dr.Riana", "Mahir Faisal"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
			                    	     			   String docname [] = {"Samiha Ishrat", "Sanjana Mou", "Dr. Sadia ara"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
			                    	     			   String docname [] = {"Dr.Tashu", "Dr.Kibria", "Dr. Simon"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
			                    	     			   String docname [] = {"Tasfia Khan", "Dr.Mostafa Khan", "Iftekher Asef"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
			                    	     			   String docname [] = {"Sufiya kamal", "Dr. Ahmed", "Sahjahhan Kumar"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   
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
	                    	        	System.out.println("\n\nKingston Hospital.\nAddreess- House 51-54, Road 01 & 02, Block-D, Shahidbag Mirpur -12 Dhaka, 1216");
		                    	     	   System.out.println("Phone Numbers: 01952989866");
		                    	     	   System.out.println("Opens at 9.00 am and closes at 5.00pm");
		                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
		                    	     		   System.out.println("Please fill up the form.");
		                    	     		   System.out.println("Name:");
		                    	     		   name = n.nextLine();
		                    	     		   System.out.println("Age:");
		                    	     		   age = ag.nextLine();
		                    	     		   System.out.println("Phone Number:");
		                    	     		   phnumb = phn.nextLine();
		                    	     		   System.out.println("Address");
		                    	     		   add = ad.nextLine();
		                    	     		  System.out.println("Enter the date you want to get appointment on");
		                    	     		   date = dte.nextLine();
		                    	     		   System.out.println("Disease:");
		                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
		                    	     		   disease = di.nextInt();
		                    	     		   
		                    	     		  if (disease == 1)
		                    	     		   {
		                    	     			   String docname [] = {"Newaz Khan", "Dipto Roy", "Jahanara"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	 }
		                    	     		  
		                    	     		  else if (disease == 2)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Lucas", "Dr.kabir", "Dr.Khan"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
			                    	     			   String docname [] = {"Fahim Bin Amin", "Dr. Zihad Ahmed", "Mahin Rahman"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
			                    	     			   String docname [] = {"Golam Kibriya", "Rubina Khatun", "Dr.Samin Yasar"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
			                    	     			   String docname [] = {"Dr.Sabrina", "Dr.Fahim kabir", "Ataur Rahman"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
			                    	     			   String docname [] = {"Ziaul Rahman", "Dr. Mitu Chokrobarty", "Smita Biswas"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
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
	                    	        	System.out.println("\n\nAalok Health Care & Hospital Ltd. \nAddress: House# 1& 2 Road# 2 Block# B Section # 10, Dhaka 1216");
		                    	     	   System.out.println("Phone Numbers: 01919224895");
		                    	     	   System.out.println("Opens at 9.00 am and closes at 5.00pm");
		                    	     	   System.out.println("Do you want to get an appointment for this hospital?\n1.Yes   2.No");
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
		                    	     		   System.out.println("Please fill up the form.");
		                    	     		   System.out.println("Name:");
		                    	     		   name = n.nextLine();
		                    	     		   System.out.println("Age:");
		                    	     		   age = ag.nextLine();
		                    	     		   System.out.println("Phone Number:");
		                    	     		   phnumb = phn.nextLine();
		                    	     		   System.out.println("Address");
		                    	     		   add = ad.nextLine();
		                    	     		  System.out.println("Enter the date you want to get appointment on");
		                    	     		   date = dte.nextLine();
		                    	     		   System.out.println("Disease:");
		                    	     		  System.out.println("1. Hearing problem or Sore Throat or Nasal congestion\n2. Chest pain\n3. Headache or Vertigo\n4. Lower abdominal pain\n5. Upper abdominal pain\n6. Body ache or Joints pain");
		                    	     		   disease = di.nextInt();
		                    	     		   
		                    	     		  if (disease == 1)
		                    	     		   {
		                    	     			   String docname [] = {"Dr. Zakia Sultana", "Dr. Sahriar", "Iqbal Hassan"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	 }
		                    	     		  
		                    	     		  else if (disease == 2)
		                    	     		   {
		                    	     			   String docname [] = {"Dr.Nahid", "Dr.Arnob", "Shanta Rahman"};
			                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
			                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   }
			                    	     		  else if (disease == 3)
			                    	     		   {
			                    	     			   String docname [] = {"Dr.Monir Ahmed", "Abrar Nayeem", "Farzia Rafa"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		 else if (disease == 4)
			                    	     		   {
			                    	     			   String docname [] = {"Dr. Nashik ahmed", "Dr.Ryan kabir", "Dr. Shahidullah"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 5)
			                    	     		   {
			                    	     			   String docname [] = {"Dr. Jawad Khondoker", "Dr. Mostaq Billah", "Dr. Mahiba Monowar"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
			                    	     		   }
			                    	     		else if (disease == 6)
			                    	     		   {
			                    	     			   String docname [] = {"Dr. Sanjana Islam", "Pushpita Haque", "Tasnim Islam"};
				                    	     		   doc1 = docname[new Random().nextInt(docname.length)];
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
				                    	     		   System.out.println("\nYour serial number is: "+serial);
		                    	     		   
		                    	     	   }
		                    	     	   else
		                    	     	   {
		                    	     		   System.out.println("Thanks for visiting");
		                    	     	   }
		                    	     	   break;
	                    	        }
	                    	      }
	                          }
	                      
	                    	   System.out.println("***********************************************************");
	                      
	                       
	                   }
	               
	               
	               
      }
 }
}
}
}


      
  

  

  
  
  

  
  
  
  

