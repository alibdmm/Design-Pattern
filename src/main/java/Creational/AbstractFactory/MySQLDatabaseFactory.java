package Creational.AbstractFactory;

public class MySQLDatabaseFactory implements IDatabaseFactory{
    @Override
    public Connection CreateConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command CreateCommand() {
        return new MySQLCommand();
    }
}
