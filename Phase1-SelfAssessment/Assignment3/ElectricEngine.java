public class ElectricEngine extends Engine{
    int range;
    int currentDraw;

    public void SetRange(int range){
        this.range = range;
    }

    public void SetCurrentDraw(int currentDraw){
        this.currentDraw = currentDraw;
    }

    public int GetRange(){
        return range;
    }

    public int GetCurrentDraw(){
        return currentDraw;
    }

}
