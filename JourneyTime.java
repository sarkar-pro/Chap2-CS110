
import java.util.Scanner;

class JourneyDetails {

    Scanner in = new Scanner(System.in);
    private double lengthOfJourney;
    private double avgSpeed;
    private double JourneyTime;
    private double JourneyTimeADay;
    private double journeyDay;

    public JourneyDetails() {
        askQuestion();
    }

    public void askQuestion() {
        System.out.println("What is the length of a journey in kilometres?");
        lengthOfJourney = in.nextDouble();
        System.out.println("the average speed you can travel in KPH?");
        avgSpeed = in.nextDouble();
        System.out.println("How many hours do you want to drive each day?");
        JourneyTimeADay = in.nextDouble();
    }

    public double getJourneyTime() {
        JourneyTime = lengthOfJourney / avgSpeed;

        return JourneyTime;
        
    }

    public void getJourneyDay() {
        
        if (JourneyTime > JourneyTimeADay) {
           journeyDay = (getJourneyTime() / JourneyTimeADay);
            System.out.println("JourneyTime: " + journeyDay + " Days");
        } else {
            System.out.println("JourneyTime: " + JourneyTime + " Hours");
        }
    }
}

public class JourneyTime {

    public static void main(String[] args) {
        JourneyDetails time = new JourneyDetails();
        time.getJourneyDay();
        System.out.println(time.getJourneyTime());
    }

}
