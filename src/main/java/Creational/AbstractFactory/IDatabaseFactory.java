package Creational.AbstractFactory;

public interface IDatabaseFactory {
    Connection CreateConnection();
    Command CreateCommand();
}
