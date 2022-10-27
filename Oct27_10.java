import java.util.Scanner;

public class Oct27_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int number1 = scan.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = scan.nextInt();
		System.out.println("Enter number 3 ; ");
		int number3 = scan.nextInt();
		System.out.println("Enter number 4 : ");
		int number4 = scan.nextInt();
		System.out.println("Enter number 5 : ");
		int number5 = scan.nextInt();
		int sum = number1 + number2 + number3 +number4 +number5;
		System.out.println("The sum of the 5 numbers is: "+sum);
		int avg=sum/5;
		System.out.println("The average is : "+ avg);		
	}

}
