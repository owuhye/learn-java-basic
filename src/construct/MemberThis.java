package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //nameParameter은 자기랑 가까운 매개변수 , nameField는 매개변수에 없어서 멤버변수
        //this.nameField인데, this생략
    }
}
