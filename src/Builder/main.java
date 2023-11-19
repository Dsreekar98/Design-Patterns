package Builder;

public class main {
    public static void main(String[] arg)
    {
        try {
            Student st1 = Student.createStudent().setName("Sreekar").setAddress("Mapskp Royale Ville").setRollNo(23).build();
            System.out.println(st1);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
