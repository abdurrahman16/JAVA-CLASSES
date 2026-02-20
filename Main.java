public class Main {
int ModelYear;
String ModelName;

public Main (String ModelName){
    this(2020, ModelName);

}
public Main (int ModelYear, String ModelName){
    this.ModelYear = ModelYear;
    this.ModelName = ModelName; }

public void CarInfo(){
    System.out.println(ModelName+" And "+ ModelYear);
    
}

public static void main(String[] args) {
    Main car1= new Main("BMW");
        car1.CarInfo();
        Main car2 = new Main(2020, "Mercedes");
        car2.CarInfo();
  
}
}
