package Prototype;

public class main {
    public static void main(String[] arg)
    {
        Student st1=new Student("Sreekar",23,"Address 1");
        Student st2=st1.clone();
        System.out.println(st1);
        System.out.println(st2);
    }
}
