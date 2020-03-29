<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/28 0028
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/account_save.action">
    name:<input type="text" name="name">
    money:<input type="text" name="money">
    <input type="submit" value="submit">
  </form>
  </body>
</html>
