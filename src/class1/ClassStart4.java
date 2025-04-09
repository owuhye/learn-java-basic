package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 100;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 70;

        Student[] students = new Student[2]; // x005
        students[0] = student1;     //배열 students[0]에 student1의 값 복사 ( students[0] = x001 )
        students[1] = student2;     //배열 students[0]에 student2의 값 복사 ( students[1] = x002 )

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
