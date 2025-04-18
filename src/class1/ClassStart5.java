package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 100;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 70;

        //  배열 선언 최적화
        Student[] students = new Student[]{student1, student2}; // x005
//        Student[] students = {student1, student2}; // x005  , 이것도 가능

        // for문 최적화
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 성적: " + students[i].grade);
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        System.out.println();

        //향상된 for문
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
