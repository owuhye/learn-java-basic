package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : " + a); //10
        changePrimitive(a); // x = 20 , a = 10;
        System.out.println("메서드 호출 후 : " + a); //10
    }


   static void changePrimitive(int x) {
        x = 20; // x = 20 , a = 10;

    }
}
