package Creational.AbstractFactory;

public class MySQLCommand extends Command {
    @Override
    public void ExecuteCommand(String query) {
        //sorguyu çalıştırma işlemelri
        System.out.println("mysql query çalıştırma");
    }
}
