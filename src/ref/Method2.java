package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("지혜", 34, 100);
        System.out.println("students1 = " + student1); //ref.Student@2f4d3709
        Student student2 =createStudent("우석", 34, 100);
        System.out.println("students1 = " + student2); //ref.Student@7291c18f

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // x001
        System.out.println("students = " + student); //ref.Student@2f4d3709 , ref.Student@7291c18f
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //참조값을 만들어서 밖에 던져준다. 메서드 밖에서도 사용할 수 있도록!  x001
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;    //x001.name = name;   /  x002.name = name;
        student.age = age;      //x001.age = age;     /  x002.age = age;
        student.grade = grade;  //x001.grade = grade; /  x002.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " +student.age + ", 성적: " + student.grade);
    }
}
