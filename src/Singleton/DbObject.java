package Singleton;

public class DbObject {

    private static volatile DbObject dbObject;
    private String connection;
    private DbObject(String connectionString){
        this.connection=connectionString;
    }

    public String getConnection() {
        return connection;
    }

    public static DbObject createDbObject(String connection)
    {
        if(DbObject.dbObject==null)
        {
            synchronized (DbObject.class)
            {
                if(DbObject.dbObject==null)
                {
                    dbObject= new DbObject(connection);
                }
            }
        }
        return DbObject.dbObject;
    }

}
