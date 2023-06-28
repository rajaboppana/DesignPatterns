public class Student {
    private String name;
    private String university;
    private int age;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    public static class StudentBuilder{
        private final String name;
        private final String university;
        private int age;

        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }
}
