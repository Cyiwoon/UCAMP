<%@ page contentType = "text/html;charset=euc-kr" %>
<html><head>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<center><br><br>�Ʒ��� ���� ȸ�� ��ϵǾ����ϴ�.<br>
<table border=1>
<tr>
    <td align=right>ID : </td>
    <td width=200>&nbsp; <%= request.getParameter("tfMemberID") %> </td>
</tr>
<tr>
    <td align=right>�̸� : </td>
    <td width=200>&nbsp; <%= request.getParameter("tfName") %> </td>
</tr>
<tr>
    <td align=right>��ȣ : </td>
    <td width=200>&nbsp; <%= request.getParameter("tfPassword") %> </td>
</tr>
<tr>
    <td align=right>�ּ� : </td>
    <td width=200>&nbsp; <%=request.getParameter("tfAddress") %> </td>
</tr>
<tr>
    <td align=right>��ȭ��ȣ : </td>
    <td width=200>&nbsp; <%= request.getParameter("tfPhone") %> </td>
</tr>
<tr>
    <td align=right>����Ȯ����Ʈ : </td>
    <td width=200>&nbsp; <%= request.getParameter("selPasswordQuestion") %> </td>
</tr>
<tr>
    <td align=right>����Ȯ�δ� : </td>
    <td width=200>&nbsp; <%= request.getParameter("tfPasswordAnswer") %> </td>
</tr>
<tr>
    <td align=right>��ȥ���� : </td>
    <td width=200>&nbsp; <%= request.getParameter("rdMarriage") %> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <%= request.getParameter( "chkHobby" ) %> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <%= request.getParameter("etc") %> </td>
</tr>
</table></center>
</body>
</html>
