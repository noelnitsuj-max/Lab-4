import java.util.Random;
/**
* This program generates a random number up to 999 and creates a bar chart with a marks each valuing 100;
* 
*
* @author Justin Leon, noelnitsuj@gmail.com
* @version v1.0
* @since 10/5/25
*/
public class BarChart{
public static void main (String[] args) {
////vars section
//int vars for first, second, third
int first, second, third;
Random r = new Random();
////generate and assign random numbers section
first = r.nextInt(999);
second = r.nextInt(999);
third = r.nextInt(999);

//Create a Random object (ie generator)
//Use generator to create a random number btw 0 and 999 and assign to first. Do the same for second and third
////Print out numbers
//Message to print out something like, Number 1 is: XXX. Do the same for Number 2 and 3
System.out.println("Number 1 is " + first);
System.out.println("Number 2 is " + second);
System.out.println("Number 3 is " + third);
//Print blank line
System.out.println("");
////Bar Chart Section
//Print out NUMBER BAR CHART as a header
System.out.println("NUMBER BAR CHART");
////first stars
//Print out "Number 1: " without a line break
System.out.print("Number 1: ");
if (first<100){
//Print out "<100 no stars"
    System.out.print("<100 no stars");
}else{
    int durationf = first/100;
    for(int x = 0; x < durationf; x ++){     
        System.out.print("*");
    }
}
//for loop that prints out stars for each 100 (ie 356 prints out 3 stars). Take advantage of integer division here (first/100)
//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
//Print line to get to a new line
System.out.println("");
////second stars
//Print out "Number 2: " without a line break
System.out.print("Number 2: ");
if (second<100){
//Print out "<100 no stars"
    System.out.print("<100 no stars");
}else{
    int durations = second/100;
    for(int x = 0; x < durations; x ++){     
        System.out.print("*");
    }
}
//if (second<100)
//Print out "<100 no stars"
//else
//for loop that prints out stars for each 100 (ie 356 prints out 3stars). Take advantage of integer division here (second/100)
//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
//Print line to get to a new line
////third stars
//Print out "Number 3: " without a line break
//if (third<100)
//Print out "<100 no stars"
//else
//for loop that prints out stars for each 100 (ie 356 prints out stars). Take advantage of integer division here (third/100)
//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
System.out.println("");
//Print line to get to a new line
System.out.print("Number 3: ");
if (third<100){
//Print out "<100 no stars"
    System.out.print("<100 no stars");
}else{
    int durationt = third/100;
    for(int x = 0; x < durationt; x ++){     
        System.out.print("*");
    }
}
}////end main ()
}////end class