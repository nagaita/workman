<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>Workman</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
    <link rel="stylesheet"
          href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
          integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div>
        <form action="/tasks" method="POST">
        <@spring.bind "taskForm"/>
            <div class="form-group">
            <@spring.formInput "taskForm.title", 'class="form-control"'/>
                <label for="title">Title</label>
            </div>
            <div class="form-group">
            <@spring.formInput "taskForm.deadlineDate", 'class="form-control"', "date"/>
            <@spring.formInput "taskForm.deadlineTime", 'class="form-control"', "time"/>
                <label for="title">Deadline</label>
            </div>
            <div class="form-group">
            <@spring.formInput "taskForm.scheduledDate", 'class="form-control"', "date"/>
            <@spring.formInput "taskForm.scheduledTime", 'class="form-control"', "time"/>
                <label for="title">Scheduled</label>
            </div>
            <input type="submit" class="btn btn-outline-primary" value="Add"/>
        </form>
    <#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>
    </div>
    <button type="button" class="btn btn-primary bmd-btn-fab">
        <i class="material-icons">add</i>
    </button>
    <div>
        <table class="table table-striped">
            <thead>
            <tr>
                <th></th>
                <th scope="row">ID</th>
                <th>Title</th>
                <th>Deadline</th>
                <th>Scheduled</th>
            </tr>
            </thead>
            <tbody>
            <#list tasks as task>
            <tr>
                <td>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" value="">
                        </label>
                    </div>
                </td>
                <td scope="row">${task.id}</td>
                <td>${task.title}</td>
                <td>${task.deadline!}</td>
                <td>${task.scheduled!}</td>
            </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js"
        integrity="sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js"
        integrity="sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9"
        crossorigin="anonymous"></script>
<script>$(document).ready(function () {
    $('body').bootstrapMaterialDesign();
});</script>

</div>
</body>
</html>