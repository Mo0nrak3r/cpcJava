public class ListOfVehicles{
    public static void main(String[] args){
        Manufacture[] manufactures = new Manufacture[3];
        manufactures[0] = new Manufacture();
        manufactures[0].SetName("Toyota");
        manufactures[1] = new Manufacture();
        manufactures[1].SetName("BMW");
        manufactures[2] = new Manufacture();
        manufactures[2].SetName("Mercedes");
        String[][] models = {
            {"Corolla", "Camry", "Prius", "Yaris", "Avalon"},
            {"3 Series", "5 Series", "7 Series", "X3", "X5"},
            {"C-Class", "E-Class", "S-Class", "GLA", "GLC"}
        };
        ElectricEngine elEngine = new ElectricEngine();
        elEngine.SetSerialNr(123456);
        elEngine.SetManufacture("Bosch");
        elEngine.SetPower(90);
        elEngine.SetCurrentDraw(20);
        elEngine.SetRange(600);
        
        HybridEngine hybridEngine = new HybridEngine();
        hybridEngine.SetSerialNr(234567);
        hybridEngine.SetManufacture("Honda");
        hybridEngine.SetPower(160);
        hybridEngine.SetNumPistons(4);
        hybridEngine.SetCurrentDraw(20);
        hybridEngine.SetFuelType("petrol");
        hybridEngine.SetRange(200);

        CombustionEngine combEngine = new CombustionEngine();
        combEngine.SetSerialNr(345678);
        combEngine.SetManufacture("Audi");
        combEngine.SetPower(90);
        combEngine.SetFuelType("diesel");
        combEngine.SetNumPistons(5);
        String[] colors = {"Red", "Blue", "Green", "Black", "White", "Gray"};
        Vehicle[] vehicles = new Vehicle[9];
        for (int i = 0; i < 9; i++) {
            Manufacture make = manufactures[i%3];
            String model = models[i % manufactures.length][i % models[i % manufactures.length].length];
            int year = 2000 + (i % 21);
            double price = 20000 + (i * 300); 
            String registrationNumber = "REG" + (1000 + i);
            String color = colors[i % colors.length];
            if(i <3){
                vehicles[i] = new BEV(i,make,model,year,color,price,registrationNumber,elEngine);
            }else if (i>=3 && i<6){
                vehicles[i] = new HybridV(i, make, model, year, color, price, color, hybridEngine);
            }else if (i>=6){
                vehicles[i] = new ICEV(i, make, model, year, color, price, color, combEngine);
            }
        }
        
        for (Vehicle vehicle : vehicles){
            vehicle.ShowCharacteristics();
        }

       
    }
}