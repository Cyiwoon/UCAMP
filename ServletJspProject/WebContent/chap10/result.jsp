<%@ page contentType = "text/html;charset=euc-kr" %>
<%@ page import = "chap10.entity.Member" %>
<html><head>
</head>
<body>
<% Member member = (Member)request.getAttribute("member"); %>
<center><br><br>�Ʒ��� ���� ȸ�� ��ϵǾ����ϴ�.<br>
<table border=1>
<tr>
    <td align=right>ID : </td>
    <td width=200>&nbsp; <%= member.getTfMemberID() %> </td>
</tr>
<tr>
    <td align=right>�̸� : </td>
    <td width=200>&nbsp; <%= member.getTfName() %> </td>
</tr>
<tr>
    <td align=right>��ȣ : </td>
    <td width=200>&nbsp; <%= member.getTfPassword() %> </td>
</tr>
<tr>
    <td align=right>�ּ� : </td>
    <td width=200>&nbsp; <%=member.getTfAddress() %> </td>
</tr>
<tr>
    <td align=right>��ȭ��ȣ : </td>
    <td width=200>&nbsp; <%= member.getTfPhone() %> </td>
</tr>
<tr>
    <td align=right>����Ȯ����Ʈ : </td>
    <td width=200>&nbsp; <%= member.getSelPasswordQuestion() %> </td>
</tr>
<tr>
    <td align=right>����Ȯ�δ� : </td>
    <td width=200>&nbsp; <%= member.getTfPasswordAnswer() %> </td>
</tr>
<tr>
    <td align=right>��ȥ���� : </td>
    <td width=200>&nbsp; <%= member.getRdMarriage() %> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <%= member.getChkHobby() %> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <%= member.getEtc() %> </td>
</tr>
</table></center>
</body>
</html>
