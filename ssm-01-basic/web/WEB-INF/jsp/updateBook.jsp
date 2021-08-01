<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yiny
  Date: 8/1/21
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
    <div class="row clear">
        <div class="col">
            <h1>
                <small>修改书籍</small>
            </h1>
        </div>
    </div>
    
    <div class="row">
        <div class="col">
            <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

                <div class="mb-3">
                    <input type="text" class="form-control" id="id" name="id" value="${old_book.id}" hidden>
                </div>

                <div class="mb-3">
                    <label for="name" class="form-label">书籍名称</label>
                    <input type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" value="${old_book.name}" required>
                    <div id="nameHelp" class="form-text">请输入书籍名称。</div>
                </div>
                <div class="mb-3">
                    <label for="count" class="form-label">书籍数量</label>
                    <input type="text" class="form-control" id="count" name="count" value="${old_book.count}" required>
                </div>
                <div class="mb-3">
                    <label for="detail" class="form-label">书籍详情</label>
                    <input type="text" class="form-control" id="detail" name="detail" value="${old_book.detail}" required>
                </div>
                <button type="submit" class="btn btn-primary">提交</button>
            </form>

        </div>
    </div>
</div>

</body>
</html>
