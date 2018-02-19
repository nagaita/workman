<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
</head>
<body>
<h1>Task list</h1>
<div>
    <table>
        <thead>
        <tr>
            <th>title</th>
        </tr>
        </thead>
        <tbody>
        <#list tasks as task>
        <tr>
            <td>${task.title}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>