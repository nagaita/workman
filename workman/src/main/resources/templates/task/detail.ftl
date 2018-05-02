<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
</head>
<body>
<div id="container">
    <form action="/tasks/${taskForm.id}" method="POST">
        <@spring.bind "taskForm"/>
        <input type="hidden" name="_method" value="PUT">
        <ul>
            <li>
                <label for="title">Title</label>
                <@spring.formInput "taskForm.title", 'id="title" name="name"'/>
            </li>
            <li>
                <label for="status">Status</label>
                <@spring.formSingleSelect "taskForm.status", statusOptions, 'id="status"' />
            </li>
            <li>
                <label for="deadlineDate">Deadline</label>
                <@spring.formInput "taskForm.deadlineDate", 'id="deadlineDate" name="deadlineDate"', "date"/>
                <@spring.formInput "taskForm.deadlineTime", 'id="deadlineTime" name="deadlineTime"', "time"/>
            </li>
            <li>
                <label for="scheduledDate">Scheduled</label>
                <@spring.formInput "taskForm.scheduledDate", 'id="scheduledDate" name="scheduledDate"', "date"/>
                <@spring.formInput "taskForm.scheduledTime", 'id="scheduledTime" name="scheduledTime"', "time"/>
            </li>
            <li>
                <input type="submit" value="submit">
            </li>
        </ul>
    </form>
    <a href="/tasks">back</a>
</div>
</body>
</html>