package Prototype;

public class Student {
    private String name;
    private int rollNo;
    private String address;

    private int age;
    private int classId;
    private String emailId;

    public Student(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public Student clone(){
        Student st2=new Student();
        st2.name=this.name;
        st2.address=this.address;
        st2.rollNo=this.rollNo;
        st2.age=this.age;
        st2.emailId=this.emailId;
        st2.classId=this.classId;
        return st2;
    }

}
