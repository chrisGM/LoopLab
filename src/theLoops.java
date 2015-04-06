import java.util.*;
public class theLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	//for loop using 1-100
		final int MAXVALUE = 100;
		final int STARTVALUE = 1;
		int totalSum = 0;//initialized total sum
		for (int intCount = STARTVALUE; intCount <= MAXVALUE; intCount++)
		//for loop with variable intCount declared starting at one, 
		//runs as long as intCount less than or equal to 100 continues to increment
		//until the intCount reaches 100 which is the maximum value
		{
			totalSum = totalSum + intCount;	
		}//for(intCount=STARTVALUE; intCount<=MAXVALUE; intCount++)
		
		System.out.println("The sum of the numbers from 1 to 100 is: "+totalSum);
		//Prints the sum of the values from 1 to 100
*/		
	//for loop 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);//scanner class initialized
		final int startValue = 1;//this is the starting value and also the minimum value the user can input
		final int MAXVALUE = 100;//maximum value user can input
		int totalSumN = 0;//initialized total sum as 0 
		System.out.println("For loop");
		System.out.println("This program sums integers from 1 up to a value that the user chooses");//user prompt explaining program
		System.out.print("Please enter a value between 1 and 100: ");//prompt asking user for value within set of numbers
			int maxValue = scan.nextInt();//user input maxValue
			//System.out.println("User input: "+maxValue); //Testing Point
		while (maxValue < startValue || maxValue > MAXVALUE)//compares if value entered is less than 1 or greater than 100 
		{
			System.out.print("The value "+maxValue+" is incorrect please enter a value between 1 and 100: ");//error message if value is incorrect user must enter new value
			maxValue = scan.nextInt();//new value entered saved as variable 'maxValue' again so the while loop can compare it to 1 and 100
			//System.out.println("User input: "+maxValue);//Testing Point
		}
		for (int intCountN = startValue; intCountN <= maxValue; intCountN++)
		//for loop with variable intCount declared starting at one, 
		//runs as long as intCount less than or equal to maxValue continues to increment
		//until the intCount reaches maxValue which is the maximum value the user entered
		{
			totalSumN = totalSumN + intCountN;
			//System.out.println("Sums : "+totalSumN);//Testing Point 
			//starting from one this function adds each integer to totalSumN as it continues to 
			//increment through the loop and saves it each time as totalSumN which gives us the total sum
		}//for(intCount=STARTVALUE; intCount<=MAXVALUE; intCount++)
		
		System.out.println("The sum of the numbers from 1 to "+maxValue+" is: "+totalSumN);
		//Prints the sum of the values from 1 to n
		System.out.println("Thank you for using this program.");
		
	//while loop
		
		final int maximumValue = 100;//Initialized the max value user can input
		int startingValue = 1;//this is the starting value numbers will be added from this to the value user inputs, also the minimum value a user can input
		int sumInteger = 0;//starting sum of all integers added initialized
		System.out.println("While loop:");
		System.out.println("This program sums integers from 1 up to a value that the user chooses");//user prompt explaining program
		System.out.print("Please enter a value between 1 and 100: ");//asks for user input within a set of numbers 
			int userMaxVal = scan.nextInt();//user input is saved as variable 'userMaxVal'
			//System.out.println("User input: "+userMaxVal);//Testing Point
		while (userMaxVal < startingValue || userMaxVal > maximumValue)//compares user input to the max and min values allowed
		{
			System.out.print("The value "+userMaxVal+" is incorrect please enter a value between 1 and 100: ");//error message if value is incorrect user must enter new value
			userMaxVal = scan.nextInt();//new value entered saved as variable 'startingValue' again so the while loop can compare it to 1 and 100
			//System.out.println("User input: "+userMaxVal);//Testing Point
		}//while (userMaxVal < startingValue || userMaxVal > maximumValue)
		while (startingValue <= userMaxVal)//as long as the startingValue is less than the value the user input this loop runs
		{
			sumInteger = sumInteger + startingValue;//starting from one this function adds all the integers up until the user input integer 
			startingValue++;//increments starting value after each summation 
			//System.out.println("Sums: "+sumInteger);//Testing Point 
 		}//while (startingValue <= userMaxVal)
		System.out.println("The sum of the numbers from 1 to "+userMaxVal+" is: "+sumInteger);
		//Prints the sum of the values from 1 to n
		System.out.println("Thank you for using this program.");
		
	//do while loop 
		
		final int maxValInt = 100;//Maximum value a user can input
		int startVal = 1;//starting value the program adds from this number up to the users inputed value, also the minimum value a user can input
		int sumTotal = 0;//the total sum of the integers is initialized starting at 0
		System.out.println("Do While loop:");
		System.out.println("This program sums integers from 1 up to a value that the user chooses.");//user prompt explaining program
		System.out.print("Please enter a value between 1 and 100: ");//prompt asks for user input within a set of numbers
			int usersValue = scan.nextInt();//saves users input as usersValue
			//System.out.println("User input: "+usersValue);//Testing Point
		while (usersValue > maxValInt || startVal > usersValue)//this while loop compares if user input is within parameters 1-100
		{
			System.out.print("The value "+usersValue+" is incorrect please enter a number between 1 and 100: ");
			//if user input is incorrect this message is printed asking for a new value between 1-100
				usersValue = scan.nextInt();
				//System.out.println("User input: "+usersValue);//Testing Point 
				//new value is saved again as usersValue so the while loop can compare it again to the max and min values
		}//while (usersValue > maxValInt || startVal > usersValue)
		do 
		//this do-while takes the sumTotal value and adds the starting value to it then increments the starting value and 
		//and repeats the process until the starting value reaches the users inputed value
		{
			sumTotal = sumTotal + startVal;
			startVal++;
			//System.out.println("Sums: "+sumTotal);//Testing Point 
		}//do loop
		while(startVal <= usersValue);//once the starting value reaches the users value this do while loop ends
		System.out.println("The sum of the numbers from 1 to "+usersValue+" is: "+sumTotal);
		System.out.println("Thank you for using this program.");
	}//main

}//class
