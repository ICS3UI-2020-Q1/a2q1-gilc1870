import java.util.Scanner;


/** This will determine if the number you input is even or odd
 *
 * @author Cesar Gil
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

  
  System.out.println("Please input a Number to determind if it's even or odd:");
Scanner input = new Scanner(System.in);
int integer = input.nextInt();

if (integer % 2 == 0){
System.out.println("This integer is even");

} else if (integer % 2 == 1){
  System.out.println("This integer is odd");
}



  }
}
