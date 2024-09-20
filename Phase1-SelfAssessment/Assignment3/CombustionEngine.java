public class CombustionEngine extends Engine{
    int numPistons;
    String fuelType;

    public void SetFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void SetNumPistons(int numPistons){
        this.numPistons = numPistons;
    }

    public String GetFuelType(){
        return fuelType;
    }

    public int GetNumPistons(){
        return numPistons;
    }

}
