import java.util.Scanner;
/**
* This program uses a do-while loop to convert a given temperature from celcius to fahrenheit and vice versa.
*
*
* @author Justin Leon, noelnistuj@gmail.com
* @version v1.0
* @since 10,4,2025
*/
public class Temperature{ //Remove _Starter.
public static void main (String[] args){
////vars section
//create vars for inputTemp, output (num with decimal), and char inputUnit
int inputTemp;
double output;
String inputUnit;
String yes;
//create Scanner object to read in keyboard
Scanner keyboard = new Scanner(System.in);
do{ ////create working program and then put in do-while
//Enter msg to user something like, Enter a whole number, a space,
System.out.println("Enter a whole number");
// and C or F (ie 100 F converts to Cels");
//get inputTemp
inputTemp = keyboard.nextInt();
keyboard.nextLine(); 
//get inputUnit, recommend forcing toUpperCase or toLowerCase
System.out.println("enter the units");
inputUnit = keyboard.nextLine().toUpperCase();
// before getting char. This will make the while pit easier :-)
////while loop pit. You want a 'C' OR 'F', if a user enters this
////you want to keep them out. So how do you do the opposite?
////How about using !
////If a user is in the while pit, tell them want you want to get
////them out by entering 'C' OR 'F'. Grab the char, just like above
////before the while pit.
//if inputUnit is 'F' ////remember a primitive type therefore use ==
////compute output (F->C). Assuming you collected an int from the user, you will need
////to cast part of the equation as a double or using a double in the equation (ie 5.0).
////then nicely format (think printf here) the output to one decimal place.
////%d is for int, %c is for char, %f along with precision for double
// else
// compute output (C->F). You know at this point the only other possible char is 'C'
////You will need to cast part of the equation as a double or use a double (ie 5.0).
////then nicely format (think printf here) the output to one decimal place.
////%d is for int, %c is for char, %f along with precision for double
//Now you can will need to collect input for the do-while part
//Message to user to enter yes to calculate another temp.
if(inputUnit.equals("C")){
     output = (double)inputTemp * (9.0/5.0) + 32;
     System.out.printf(inputTemp + "c is %.1f%n",output);
}else{
     output = ((double)inputTemp - 32)*(5.0/9.0);
     System.out.printf(inputTemp + "f is %.1f%n",output);

     
     
     
     
     
     
     
     ;
}

System.out.println("Do you want to calculate another temp?");
yes = keyboard.nextLine().toUpperCase();

}while(yes.equals("YES"));// can either use the String collected with equalsIgnoreCase("yes") orforce
// toUpperCase/toLowerCase and then grab charAt(0) and have the whileevaluate to == 'Y' (or 'y')

}//// end main ()
}//// end class
