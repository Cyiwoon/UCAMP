<%@ page contentType="text/html;charset=euc-kr" %>
<html>
<head>
<title>Include Param Test</title>
</head>
<body BGCOLOR='white'>
�ȳ��ϼ���
<br><br>
-------------------------------------------<br>
jsp standard tag include�� ����� ����Դϴ�.<br>
<jsp:include page="paramTest.jsp"> 
  <jsp:param name="msg" value="Welcome" />
</jsp:include>
-------------------------------------------
</body>
</html>
