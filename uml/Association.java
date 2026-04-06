package uml;

class Teacher{
    private String name;

    public Teacher(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public void teach(Student student){
        System.out.println(student.getName());
    }
}
class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Association{
    public static void main(String[] args) {
        Teacher mohit = new Teacher("mohit");
        Student naved = new Student("naved");
        // Association between teacher and student
        mohit.teach(naved);
    }
}
