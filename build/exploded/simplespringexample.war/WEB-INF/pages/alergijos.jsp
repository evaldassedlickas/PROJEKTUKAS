<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 4/28/2017
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table {
            alignment: center;
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 5px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>Kodas</th>
        <th>Pavadinimas</th>
        <th>Alergenas</th>
        <th>Komentaras</th>
        <th>Ligos Korteles Eilutes ID</th>
    </tr>
    <c:forEach var="alergija" items="${alergija}">
     <tr>
        <th>${alergija.kodas} </th>
        <th>${alergija.pavadinimas}</th>
        <th>${alergija.alergenas}</th>
        <th>${alergija.komentaras}</th>
        <th>${alergija.ligos_korteles_eilutes_id}</th>
     </tr>

    </c:forEach>
</table>

</body>
</html>