
public class PoolCost {
    public static void main(String[] args){
        GetPoolDetails poolExp = new GetPoolDetails();
        poolExp.setLength();
        poolExp.setWidth();
        poolExp.setDepth();
        
        poolExp.totalCost();
        poolExp.tilingCosts();
    }
}
