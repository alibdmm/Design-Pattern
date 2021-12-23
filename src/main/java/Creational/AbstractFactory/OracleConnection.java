package Creational.AbstractFactory;

public class OracleConnection extends Connection{
    @Override
    public boolean OpenConnection() {
        System.out.println("oracle opened conneciton");
        return true;
    }

    @Override
    public boolean CloseConnection() {
        System.out.println("oracle closed connection");
        return  true;
    }
}
