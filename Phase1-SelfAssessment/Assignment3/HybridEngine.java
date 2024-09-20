public class HybridEngine extends Engine {
    int range;
    int currentDraw;
    String fuelType;
    int numPistons;

    public void SetRange(int range){
        this.range = range;
    }

    public void SetCurrentDraw(int currentDraw){
        this.currentDraw = currentDraw;
    }

    public void SetFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void SetNumPistons(int numPistons){
        this.numPistons = numPistons;
    }

    public int GetRange(){
        return range;
    }

    public int GetCurrentDraw(){
        return currentDraw;
    }

    public String GetFuelType(){
        return fuelType;
    }

    public int GetNumPistons(){
        return numPistons;
    }
}
