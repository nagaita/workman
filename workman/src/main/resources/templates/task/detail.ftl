<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
</head>
<body>
<div>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Deadline</th>
            <th>Scheduled</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${task.id}</td>
            <td>${task.title}</td>
            <td>${task.deadlineDate!}</td>
            <td>${task.scheduledDate!}</td>
        </tr>
        </tbody>
    </table>
</div>
<a href="/tasks">back</a>
</body>
</html>