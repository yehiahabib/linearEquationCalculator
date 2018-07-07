import java.util.Scanner;

public class LinearEquationCalculator {
  
  public static void main(String[] args) {
    // trying to get the values from the user
    Scanner input = new Scanner(System.in);
    
	System.out.print("Enter the coordinates for two points:");
    
	// coordinate variables
    int xaxis1 = input.nextInt();
    int yaxis1 = input.nextInt();
    int xaxis2 = input.nextInt();
    int yaxis2 = input.nextInt();
    input.close(); // closes the user input
    
	// checking whether the points given are the same
    if (xaxis1 == xaxis2 && yaxis1 == yaxis2) {
      System.out.println("The points given are the same."); //printing an error if the points given are the same
      return;
    } 
	else {
      // printing the coordinates
      System.out.print("The line equation for two points (" + xaxis1 + "," + yaxis1 + ") and ("
          + xaxis2 + "," + yaxis2 + ")");
      
	  // check whether the line is in form y=ax+b or x=b
      if (xaxis1 == xaxis2) {
        System.out.println("is x=" + xaxis1); // prints the equation in
        // x=b form
      } 
	  else {
        // slope calculation
        double slope = (yaxis2 - yaxis1) / (xaxis2 - xaxis1);
        
		// finding b in y=ax+b
        double b = yaxis2 - (slope * xaxis2);
        
		// assigning b the correct sign
        String printb = "";
        
		if (b > 0) {
          printb = "+" + Double.toString(b);
        } 
		else if (b < 0) {
          printb = Double.toString(b);
        }
        
		// removing slope if it's 1
        String printslope = "";
        if (slope == 1) {
          // to prevent from printing 1.0x instead of just x
          printslope = "x";
        } else if (slope == -1) {
          // to prevent from printing -1.0x instead of just -x
          printslope = "-x";
        } else if (slope == 0) {
          // this is for straight lines , such as y=1
          printslope = "";
        } else {
          // printing the slope
          printslope = Double.toString(slope) + "x";
        }
        // printing out the formula
        System.out.print("\b is y=" + printslope + printb);
      }
    }
  }
}
