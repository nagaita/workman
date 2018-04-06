package io.nagaita.workman.dbflute.cbean.nss;

import io.nagaita.workman.dbflute.cbean.cq.TaskCQ;

/**
 * The nest select set-upper of task.
 * @author DBFlute(AutoGenerator)
 */
public class TaskNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TaskCQ _query;
    public TaskNss(TaskCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * task_status by my status, named 'taskStatus'.
     */
    public void withTaskStatus() {
        _query.xdoNss(() -> _query.queryTaskStatus());
    }
}
