<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
</head>
<body>
<div>
    <fieldset>
        <form action="/tasks" method="POST">
        <@spring.bind "taskForm"/>
            <table>
                <tr>
                    <td>Title</td>
                    <td><@spring.formInput "taskForm.title"/></td>
                </tr>
                <tr>
                    <td>Deadline</td>
                    <td><@spring.formInput "taskForm.deadline", "", "date"/></td>
                </tr>
                <tr>
                    <td>Scheduled</td>
                    <td><@spring.formInput "taskForm.scheduled", "", "date"/></td>
                </tr>
            </table>
            <input type="submit" value="Add"/>
        </form>
    </fieldset>
<#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
</div>
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
        <#list tasks as task>
        <tr>
            <td>${task.id}</td>
            <td>${task.title}</td>
            <td>${task.deadline!}</td>
            <td>${task.scheduled!}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>