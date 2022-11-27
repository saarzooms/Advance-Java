package testpackage;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setRollNo(14);
        student.setName("Arzoo");
        student.setBranch("Computer");

        System.out.println(
                student.getId()+" "+
                student.getRollNo()+" "+
                student.getName()+" "+
                student.getBranch()
        );
        student.toString();
    }
}
