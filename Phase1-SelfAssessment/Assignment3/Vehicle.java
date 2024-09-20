abstract class Vehicle {
    int id;
    Manufacture make;
    String model;
    int year;
    String color;
    double price;
    String licenseNumber;

    public Vehicle(int id, Manufacture make, String model, int year, String color, double price, String licenseNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.licenseNumber = licenseNumber;
    }

    public void SetID(int id){
        this.id = id;
    }

    public void SetMake(Manufacture make){
        this.make = make;
    }

    public void SetModel(String model){
        this.model = model;
    }

    public void SetYear(int year){
        this.year = year;
    }

    public void SetColor(String color){
        this.color = color;
    }

    public void SetPrice(double price){
        this.price = price;
    }

    public void SetLicenseNumber(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    public int GetId(){
        return id;
    }

    public Manufacture GetMake(){
        return make;
    }

    public String GetModel(){
        return model;
    }

    public int GetYear(){
        return year;
    }

    public String GetColor(){
        return color;
    }

    public double GetPrice(){
        return price;
    }

    public String GetLicencenumber(){
        return licenseNumber;
    }

    abstract void ShowCharacteristics();
}


