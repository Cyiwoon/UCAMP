<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>�� ����</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function deleteCustomer(id){
		var result = confirm(id +" ���� ������ �����Ͻðڽ��ϱ�?");
		if(result) {
			location.href = "deleteCustomer.do/"+id;
		}
	}
</script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">�� ���</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>���̵�</th>
					<th>�̸�</th> 
					<th>�̸���</th> 
					<th>����</th>
					<th>�����</th>
					<th>&nbsp;</th>
					<th>&nbsp;</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>
					 	<a href="getCustomer.do?id=${customer.id}">${customer.id}</a>
					 </td>
					<td>${customer.name}</td>
					<td>${customer.email}</td>
					<td>${customer.age}</td>
					<td>${customer.entryDate}</td>
					<td>
					     <a href="updateCustoemrForm.do?id=${customer.id}">����</a>
					</td>
					<td><a href="#" onclick="deleteCustomer('${customer.id}')">����</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7">
					<a href="insertCustomerForm.do">�� ���</a>
				</td>
			</tr>
		</tbody> 
	</table>
	</div>
</body>
</html>

































