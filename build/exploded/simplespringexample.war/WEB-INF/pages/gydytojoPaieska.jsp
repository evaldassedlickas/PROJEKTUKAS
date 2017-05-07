<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 4/30/2017
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Paieška</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="../../resources/bootstrap/startbootstrap-stylish-portfolio-master/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../resources/bootstrap/startbootstrap-stylish-portfolio-master/css/stylish-portfolio.css" rel="stylesheet">
    <link href="../../resources/bootstrap/startbootstrap-stylish-portfolio-master/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="jquery.table-sort.js"></script>

</head>
<body>
<c:choose>
    <c:when test="${empty loggedInUser.asmens_kodas}">
        <!meta http-equiv="refresh" content="0" ; href="/pacientaslogin"/>
    </c:when>
</c:choose>
<div class="container">
    ${loginError}
    <div class="fa-table col-sm-7">
        <form action='/pacientas/doctorSearch' method="post">
            <table class="table">
                <tr>
                    <th><label>Gydytojo vardas:</label></th>
                    <th><input type="text" id="vardas" name="vardas" placeholder="vardas"/></th>
                </tr>

                <tr>
                    <th><label>Gydytojo pavardė:</label></th>
                    <th><input type="text" id="pavarde" name="pavarde" placeholder="pavarde"/></th>
                </tr>

            </table>
            <button id="submit" class="btn">Ieškoti</button>
        </form>
    </div>
</div>

<c:choose>
    <c:when test="${empty asmresults}">
    </c:when>
    <c:otherwise>
        </div>
        <div class="container-fluid">
        <div class="row">
        <div class=" col-md-push-2 col-md-7">
        <table class="table ">
        <thead>
        <tr>
            <th>Vardas</th>
            <th>Pavardė</th>
            <th>Sritis</th>
            <th width="10%">Registracija</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="asmresults" items="${asmresults}" varStatus="status" >
            <tr>
                <td>${asmresults.vardas} </td>
                <td>${asmresults.pavarde}</td>
                <td>${gydresults[status.index].specifikacija}</td>
                <td width="10%"><a href='/pacientas/setTime=<c:out value="${gydresults[status.index].gydytojo_id}"/>'>Registruotis vizitui</a></td>
            </tr>
        </c:forEach>
        </tbody>
        </table>
        </div>
        </div>
        </div>
    </c:otherwise>
</c:choose>
</body>
</html>
