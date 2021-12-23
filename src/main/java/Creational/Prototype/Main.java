package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        ArtController artController = new ArtController("testName", "testLName");
        ArtController artController2 = null;
        try {
            artController2 = artController.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (artController == artController2){
            System.out.println("true");
        }
        System.out.println(artController2.fName);
    }

}
