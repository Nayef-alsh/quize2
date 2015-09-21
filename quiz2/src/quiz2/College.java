//Alsharari,Naif 
package quiz2;
//Import the scanner class to get input from user
import java.util.Scanner;
public class College {
	public static void main (String[] args){
		//assign the scanner class to use it 
		Scanner input = new Scanner (System.in);
		// getting info. from the user to use it
		//print questions to the user
		System.out.println("Enter the actuat tuition");
		// define new variable and assign the given info to it.
		double Tution = input.nextDouble();
		System.out.println("Enter the perecentage increase for 2nd year:");
		double percent1 = input.nextDouble();
		System.out.println("Enter the perecentage increase for 3ed year:");
		double percent2 = input.nextDouble();
		System.out.println("Enter the perecentage increase for 4th year:");
		double percent3 = input.nextDouble();
		System.out.println("Enter the intreset rate for te APR: ");
		double APR = input.nextDouble();
		// assign the the info given in a list so we can use it in the method.
		double[] TutionLst = {Tution,1+percent1/100,1+percent2/100,1+percent3/100};
		// calculating the total cost from the TotalCost method down.
		double TotalCost = TotalCost(TutionLst);
		// print out the info. 
		System.out.printf("The total Tution $%,.2f",TotalCost);
		// calculating the monthly payment from the MonthlyPayment method down
		double monthlyPayment = MonthlyPayment(TotalCost,APR);
		// print out the info. 
		System.out.printf("\nThe montholy payment is $%,.2f",monthlyPayment);



		
	}
	// creating a new method in which we calculate the total tuition.
public static double TotalCost(double[] list){
	// define new variables
	double TotalTution = 0;
	double sum =0;
	double currentYear = 0;
	// using the for-each loop to access the info inside the list 
	for (double i: list){
		if (i==list[0]){
			//assign the the first element in the list to total tuition because it is the 
			// actual one as well as the currentYear
			TotalTution= i;
			currentYear =i;}
			else{ // here we do calculation to get the result and add it to the total
			sum = currentYear*i;
		  	currentYear=sum;
			TotalTution += sum;	
			// make the sum = 0 so we wont use it again .
			sum =0 ;
		}
	}
	// we round the answer and return it to the second decimal place.
	return (Math.round(TotalTution*100d))/100d;	
}
//creating a new method here as well to calculate the monthly payment .
public static double MonthlyPayment(double Total , double APR){
	double sum = ((Total*(APR/100))+Total)/(12*4);
	// we round the answer and return it to the second decimal place.
	return (Math.round(sum*100d))/100d;	
}
}
