public class ICEV extends Vehicle{
    CombustionEngine engine;

    public ICEV(int id, Manufacture make, String model, int year, String color, double price, String licenseNumber, CombustionEngine engine){
        super(id, make, model, year, color, price, licenseNumber);
        this.engine = engine;
    }

    public void SetEngine(CombustionEngine engine){
        this.engine = engine;
    }

    public CombustionEngine GetEngine(){
        return engine;
    }

    public void ShowCharacteristics(){
         System.out.println("ID: " + id + ", Make: " + make.GetName() + ", Model: " + model + 
                    ", Fuel Type: " + engine.GetFuelType() + ", Cylinders: " + engine.GetNumPistons() +
                    ", Year: " + year + ", Color: " + color + 
                    ", Price: " + price + ", Registration Number: " + licenseNumber);
    }
}
