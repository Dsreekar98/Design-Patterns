package Singleton;

public class main {
    public static void main(String[] arg)
    {
        DbObject obj1=DbObject.createDbObject("connection1");
        System.out.println(obj1.getConnection());

        DbObject obj2=DbObject.createDbObject("connection2");
        System.out.println(obj2.getConnection());
        if(obj1==obj2)
        {
            System.out.println("Both the objects are same");
        }
    }

}
