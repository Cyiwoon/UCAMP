<%@ page contentType="text/html;charset=euc-kr" %>
<html>
<head>
<title>Hello JavaServer Page</title>
</head>
<body BGCOLOR='white'>
�ȳ��ϼ���
<br><br>
-------------------------------------------<br>
jsp standard tag include�� ����� ����Դϴ�.<br>
<jsp:include page="incl/test3.jsp"> 
  <jsp:param name="msg" value="Welcome" />
</jsp:include>
-------------------------------------------
</body>
</html>

