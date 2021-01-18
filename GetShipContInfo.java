
import java.util.Scanner;

public class GetShipContInfo {
    Scanner in = new Scanner(System.in);
    private double width;
    private double length;
    private double hight;
    //private int numOfboxes;
   // private double volume;
    private double container;
    //private int IntValue;
    
    
    public GetShipContInfo(){
        getNeededInfo();
    }
    
    public void getNeededInfo(){
        System.out.println("What is the length of the container?");
        length = in.nextDouble();
        System.out.println("What is the width of the container?");
        width = in.nextDouble();
        System.out.println("What is the depth of the container?");
        hight = in.nextDouble();
       /* System.out.println("How many boxes do you have?");
        numOfboxes = in.nextInt(); */
    }
    
    public double setVolume(){
        double volume = length * width * hight;
        return volume;
    }
    
    public int numOfcontainer(){
        container = setVolume() / 67 ;
        
        int intValue = (int)container;
        
        if (intValue <= 1){
            intValue = 1;
        } else {
            intValue = intValue;
        }
        return intValue;
    }
}
