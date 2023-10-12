<%@ page contentType ="text/html;charset=euc-kr" %>
<%@ page import="chap11.entity.Member, chap11.biz.MemberService" %>

<%-- 1. ����ڷκ��� ���� request�� ó���Ѵ�.--%>
<% request.setCharacterEncoding( "euc-kr" ); %>
<jsp:useBean id="member" class="chap11.entity.Member" scope="request" />
<jsp:setProperty name="member" property="*" />

<%-- 2. biz logic �����Ѵ�. --%>
<%
	chap11.biz.MemberService service = new MemberService();

    boolean result = service.register(member);
%>
    
    <%-- 3. view �����Ѵ�.(����������, ����������)--%>  
      
<%    
    if ( result ){
%>
<jsp:forward page="/chap11/result.jsp" />
<%
    }else {
%>       
<jsp:forward page="/chap11/error.html" />
<%
    }
%>
