public class Handle_Mobile_Phone_Details {
    
    public static void main(String[] args) {
        
        Mobile m1=new Mobile(18000, "Redmi", "Note 10 pro");
    }
}

class Mobile{
    int price;
    String Brand;
    String model;

    Mobile(int price,String Brand ,String model){
        this.price=price;
        this.Brand=Brand;
        this.model=model;
        System.out.println("price of mobile is "+this.price+" Brand is "+this.Brand+" and model is "+this.model);
    }
}
