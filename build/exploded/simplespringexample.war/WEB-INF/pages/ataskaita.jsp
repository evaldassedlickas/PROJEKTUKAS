<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 4/25/2017
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 30%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 5px;
        }

        tr:nth-child(even){
            background-color: #dddddd;
        }

        input {
            border: 1px solid #737373;
            padding: 5px;
        }

    </style>
</head>
<body>
<form:form action = "/cars/pridejo">

    <table>

        <tr>
            <td><form:label path = "ataskaitos_id">id</form:label></td>
            <td><form:input type = "number" path = "ataskaitos_id"  /></td>
        </tr>
        <tr>
            <td><form:label path = "data_nuo">nuo</form:label></td>
            <td><form:input type = "datetime" path = "data_nuo" /></td>
        </tr>
        <tr>
            <td><form:label path = "data_iki">iki</form:label></td>
            <td><form:input type = "datetime" path = "data_iki" /></td>
        </tr>
        <tr>
            <td><form:label path = "sistemos_gydytoju_skaicius">sk</form:label></td>
            <td><form:input type = "number" path = "sistemos_gydytoju_skaicius" /></td>
        </tr>
        <tr>
            <td><form:label path = "sistemos_pacientu_skaicius">sk2</form:label></td>
            <td><form:input type = "number" path = "sistemos_pacientu_skaicius" /></td>
        </tr>
        <tr>
            <td><form:label path = "sukurimo_data">data</form:label></td>
            <td><form:input type = "datetime" path = "sukurimo_data" /></td>
        </tr>
        <tr>
            <td><form:label path = "vizitu_skaicius">vizitai</form:label></td>
            <td><form:input type = "number" path = "vizitu_skaicius" /></td>
        </tr>
        <tr>
            <td/>
            <td colspan = "2">
                <input type = "submit"  value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
