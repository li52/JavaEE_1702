<%--
  Created by IntelliJ IDEA.
  User: mingfei
  Date: 6/7/17
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>主页</h1>
<p><%=session.getAttribute("nick")%></p>
<a href="second.jsp">第二页</a>
<%
    pageContext.setAttribute("key", "value");
    application.setAttribute("app-key", "app-value");

%>
<%=pageContext.getAttribute("key")%>
<%=application.getAttribute("app-key")%>
</body>
</html>
