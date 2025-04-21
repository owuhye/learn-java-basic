package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;  //  -> null.value = 10 라는 의미 이다. NullPointerException예외 발생
        System.out.println("data = " + data.value); // 로직 수행X
    }
}
