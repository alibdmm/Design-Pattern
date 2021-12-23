package Creational.Singleton;

public class Database {
    private static  Database database;
    private static  int counter = 0;
    public  String test;

    private Database(String test){
        this.test = test;
    }

    public static  Database GetInstanceMultiple(String test){ //Sayı ile sınırlama
        if(counter < 2){
            return  new Database(test);
        }
        return  null;
    }
     public static Database GetInstaneSingle(String test){//sadece bir tane istendiginde
        if(database == null){
            database = new Database(test);
        }
        return database;
     }
}
