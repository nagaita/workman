package io.nagaita.workman.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import io.nagaita.workman.dbflute.exbhv.*;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The referrer loader of task as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, title, deadline, scheduled, created_at, created_by, updated_at, updated_by
 *
 * [sequence]
 *     task_id_seq
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTask {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Task> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTask ready(List<Task> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Task> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
