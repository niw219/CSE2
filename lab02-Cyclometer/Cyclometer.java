//Nicole Weber
//September 3, 2015
//CSE 002



//define a class
public class Cyclometer{
    //add a main method
    public static void main(String[] args) {
        
        int secsTrip1=480; //duration in seconds of first trip
        int secsTrip2=3220; //duration in seconds of second trip
        int countsTrip1=1561; //number of front wheel rotations during first trip
        int countsTrip2=9037; //number of front wheel rotations during second trip
        double wheelDiameter=27.0; //diameter of wheel on bicycle
        double pi=3.14159f; //value of pi
        double feetPerMile=5280; //number of feet in a mile
        double inchesPerFoot=12; //number of inches in a foot
        double secondsPerMinute=60; //number of seconds in a minute
        double distanceTrip1; //declaring the variable for the first trip's distance
        double distanceTrip2; //declaring the variable for the second trip's distance
        double totalDistance; //declaring the variable for the combined distance of both trips
        
        
        System.out.println("Trip 1 took " + secsTrip1/secondsPerMinute + " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + secsTrip2/secondsPerMinute + " minutes and had " + countsTrip2 + " counts.");
        
        //distance of first trip in inches
        distanceTrip1 = pi*wheelDiameter*countsTrip1/(inchesPerFoot*feetPerMile);
        //for each count, the bike travels a distance of the diameter of the wheel times pi
        //to convert to miles, divide this value by the amount of inches per foot and the amount of feet per mile
        
        //distance of second trip in inches
        distanceTrip2 = pi*wheelDiameter*countsTrip2/(inchesPerFoot*feetPerMile);
        //for each count, the bike travels a distance of the diameter of the wheel times pi
        //to convert to miles, divide this value by the amount of inches per foot and the amount of feet per mile
        
        totalDistance=distanceTrip1+distanceTrip2; //total distance of both trips in miles
        
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was " + totalDistance + " miles.");
        
    }
    //end of main method
}
//end of public class