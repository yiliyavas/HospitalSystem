import java.util.Scanner;
import java.io.*;

public class HospitalBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//person info prompts
		System.out.println("Enter patient's ID: ");
		int ID = input.nextInt();
		System.out.println("Enter patient's first name: ");
		String firstName = input.next();
		System.out.println("Enter patient's last name: ");
		String lastName = input.next();
		
		
		//doctors info prompts
		System.out.println("\nEnter doctor's first name: ");
		String firstNameDr = input.next();
		System.out.println("Enter doctor's last name: ");
		String lastNameDr = input.next();
		System.out.println("Enter doctor's specialty: ");
		String specialtyDr = input.next();
		
		
		//date prompts
		System.out.println("\nEnter Admission Date (day/month/year): ");
		String date2 = input.next();
		System.out.println("Enter Dismissal Date (day/month/year): ");
		String date3 = input.next();
		
		
		//prompt for billing
		System.out.println("Enter pharmacy Charges, room Rent, and doctor's Fee: ");
		double pharmCharge = input.nextDouble();
		double roomRent = input.nextDouble();
		double doctorFee = input.nextDouble();
		
		
		//creates objects with dates
		Date d1Obj = new Date(10, 15, 2002); //sets birth date
		Date d2Obj = dateFix(date2);
		Date d3Obj = dateFix(date3);
		
		//more objects creation
		Doctor newDr = new Doctor(firstNameDr, lastNameDr, specialtyDr);
		Patient newPatient = new Patient(firstName, lastName, ID, d1Obj, newDr, d2Obj, d3Obj);
		Bill newBill = new Bill(firstName, lastName, ID, pharmCharge, roomRent, doctorFee);
		
		//printing statements
		System.out.println(newPatient.toString());
		System.out.println(newBill.toString());
		
		
		String filename = firstName + lastName + ".txt";
		try {
			FileWriter out = new FileWriter(filename);
			out.write(newPatient.toString() + "\n" + newBill.toString());
			out.close();
			
		} catch(IOException e) {
			System.out.print("unable to create file");
		}
		
	}
	
	static public Date dateFix(String a) {
		String[] dmy1 = a.split("/");
		Date obj = new Date(Integer.parseInt(dmy1[0]), Integer.parseInt(dmy1[1]), Integer.parseInt(dmy1[2]));
		return obj;
	}

}
