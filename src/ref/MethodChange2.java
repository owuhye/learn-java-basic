package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("dataA= " + dataA); //ref.Data@27973e9b

        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); //20
    }

    static void changeReference(Data dataX) { // dataA의 참조값(x001)이 넘어감
        System.out.println("dataX= " + dataX); //ref.Data@27973e9b , dataA의 주소값이 복사되었다.
        dataX.value = 20;
    }
}
