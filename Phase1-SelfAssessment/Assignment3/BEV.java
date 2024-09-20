public class BEV extends Vehicle{
    ElectricEngine engine;

    public BEV(int id, Manufacture make, String model, int year, String color, double price, String licenseNumber, ElectricEngine engine){
        super(id, make, model, year, color, price, licenseNumber);
        this.engine = engine;
    }

    public void SetEngine(ElectricEngine engine){
        this.engine = engine;
    }

    public ElectricEngine GetEngine(){
        return engine;
    }
    
    public void ShowCharacteristics(){
        System.out.println("ID: " + id + ", Make: " + make.GetName() + ", Model: " + model + 
                   ", Electric Range: " + engine.GetRange() + ", max current Draw: " + engine.GetCurrentDraw() +
                   ", Year: " + year + ", Color: " + color + 
                   ", Price: " + price + ", Registration Number: " + licenseNumber);
   }
}
