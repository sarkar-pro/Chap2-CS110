
import java.util.Scanner;

public class GetPoolDetails {

    private int width;
    private int length;
    private int depth;
    private int volume;
    private int excCost;
    private int lineTileCost;

    private final int EXC_COST_PER_CUBIC_METRE = 20;
    private final int LINE_TILE_COST_PER_SQR_METRE = 25;
    private final int MACHINERY_COST = 1000;
    Scanner in = new Scanner(System.in);

    public void setWidth() {
        System.out.println("What is the width?");
        width = in.nextInt();
        
    }

    public void setLength() {
        System.out.println("What is the length?");
        length = in.nextInt();
        
    }

    public void setDepth() {
        System.out.println("What is the depth?");
        depth = in.nextInt();
        
    }

    public void getVolume() {
        volume = length * depth * width;   
    }

    public void setGetCost() {
        excCost = volume * EXC_COST_PER_CUBIC_METRE;
        
    }

    public void tilingCosts() {
        //Calculate the lining/tiling costs - Block 3
        int baseArea = width * length;
        int endArea = width * depth * 2; //Two ends
        int sideArea = length * depth * 2;
        lineTileCost = (baseArea + endArea + sideArea)
                * LINE_TILE_COST_PER_SQR_METRE;
        System.out.println(lineTileCost);
        
    }

    public void totalCost() {
        //Calculate the total cost - Block 4
       
        System.out.println("Estimated Cost: "
                + (excCost
                + lineTileCost + MACHINERY_COST));
    }
}
