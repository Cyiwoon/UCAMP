package chap09;

public class MemberService
{
    public boolean register( Member member )
    {
        // ȸ����� �۾��� ������.
        System.out.println("ȸ������۾��� ������");
        System.out.println("ID: " + member.getTfMemberID());
        return true;
    }
}
