package Creational.AbstractFactory;

public class CustomOperation {
    IDatabaseFactory databaseFactory;
    Command command;
    Connection connection;

    public CustomOperation(IDatabaseFactory databaseFactory){
        this.databaseFactory = databaseFactory;
        this.command = this.databaseFactory.CreateCommand();
        this.connection = this.databaseFactory.CreateConnection();
    }

    public void RemoveById(int id){
        if (this.databaseFactory != null){
            this.connection.OpenConnection();
            this.command.ExecuteCommand("Delete this id");
            this.connection.CloseConnection();
        }

    }
}
