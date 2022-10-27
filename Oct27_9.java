import java.util.Scanner;

public class Oct27_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int number_Of_DaysInMonth;
String MonthOfName;
System.out.println("Input a month number: ");
int month = scan.nextInt();
System.out.println("Enter a year");
int year = scan.nextInt();

switch(month) {
case 1:
	MonthOfName = "January";
	number_Of_DaysInMonth = 31;
	System.out.println("January "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 2:
	MonthOfName = "February";
	number_Of_DaysInMonth = 28;
	if (year%4==0 && year%100!=0||year%400==0) {
		System.out.println("February "  +  year + " has " + 29 + " days ");}
	else
	{
		System.out.println("February "+ year +" has "+ number_Of_DaysInMonth+ " days");}
	break;
case 3:
	MonthOfName = "March";
	number_Of_DaysInMonth = 31;
	System.out.println("March "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 4:
	MonthOfName = "April";
	number_Of_DaysInMonth = 30;
	System.out.println("April "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;	
case 5:
	MonthOfName = "May";
	number_Of_DaysInMonth = 31;
	System.out.println("May "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 6:
	MonthOfName = "June";
	number_Of_DaysInMonth = 30;
	System.out.println("June "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 7:
	MonthOfName = "July";
	number_Of_DaysInMonth = 31;
	System.out.println("July "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 8:
	MonthOfName = "August";
	number_Of_DaysInMonth = 31;
	System.out.println("August "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 9:
	MonthOfName = "September";
	number_Of_DaysInMonth = 30;
	System.out.println("September "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 10:
	MonthOfName = "October";
	number_Of_DaysInMonth = 31;
	System.out.println("October "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 11:
	MonthOfName = "November";
	number_Of_DaysInMonth = 30;
	System.out.println("November "+ year + " has " + number_Of_DaysInMonth+ " days ");
	break;
case 12:
	MonthOfName = "December";
	number_Of_DaysInMonth = 31;
	System.out.println("December "+ year + " has " + number_Of_DaysInMonth + " days ");
	break;
	
	}
}

}
