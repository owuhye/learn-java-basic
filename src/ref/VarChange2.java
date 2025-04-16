package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //★ 참조값 복사!! ★ (값복사X)

        System.out.println("dataA 참조값 = " + dataA); //ref.Data@2f4d3709
        System.out.println("dataA 참조값 = " + dataB); //ref.Data@2f4d3709
        System.out.println("dataA 참조값 = " + dataA.value); //10
        System.out.println("dataA 참조값 = " + dataB.value); //10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA 참조값 = " + dataA.value); //20    -> ex) x001.value  둘다 같은 주소값으로 같은 값을 가리키고 있다.
        System.out.println("dataA 참조값 = " + dataB.value); //20    -> ex) x001.value  둘다 같은 주소값으로 같은 값을 가리키고 있다.

        //dataB 변경
        dataA.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA 참조값 = " + dataA.value); //30    -> ex) x001.value  둘다 같은 주소값으로 같은 값을 가리키고 있다.
        System.out.println("dataA 참조값 = " + dataB.value); //30    -> ex) x001.value  둘다 같은 주소값으로 같은 값을 가리키고 있다.
    }
}
