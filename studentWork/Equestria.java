package studentWork;
public class Equestria {

    public static void main(String[] args) {
        double answer = roadTrip(7.7);
        System.out.println (answer);
        double distance1 = distance (29,16,34,8); 
        System.out.println (distance1); //diameter is ~20           Baltimare (29, 16) to Manehattan (34, 8) Los Pegasus (6, 19)
        double distance2 = distance (6,19,22,7); 
        System.out.println (distance2);
        double distance3 = distance (25,24,16,14);
        System.out.println (distance3);
        System.out.println ();
        System.out.println ("__________________________________________________________________");
        System.out.println ();
        double distanceStop1 = distance (29,16,34,8);
        System.out.println ("Distance from Baltimare to Manehatten is "+distanceStop1);
        System.out.println (); 
        double distanceStop2 = distance (6,19,22,7);
        System.out.println ("Distance from Los Pegasus to Neighagra Falls is "+distanceStop2);
        System.out.println (); 
        double distanceStop3 = distance (25,24,16,14);
        System.out.println ("Distance from the Badlands to Ponyville is "+distanceStop3);
        System.out.println (); 
        double totalTripDistance = totalTrip(29,16,34,8,6,19,22,7);      //x1,y1,x2,y2,x3,y3,x4,y4
        System.out.println ("The total distance of the trip is "+totalTripDistance);
        System.out.println (); 
        System.out.println ("__________________________________________________________________");


        
    }

    public static double roadTrip(double diameter) {
        return diameter * Math.PI;
    }
    public static double distance (int x1, int y1, int x2, int y2) {
        return (Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
    }

    public static double totalTrip (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double distanceTotal1 = distance(x1,y1,x2,y2);
        double distanceTotal2 = distance(x2,y2,x3,y3);
        double distanceTotal3 = distance(x3,y3,x4,y4);
        double distanceTotal4 = distance(x4,y4,x1,y1);
        return distanceTotal1+distanceTotal2+distanceTotal3+distanceTotal4;

    }   
        //(Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));

}