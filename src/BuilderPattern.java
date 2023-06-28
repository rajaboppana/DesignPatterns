public class BuilderPattern {
    public static void main(String[] args) {

        Student student = new Student.StudentBuilder("Raja", "No Uni").setAge(25).build();
        System.out.println(student.getName()+ " "+ student.getAge());
    }
}