public class Track_Inventory_of_tems {
    
    public static void main(String[] args) {
        Item i1=new Item();
        i1.price=500;
        i1.itemName="mouse";
        i1.itemCode=023;
        i1.quantity=3;
        System.out.println("total price "+i1.totalprice());
    }

}

class Item{
    int itemCode;
    String itemName;
    int price;
    int quantity;


    int totalprice(){
        System.out.println("itemcode :"+itemCode+" itemname :"+itemName+ " item price :"+price+" qunatity :"+quantity);
        return price*quantity;
    }
}
