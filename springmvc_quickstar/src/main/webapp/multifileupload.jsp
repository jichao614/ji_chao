<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022-04-15
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileUpoad/multiFileUpload" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="fileName"> <br>
    文件1：<input type="file" name="filePic"> <br>
    文件2：<input type="file" name="filePic"> <br>
    <input type="submit" value="多文件上传">
</form>
</body>
</html>
