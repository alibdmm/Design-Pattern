package Creational.AbstractFactory;

public class OracleDatabaseFactor implements IDatabaseFactory{
    @Override
    public Connection CreateConnection() {
        return new OracleConnection();
    }

    @Override
    public Command CreateCommand() {
        return new OracleCommand();
    }
}
