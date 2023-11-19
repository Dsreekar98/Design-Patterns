package Builder;

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

    public static Validate createStudent(){
        return new Validate();
    }

    static class Validate{
        private String name;
        private int rollNo;
        private String address;

        public Validate setName(String name) {
            this.name = name;
            return this;
        }

        public Validate setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Validate setAddress(String address) {
            this.address = address;
            return this;
        }
        public Student build() throws Exception {
            if(name==null)
            {
                throw new Exception("Name is not given");
            }
            if(address==null)
            {
                throw new Exception("address is not given");
            }

            return new Student(name,rollNo,address);
        }


    }

}
