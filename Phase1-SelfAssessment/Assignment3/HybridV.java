public class HybridV extends Vehicle {
    HybridEngine engine;


    public HybridV(int id, Manufacture make, String model, int year, String color, double price, String licenseNumber, HybridEngine engine){
        super(id, make, model, year, color, price, licenseNumber);
        this.engine = engine;
    }
    
    public void SetEngine(HybridEngine engine){
        this.engine = engine;
    }

    public HybridEngine GetEngine(){
        return engine;
    }

    public void ShowCharacteristics(){
        System.out.println("ID: " + id + ", Make: " + make.GetName() + ", Model: " + model + 
                   ", Fuel Type: " + engine.GetFuelType() + ", Cylinders: " + engine.GetNumPistons() +
                   ", Electric Range: " + engine.GetRange() + ", max current Draw: " + engine.GetCurrentDraw() +
                   ", Year: " + year + ", Color: " + color + 
                   ", Price: " + price + ", Registration Number: " + licenseNumber);
   }
}
