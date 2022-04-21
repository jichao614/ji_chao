<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022-04-15
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/fileUpoad/singleFileUpload" enctype="multipart/form-data" method="post">
        文件名：<input type="text" name="fileName"><br>
        上传文件：<input type="file" name="filePic"><br>
        <input type="submit" value="单文件上传">
    </form>

</body>