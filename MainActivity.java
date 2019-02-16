import java.io.*;
import java.util.*;


public class MainActivity{
  public int rows;
  public int cols;
  public int numVehicles;
  public int perRideBonus;
  public int numSteps;


  // Constructor to capture the values of the first line
  public MainActivity(int rows, int cols, int numVehicles, int perRideBonus, int numSteps){
    this.rows = rows;
    this.cols = cols;
    this.numVehicles = numVehicles;
    this.perRideBonus = perRideBonus;
    this.numSteps = numSteps;

  }

  public static void main(String[] args){
    // This is where we need to read the text file
    int numRides;
    File file = new File("/home/mansa/Documents/Google_Hash_Code/Self_Driving_Rides/a_example.in");
    try{

      Scanner sc = new Scanner(file);
      // The following code reads the first line of the input file
      // and converts it to an integer array at the end.

      String inputFormat = sc.nextLine();
      String[] fLine = inputFormat.split(" ");
      int[] integers = new int[fLine.length];
      for (int i = 0; i < integers.length; i++){
        integers[i] = Integer.parseInt(fLine[i]);
      }
      numRides = integers[3];
      // The following code reads the remaining lines in the file
      // and then converts each line to an integer array that represents the
      // parameters of the ride i.e. row of start intersection, column of start intersection
      // and so on.
      for (int k = 0; k < numRides; k++){
        String ride =sc.nextLine();
        String[] sRide = ride.split(" ");
        int[] rideParameters = new int[sRide.length];
        for (int i = 0; i < rideParameters.length; i++){
          rideParameters[i] = Integer.parseInt(sRide[i]);
        }
      }
      System.out.println(numRides);
      System.out.println(inputFormat);

    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File does not exist");
    }

  }

}
