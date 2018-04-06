package io.nagaita.workman.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import io.nagaita.workman.dbflute.cbean.cq.ciq.*;
import io.nagaita.workman.dbflute.cbean.*;
import io.nagaita.workman.dbflute.cbean.cq.*;

/**
 * The base condition-query of task.
 * @author DBFlute(AutoGenerator)
 */
public class BsTaskCQ extends AbstractBsTaskCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TaskCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTaskCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from task) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TaskCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TaskCIQ xcreateCIQ() {
        TaskCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TaskCIQ xnewCIQ() {
        return new TaskCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join task on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TaskCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TaskCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _title;
    public ConditionValue xdfgetTitle()
    { if (_title == null) { _title = nCV(); }
      return _title; }
    protected ConditionValue xgetCValueTitle() { return xdfgetTitle(); }

    /**
     * Add order-by as ascend. <br>
     * title: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Title_Asc() { regOBA("title"); return this; }

    /**
     * Add order-by as descend. <br>
     * title: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Title_Desc() { regOBD("title"); return this; }

    protected ConditionValue _status;
    public ConditionValue xdfgetStatus()
    { if (_status == null) { _status = nCV(); }
      return _status; }
    protected ConditionValue xgetCValueStatus() { return xdfgetStatus(); }

    /**
     * Add order-by as ascend. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Status_Asc() { regOBA("status"); return this; }

    /**
     * Add order-by as descend. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Status_Desc() { regOBD("status"); return this; }

    protected ConditionValue _deadline;
    public ConditionValue xdfgetDeadline()
    { if (_deadline == null) { _deadline = nCV(); }
      return _deadline; }
    protected ConditionValue xgetCValueDeadline() { return xdfgetDeadline(); }

    /**
     * Add order-by as ascend. <br>
     * deadline: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Deadline_Asc() { regOBA("deadline"); return this; }

    /**
     * Add order-by as descend. <br>
     * deadline: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Deadline_Desc() { regOBD("deadline"); return this; }

    protected ConditionValue _scheduled;
    public ConditionValue xdfgetScheduled()
    { if (_scheduled == null) { _scheduled = nCV(); }
      return _scheduled; }
    protected ConditionValue xgetCValueScheduled() { return xdfgetScheduled(); }

    /**
     * Add order-by as ascend. <br>
     * scheduled: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Scheduled_Asc() { regOBA("scheduled"); return this; }

    /**
     * Add order-by as descend. <br>
     * scheduled: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_Scheduled_Desc() { regOBD("scheduled"); return this; }

    protected ConditionValue _createdAt;
    public ConditionValue xdfgetCreatedAt()
    { if (_createdAt == null) { _createdAt = nCV(); }
      return _createdAt; }
    protected ConditionValue xgetCValueCreatedAt() { return xdfgetCreatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_CreatedAt_Asc() { regOBA("created_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_CreatedAt_Desc() { regOBD("created_at"); return this; }

    protected ConditionValue _createdBy;
    public ConditionValue xdfgetCreatedBy()
    { if (_createdBy == null) { _createdBy = nCV(); }
      return _createdBy; }
    protected ConditionValue xgetCValueCreatedBy() { return xdfgetCreatedBy(); }

    /**
     * Add order-by as ascend. <br>
     * created_by: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_CreatedBy_Asc() { regOBA("created_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_by: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_CreatedBy_Desc() { regOBD("created_by"); return this; }

    protected ConditionValue _updatedAt;
    public ConditionValue xdfgetUpdatedAt()
    { if (_updatedAt == null) { _updatedAt = nCV(); }
      return _updatedAt; }
    protected ConditionValue xgetCValueUpdatedAt() { return xdfgetUpdatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdatedAt_Asc() { regOBA("updated_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdatedAt_Desc() { regOBD("updated_at"); return this; }

    protected ConditionValue _updatedBy;
    public ConditionValue xdfgetUpdatedBy()
    { if (_updatedBy == null) { _updatedBy = nCV(); }
      return _updatedBy; }
    protected ConditionValue xgetCValueUpdatedBy() { return xdfgetUpdatedBy(); }

    /**
     * Add order-by as ascend. <br>
     * updated_by: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdatedBy_Asc() { regOBA("updated_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_by: {NotNull, varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdatedBy_Desc() { regOBD("updated_by"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TaskCQ bq = (TaskCQ)bqs;
        TaskCQ uq = (TaskCQ)uqs;
        if (bq.hasConditionQueryTaskStatus()) {
            uq.queryTaskStatus().reflectRelationOnUnionQuery(bq.queryTaskStatus(), uq.queryTaskStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * task_status by my status, named 'taskStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public TaskStatusCQ queryTaskStatus() {
        return xdfgetConditionQueryTaskStatus();
    }
    public TaskStatusCQ xdfgetConditionQueryTaskStatus() {
        String prop = "taskStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTaskStatus()); xsetupOuterJoinTaskStatus(); }
        return xgetQueRlMap(prop);
    }
    protected TaskStatusCQ xcreateQueryTaskStatus() {
        String nrp = xresolveNRP("task", "taskStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TaskStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "taskStatus", nrp);
    }
    protected void xsetupOuterJoinTaskStatus() { xregOutJo("taskStatus"); }
    public boolean hasConditionQueryTaskStatus() { return xhasQueRlMap("taskStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TaskCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TaskCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TaskCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TaskCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TaskCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TaskCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TaskCQ> _myselfExistsMap;
    public Map<String, TaskCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TaskCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TaskCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TaskCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TaskCB.class.getName(); }
    protected String xCQ() { return TaskCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
