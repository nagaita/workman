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
        <form action="/task-statuses" method="POST">
        <@spring.bind "taskStatusForm"/>
            <table>
                <tr>
                    <td>Code</td>
                    <td><@spring.formInput "taskStatusForm.code"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><@spring.formInput "taskStatusForm.name"/></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><@spring.formInput "taskStatusForm.description"/></td>
                </tr>
                <tr>
                    <td>Display Order</td>
                    <td><@spring.formInput "taskStatusForm.displayOrder" "", "number"/></td>
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
            <th>Code</th>
            <th>Name</th>
            <th>Description</th>
            <th>Display order</th>
        </tr>
        </thead>
        <tbody>
        <#list statuses as status>
        <tr>
            <td>${status.code}</td>
            <td>${status.name}</td>
            <td>${status.description!}</td>
            <td>${status.displayOrder}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>