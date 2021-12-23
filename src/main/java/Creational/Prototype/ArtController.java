package Creational.Prototype;

public class ArtController implements Prototype<ArtController>{
    String fName;
    String lName;

    public ArtController(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public ArtController clone() throws CloneNotSupportedException {
        return (ArtController) super.clone();
    }
}
