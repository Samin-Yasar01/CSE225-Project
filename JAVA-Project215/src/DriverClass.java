/*  Group 3 Students info
 *  1. Name: Samin Yasar || ID number: 2011279642
 *  2. Name: Abu Sufian Shanto || ID number: 2011844642
 *  3. Name: Azfat Sadat Khan  || ID number: 2012395642
 * */
import java.util.Scanner;
public class DriverClass
{

	public static void main(String[] args) throws Exception 
	{
		String a;
		System.out.println("\t\t\t\t_________________________________________");
		System.out.println("\t\t\t\t\t Select your location");
		System.out.println("\t\t\t\t_________________________________________");
		System.out.println("\t\t\t\t1. Banani\n\t\t\t\t2. Dhanmondi.\n\t\t\t\t3. Mirpur.");
		System.out.println("\t\t\t\t_________________________________________");
		System.out.println("\t\t\t\t*****************************************");
		Scanner loc1 = new Scanner (System.in);
		a = loc1.nextLine();
	    if (a.equals("Banani"))
		
		{
			Banani obj1 = new Banani();
			obj1.banani();
		}
		else if (a.equals("Dhanmondi"))
		{
			Dhanmondi obj2 = new Dhanmondi();
			obj2.dhanmondi();
		}
		else if (a.equals("Mirpur"))
		{
			Mirpur obj3 = new Mirpur();
			obj3.mirpur();
		}
		else 
		{
			throw new Exception("{-Enther the name according the list.-}");
		}
	}
}
