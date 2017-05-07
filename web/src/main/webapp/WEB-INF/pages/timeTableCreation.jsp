<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Justas
  Date: 5/4/2017
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
<div class="container">
    <div class="fa-table col-sm-7">
        <form action='/pacientas/createTimeTable' method="post">
            <table class="table">
                <tr>
                    <th><label>Pavadinimas:</label></th>
                    <th><input type="text" id="pavadinimas" name="pavadinimas" placeholder="pavadinimas"/></th>
                </tr>
                <tr>
                    <th><label>Darbo pradžia:</label></th>
                    <th><input type="text" id="darbo_pradzia" name="darbo_pradzia" placeholder="darbo_pradzia"/></th>
                </tr>

                <tr>
                    <th><label>Darbo pabaiga:</label></th>
                    <th><input type="text" pattern="([01]?[0-9]|2[0-3]):[0-5][0-9]" id="darbo_pabaiga" name="darbo_pabaiga" placeholder="darbo_pabaiga"/></th>
                </tr>
                <tr>
                    <th><label>Pacientų skaičius per dieną:</label></th>
                    <th><input type="number" pattern="([01]?[0-9]|2[0-3]):[0-5][0-9]" id="pacientu_sk_per_diena" name="pacientu_sk_per_diena" placeholder="pacientu_sk_per_diena"/></th>
                </tr>
                <tr>
                    <th><label>Šiuo metu naudojama:</label></th>

                    <th><input type="checkbox" id="naudojama" name="naudojama" placeholder="naudojama"/></th>
                    <input type="hidden" name="naudojama" placeholder="naudojama" value="false"/>
                </tr>
                <tr>
                    <label>Pasirinkite dienas, kuriomis galios kuriamas tvarkaraštis</label>
                </tr>
                <tr>
                    <th><label class="ssv-small-bold-label">Pirmadienis:</label></th>

                    <th><input type="checkbox"name="pirm" value="true"/></th>
                    <input type="hidden" name="pirm" value="false"/>
                </tr>
                <tr>
                    <th><label>Antradienis:</label></th>

                    <th><input  type="checkbox" id="antr" name="antr" placeholder="antr"/></th>
                    <input type="hidden" name="antr" placeholder="antr" value="false"/>
                </tr>
                <tr>
                    <th><label>Trečiadienis:</label></th>

                    <th><input type="checkbox" id="trec" name="trec" placeholder="trec"/></th>
                    <input type="hidden" name="trec" placeholder="trec" value="false"/>
                </tr>
                <tr>
                    <th><label>Ketvirtadienis:</label></th>

                    <th><input type="checkbox" id="ketv" name="ketv" placeholder="ketv"/></th>
                    <input type="hidden" name="ketv" placeholder="ketv" value="false"/>
                </tr>
                <tr>
                    <th><label>Penktadienis:</label></th>

                    <th><input type="checkbox" id="penkt" name="penkt" placeholder="penkt"/></th>
                    <input type="hidden" name="penkt" placeholder="penkt" value="false"/>
                </tr>
                <tr>
                    <th><label>Šeštadienis:</label></th>

                    <th><input type="checkbox" id="sest" name="sest" placeholder="sest"/></th>
                    <input type="hidden" name="sest" placeholder="sest" value="false"/>
                </tr>
                <tr>
                    <th><label>Sekmadienis:</label></th>

                    <th><input type="checkbox" id="sekm" name="sekm" placeholder="sekm"/></th>
                    <input type="hidden" name="sekm" placeholder="sekm" value="false"/>
                </tr>
            </table>
            <button id="submit" class="btn">Sukurti</button>
        </form>
    </div>
</div>
</body>
</html>
