package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.GetInstanceMultiple("test1");
        Database databaseSec = Database.GetInstanceMultiple("test2");

        System.out.println(database.test);
        System.out.println(databaseSec.test);
    }
}
/*
* bu tasarım kalıbının amacı aynı classta birden fazla nesne oluşturamyı engellemek veya belirli sayıda nesne oluşturmaya olanak tanımaktır
* */