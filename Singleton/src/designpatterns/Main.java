package designpatterns;

class DatabaseHelper {
    private String data;
    private static DatabaseHelper databaseConnection;

    private DatabaseHelper(){
        System.out.println("Database Connection...\n");
    }

    public static DatabaseHelper getConnection() {
        if(databaseConnection == null)
            databaseConnection = new DatabaseHelper();
        return databaseConnection;
    }

    public String selectData() {
        return data;
    }

    public void insertData(String data) {
        this.data = data;
        System.out.println("new data: " + data + " entered into the database\n");
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseHelper.getConnection().insertData("123");
        System.out.println("Data from DB: " + DatabaseHelper.getConnection().selectData());
    }
}