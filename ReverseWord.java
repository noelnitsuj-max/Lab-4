import java.util.Scanner;
/**
* This program checks to see if the a word can have the first character moved to the end of the word, reversed and still be the same.
* 
*
* @author Justin Leon, noelnitsuj@gmail.com
* @version v1.0
* @since 10/5/2025
*/
public class ReverseWord{ //Remove _Starter.
public static void main (String[] args){
////vars section
//String for word, remaining, combined, and flipped
String word = "";
String remaining = "";
String combined = "";
String flipped = "";
//char for firstLetter
char firstLetter;
//Create Scanner object to get input
Scanner keyboard = new Scanner(System.in);
remaining = keyboard.nextLine();
////Since we don't know how many words, best to use a while. Create
while(!remaining.equals("quit")){
////for the word quit, since we don't want "quit' to work, think ! here
word = remaining.substring(1,remaining.indexOf(" ")).toLowerCase();
firstLetter = remaining.charAt(0);
remaining = remaining.substring(remaining.indexOf(" ") + 1);
combined = word + String.valueOf(firstLetter);
//on each pass through the while loop, clear combined and flipped
//(ie combined = "";) NOTE-This is 2 "s without a space.
//get firstLetter
//get remaining, think substring here
//set combined to remaining + firstLetter
//for loop to reverse combined and set to flipped. Start withright most letter (char)
flipped = "";
for(int x = 1; x <= word.length() + 1; x ++){
    flipped += String.valueOf(combined.charAt(combined.length() - x));
}
System.out.println(flipped);
// in combined and add char to flipped, decrement for loop, and stop when no more
// chars left (when you reach 0)
// use something like this in the for loop,flipped+=combined.charAt(i);
//Test to see if flipped is same as word. HINT-Since strings, mustuse equals()
////Print out <word> works
//else
////Print out <word> does not work
if(flipped.equals(String.valueOf(firstLetter) + word)){
    System.out.println(combined + " works");
}else{
    System.out.println(combined + " does not work");
}
//get next word that while boolean will test (HINT-use same 
} ////end while
////Optional do while, print msg to process another line (ie type yes)//while to see if desired input was word to repeat, .use 
}////end main ()
}////end class
