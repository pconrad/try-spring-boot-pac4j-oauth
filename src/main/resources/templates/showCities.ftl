<!DOCTYPE html>
<html>
<head>
    <title>Cities</title>
    <#include "head_common.ftl"/>
</head>
<body>
<#include "navbar.ftl" />

<h2>List of cities</h2>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Population</th>
    </tr>

    <#list cities as city>
    <tr>
        <td>${city.id}</td>
        <td>${city.name}</td>
        <td>${city.population}</td>
    </tr>
</#list>
</table>
</body>
</html>