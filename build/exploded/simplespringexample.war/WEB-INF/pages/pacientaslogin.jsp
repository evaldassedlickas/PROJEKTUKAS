<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 4/30/2017
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prisijungimas</title>
</head>
<body>

<div class="container">
    ${loginError}
    <div class="form-group form">
        <form action='pacientaslogin' method="post">
            <div>
                <label>Asmens kodas:</label>
                <input type="text" id="asmensKodas" name="asmensKodas" placeholder="asmens kodas" class="form-control"/>
            </div>
            <div>
                <label>Slaptažodis:</label>
                <input type="text" id="slaptazodis" name="slaptazodis" placeholder="slaptazodis" class="form-control"/>
            </div>
            <button id="loginButton" class="form-control">Prisijungti</button>
        </form>>
    </div>
</div>
</body>
</html>
