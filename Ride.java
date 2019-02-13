public class Ride extends Rides{
  // these are the parameters that the class will take in
  private final int startRow;
  private final int startCol;
  private final int finishRow;
  private final int finishCol;
  private final int earliestStart;
  private final int latestFinish;
  private int distance;

// Constructor to capture the values of each ride
  public Ride(int startRow, int startCol, int finishRow, int finishCol, int earliestStart, int latestFinish) {
    this.startRow = startRow;
    this.startCol = startCol;
    this.finishRow = finishRow;
    this.finishCol = finishCol;
    this.earliestStart = earliestStart;
    this.latestFinish = latestFinish
  }

  // function to calculate the distance of a trip
  public void setDistance(){
    int total = (startRow - finishRow) + (startCol - finishCol);
    this.distance() = total;
  }

  // accessor method to retrieve the distance 
  public int getDistance{
    return distance;
  }

}
