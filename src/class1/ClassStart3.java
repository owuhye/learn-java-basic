package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;    // 학생을 담아둘 수 있는 변수 선언
        student1 = new Student(); // x001  //Student메모리가 생성된다.
        student1.name = "학생1";  // '.'를  통해 접근 가능하다.
        student1.age = 15;
        student1.grade = 100;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 70;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
