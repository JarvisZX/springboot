<%--
  Created by IntelliJ IDEA.
  User: 76803
  Date: 2018/8/6
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" />
    <script src="/js/jquery-1.11.3.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>

</head>

<body>
<div class="container" style="margin-top: 10px;">
	<jsp:include page="header.jsp"></jsp:include>
    <div class="container"style=" background-image: url(/images/index.jpg);" >
        <div style="height: 60px;"></div>
        <div class="row">
            <div class="col-md-8">
            </div>
            <div class="col-md-4">
                <form action="/checkLogin"  style="border: solid #101010;background-color: #2AABD2;" >
                    <div style="height: 20px;"></div>
                    <div style="height: 30px ;text-align: center;" ;>
                        <font size="4">登陆</font>
                    </div>
                    <div style="height: 20px;"></div>
                    <div class="row">
                        <div class="col-md-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>

                        <div class="col-md-7">
                            <div class="input-group">
                                <span class="input-group-addon" id="username">用户名</span>
                                <input style="width: 100%;" type="text" name="username" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                            </div>
                        </div>

                    </div>
                    <div style="height: 30px;"></div>
                    <div class="row">
                        <div class="col-md-3"></div>

                        <div class="col-md-7">
                            <div class="input-group">
                                <span class="input-group-addon" id="password">密码</span>
                                <input style="width: 100%;" type="password" name="password" class="form-control" placeholder="Password" aria-describedby="basic-addon1">
                            </div>
                        </div>

                    </div>
                    <div style="height: 30px;"></div>
                    <div class="row">
                        <div class="col-md-5"></div>
                        <input type="submit"class="btn btn-default" value="登   录" height="50px" />
                    </div>
                    <div style="height: 30px;"></div>
                </form>
            </div>

        </div>
        <div style="height: 300px;"></div>
    </div>
</div>

</body>

</html>