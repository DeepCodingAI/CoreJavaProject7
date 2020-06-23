package superkeyword;

public class Lexus extends Toyota{

    public String partsModel;
    public Lexus(){
        super("Hybrid", 2020);
    }

    public void engine(){
        super.engine();
        System.out.println("Semi-Hybrid");
    }

    public void autoBodyModel(){
        String partsModel = super.parts;
        System.out.println(partsModel);
    }
}
