import java.util.Scanner;

public class Sequencing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentData;
      int previousData;
   
      previousData = scnr.nextInt();
      currentData = scnr.nextInt();
      System.out.println("Sequence starts at " + previousData + ".");
      while(currentData == 6 * previousData){
         System.out.println(currentData + " is 6 times " + previousData + ". Sequence is increasing geometrically." );
         previousData = currentData;
         int read = scnr.nextInt();
         currentData = read;
}
System.out.println(currentData +" breaks the sequence.");
   }
}
