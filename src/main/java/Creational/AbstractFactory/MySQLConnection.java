package Creational.AbstractFactory;

public class MySQLConnection extends  Connection{
    @Override
    public boolean OpenConnection() {
        System.out.println("Msql opened th connection");
        return true;
    }

    @Override
    public boolean CloseConnection() {
        System.out.println("mysq closed conneciton");
        return true;
    }
}
