public class Engine {
    int power;
    String manufacture;
    int serialNr;

    public void SetPower(int power){
        this.power = power;
    }

    public void SetManufacture(String manufacture){
        this.manufacture = manufacture;
    }

    public void SetSerialNr(int serialNr){
        this.serialNr = serialNr;
    }

    public int GetPower(){
        return power;
    }

    public String GetManufacture(){
        return manufacture;
    }

    public int GetSerialNr(){
        return serialNr;
    }
}   
