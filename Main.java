public class Main {
// creating Method in Main
public void carName(){
    System.out.println("Car Name is: Audi");
}
public void carPrice(int price){
    System.out.println("Car Price is: " + price);;
}
    
    public static void main(String[] args){

        Main carObj = new Main();
        carObj.carName();
        carObj.carPrice(50000);

   }
}
