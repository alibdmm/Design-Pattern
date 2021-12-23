package Creational.AbstractFactory;

public class OracleCommand extends Command{
    @Override
    public void ExecuteCommand(String query) {
        System.out.println("oracle quer çalıştırma");
    }
}
