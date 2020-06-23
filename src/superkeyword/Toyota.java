package superkeyword;

public class Toyota {

    public String model;
    public int year;
    public String parts = "corolla";

    public Toyota(){
        System.out.println("basic setup");
    }
    public Toyota(String model,int year){
        this.model = model;
        this.year = year;
        System.out.println(model + " "+year);
    }

    public void engine(){
        System.out.println("engine runs on gasoline");
    }
}
