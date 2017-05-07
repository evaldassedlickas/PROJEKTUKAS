<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 5/2/2017
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Example</title>
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
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../resources/date_input-master/jquery.date_input.js"></script>
    <link rel="stylesheet" href="../../resources/date_input-master/date_input.css" type="text/css">
    <script type="text/javascript">$($.date_input.initialize);</script>
</head>
<body>
<br>
<br>
<div class="container">
    ${loginError}
    <div class="fa-table col-sm-7">
        <form action='/pacientas/doctorSearch' method="post">
            <table class="table">
                <tr>
                    <th><label>Pasirinkite datą: </label></th>
                    <th><input type="text" name="date" class="date_input"></th>
                </tr>
            </table>
            <button id="submit" class="btn">Tikrinti laisvus laikus</button>
        </form>
    </div>
</div>

</body>
</html>

