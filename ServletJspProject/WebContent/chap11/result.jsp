<%@ page contentType = "text/html;charset=euc-kr" %>
<%@ page import = "chap11.entity.Member" %>
<html><head>
</head>
<body>
<jsp:useBean id="member" class="chap11.entity.Member" scope="request" />
<center><br><br>�Ʒ��� ���� ȸ�� ��ϵǾ����ϴ�.<br>
<table border=1>
<tr>
    <td align=right>ID : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfMemberID" /> </td>
</tr>
<tr>
    <td align=right>�̸� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfName" /></td>
</tr>
<tr>
    <td align=right>��ȣ : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfPassword" /> </td>
</tr>
<tr>
    <td align=right>�ּ� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfAddress" /> </td>
</tr>
<tr>
    <td align=right>��ȭ��ȣ : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfPhone" /></td>
</tr>
<tr>
    <td align=right>����Ȯ����Ʈ : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="selPasswordQuestion" /> </td>
</tr>
<tr>
    <td align=right>����Ȯ�δ� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="tfPasswordAnswer" /> </td>
</tr>
<tr>
    <td align=right>��ȥ���� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="rdMarriage" /> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="chkHobby" /> </td>
</tr>
<tr>
    <td align=right>��� : </td>
    <td width=200>&nbsp; <jsp:getProperty name="member" property="etc" /> </td>
</tr>
</table></center>
</body>
</html>
