<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>이름</th>
        <th>이메일</th>
        <th>상세정보</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty members}">
        <c:forEach var="member" items="${members}">
            <tr >
                <td>${member.name}</td>
                <td>${member.email}</td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</body>
</html>
