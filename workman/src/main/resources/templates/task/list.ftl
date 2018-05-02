<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
    <header>
        <p>workman</p>
    </header>
    <div>
        <form action="/tasks" method="POST">
        <@spring.bind "taskForm"/>
            <div>
                <label for="title">Title</label>
            <@spring.formInput "taskForm.title"/>
            </div>
            <div>
                <label for="title">Deadline</label>
            <@spring.formInput "taskForm.deadlineDate", "date"/>
            <@spring.formInput "taskForm.deadlineTime", "time"/>
            </div>
            <div>
                <label for="title">Scheduled</label>
            <@spring.formInput "taskForm.scheduledDate", "date"/>
            <@spring.formInput "taskForm.scheduledTime", "time"/>
            </div>
            <input type="submit" value="Add"/>
        </form>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
    </div>
    <div>
        <table>
            <thead>
            <tr>
                <th></th>
                <th>ID</th>
                <th>Title</th>
                <th>Status</th>
                <th>Deadline</th>
                <th>Scheduled</th>
            </tr>
            </thead>
            <tbody>
            <#list tasks as task>
            <tr>
                <td></td>
                <td><a href="/tasks/${task.id}">${task.id}</a></td>
                <td>${task.title}</td>
                <td>${task.status!}</td>
                <td>${task.deadline!}</td>
                <td>${task.scheduled!}</td>
            </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>