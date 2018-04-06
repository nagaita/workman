package io.nagaita.workman.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import io.nagaita.workman.dbflute.exbhv.*;
import io.nagaita.workman.dbflute.exentity.*;
import io.nagaita.workman.dbflute.cbean.*;

/**
 * The referrer loader of task_status as TABLE. <br>
 * <pre>
 * [primary key]
 *     code
 *
 * [column]
 *     code, name, description, display_order
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     task
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     taskList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTaskStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TaskStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTaskStatus ready(List<TaskStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Task> _referrerTask;

    /**
     * Load referrer of taskList by the set-upper of referrer. <br>
     * task by status, named 'taskList'.
     * <pre>
     * <span style="color: #0000C0">taskStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">taskStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadTask</span>(<span style="color: #553000">taskCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">taskCB</span>.setupSelect...
     *         <span style="color: #553000">taskCB</span>.query().set...
     *         <span style="color: #553000">taskCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">taskLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    taskLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TaskStatus taskStatus : <span style="color: #553000">taskStatusList</span>) {
     *     ... = taskStatus.<span style="color: #CC4747">getTaskList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStatus_InScope(pkList);
     * cb.query().addOrderBy_Status_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTask> loadTask(ReferrerConditionSetupper<TaskCB> refCBLambda) {
        myBhv().loadTask(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTask = refLs);
        return hd -> hd.handle(new LoaderOfTask().ready(_referrerTask, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TaskStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
