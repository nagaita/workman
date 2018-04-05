package io.nagaita.workman.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import io.nagaita.workman.dbflute.cbean.*;
import io.nagaita.workman.dbflute.cbean.cq.bs.*;
import io.nagaita.workman.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of task.
 * @author DBFlute(AutoGenerator)
 */
public class TaskCIQ extends AbstractBsTaskCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTaskCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TaskCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTaskCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    protected ConditionValue xgetCValueTitle() { return _myCQ.xdfgetTitle(); }
    protected ConditionValue xgetCValueDeadline() { return _myCQ.xdfgetDeadline(); }
    protected ConditionValue xgetCValueScheduled() { return _myCQ.xdfgetScheduled(); }
    protected ConditionValue xgetCValueCreatedAt() { return _myCQ.xdfgetCreatedAt(); }
    protected ConditionValue xgetCValueCreatedBy() { return _myCQ.xdfgetCreatedBy(); }
    protected ConditionValue xgetCValueUpdatedAt() { return _myCQ.xdfgetUpdatedAt(); }
    protected ConditionValue xgetCValueUpdatedBy() { return _myCQ.xdfgetUpdatedBy(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(TaskCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TaskCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TaskCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TaskCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TaskCB.class.getName(); }
    protected String xinCQ() { return TaskCQ.class.getName(); }
}
