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
 * The base condition-query of task_status.
 * @author DBFlute(AutoGenerator)
 */
public class BsTaskStatusCQ extends AbstractBsTaskStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TaskStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTaskStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from task_status) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TaskStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TaskStatusCIQ xcreateCIQ() {
        TaskStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TaskStatusCIQ xnewCIQ() {
        return new TaskStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join task_status on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TaskStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TaskStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _code;
    public ConditionValue xdfgetCode()
    { if (_code == null) { _code = nCV(); }
      return _code; }
    protected ConditionValue xgetCValueCode() { return xdfgetCode(); }

    public Map<String, TaskCQ> xdfgetCode_ExistsReferrer_TaskList() { return xgetSQueMap("code_ExistsReferrer_TaskList"); }
    public String keepCode_ExistsReferrer_TaskList(TaskCQ sq) { return xkeepSQue("code_ExistsReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetCode_NotExistsReferrer_TaskList() { return xgetSQueMap("code_NotExistsReferrer_TaskList"); }
    public String keepCode_NotExistsReferrer_TaskList(TaskCQ sq) { return xkeepSQue("code_NotExistsReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetCode_SpecifyDerivedReferrer_TaskList() { return xgetSQueMap("code_SpecifyDerivedReferrer_TaskList"); }
    public String keepCode_SpecifyDerivedReferrer_TaskList(TaskCQ sq) { return xkeepSQue("code_SpecifyDerivedReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetCode_QueryDerivedReferrer_TaskList() { return xgetSQueMap("code_QueryDerivedReferrer_TaskList"); }
    public String keepCode_QueryDerivedReferrer_TaskList(TaskCQ sq) { return xkeepSQue("code_QueryDerivedReferrer_TaskList", sq); }
    public Map<String, Object> xdfgetCode_QueryDerivedReferrer_TaskListParameter() { return xgetSQuePmMap("code_QueryDerivedReferrer_TaskList"); }
    public String keepCode_QueryDerivedReferrer_TaskListParameter(Object pm) { return xkeepSQuePm("code_QueryDerivedReferrer_TaskList", pm); }

    /**
     * Add order-by as ascend. <br>
     * code: {PK, NotNull, bpchar(16)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Code_Asc() { regOBA("code"); return this; }

    /**
     * Add order-by as descend. <br>
     * code: {PK, NotNull, bpchar(16)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Code_Desc() { regOBD("code"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * name: {NotNull, varchar(64)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, varchar(64)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * description: {varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br>
     * description: {varchar(256)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * display_order: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("display_order"); return this; }

    /**
     * Add order-by as descend. <br>
     * display_order: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("display_order"); return this; }

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
    public BsTaskStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTaskStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TaskStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TaskStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TaskStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TaskStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TaskStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TaskStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TaskStatusCQ> _myselfExistsMap;
    public Map<String, TaskStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TaskStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TaskStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TaskStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TaskStatusCB.class.getName(); }
    protected String xCQ() { return TaskStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
