import java.util.Scanner;
/**
* This program takes in the number of stars for the desired width of the diamond and then creates the diamond with a loop.
* 
*
* @author Justin Leon, noelnitsuj@gmail.com
* @version v1.0
* @since 10/5/2025
*/
public class Stars{ //Remove _Starter.
public static void main (String args[]){
////vars section
//int for width (largest width of stars), line, spaces, and stars
int width, lines, stars;
//Scanner to get user input, something like "Enter max width for stars"
Scanner keyboard = new Scanner(System.in);
//test to see if width is even (width%2==0). If true increment width by 1.
////top half section
    System.out.print("Enter width");
    width = keyboard.nextInt();
if(width%2==0){
    width ++;
}
int topHalf = (width + 1) / 2;
for (int x = 1; x <= topHalf; x ++){ ////how many lines should be
for (int i = 1; i <= topHalf - x; i++) {
    System.out.print(" ");
}
for (int w = 1; w <= x; w++) {
    System.out.print("*");
    if (w < x) {
            System.out.print(" ");
    }
}
System.out.println("");
}
////bottom half
int bottomHalf = (width + 1) / 2; // Half of the diamond

for (int x = bottomHalf - 1; x >= 1; x--) { // From second-to-last line down to 1

   
for (int i = 1; i <= bottomHalf - x; i++) {
    System.out.print(" ");
}

for (int w = 1; w <= x; w++) {
    System.out.print("*");
    if (w < x) {
        System.out.print(" ");
    }
}
System.out.println(""); //this gets to next line
}
} ////end main()
} ////end class
