<%--
  Created by IntelliJ IDEA.
  User: xiaoren
  Date: 2023/2/27
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="getParamByRequest.do">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="提交">
</form>
<br>
<form action="getParamByArgName.do">
    <input type="text" name="username">
    <input type="text" name="pwd">
    <input type="submit" value="提交">
</form>
</body>
</html>
