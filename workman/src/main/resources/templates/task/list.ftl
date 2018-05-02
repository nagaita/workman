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
            <@spring.formInput "taskForm.title", 'class="form-control"'/>
                <label for="title">Title</label>
            </div>
            <div>
            <@spring.formInput "taskForm.deadlineDate", 'class="form-control"', "date"/>
            <@spring.formInput "taskForm.deadlineTime", 'class="form-control"', "time"/>
                <label for="title">Deadline</label>
            </div>
            <div>
            <@spring.formInput "taskForm.scheduledDate", 'class="form-control"', "date"/>
            <@spring.formInput "taskForm.scheduledTime", 'class="form-control"', "time"/>
                <label for="title">Scheduled</label>
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
                <th>Deadline</th>
                <th>Scheduled</th>
            </tr>
            </thead>
            <tbody>
            <#list tasks as task>
            <tr>
                <td>
                </td>
                <td>${task.id}</td>
                <td>${task.title}</td>
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