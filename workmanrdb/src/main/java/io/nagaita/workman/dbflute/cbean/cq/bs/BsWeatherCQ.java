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
 * The base condition-query of weather.
 * @author DBFlute(AutoGenerator)
 */
public class BsWeatherCQ extends AbstractBsWeatherCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WeatherCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWeatherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from weather) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WeatherCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WeatherCIQ xcreateCIQ() {
        WeatherCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WeatherCIQ xnewCIQ() {
        return new WeatherCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join weather on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WeatherCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WeatherCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _city;
    public ConditionValue xdfgetCity()
    { if (_city == null) { _city = nCV(); }
      return _city; }
    protected ConditionValue xgetCValueCity() { return xdfgetCity(); }

    /**
     * Add order-by as ascend. <br>
     * city: {varchar(80)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_City_Asc() { regOBA("city"); return this; }

    /**
     * Add order-by as descend. <br>
     * city: {varchar(80)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_City_Desc() { regOBD("city"); return this; }

    protected ConditionValue _tempLo;
    public ConditionValue xdfgetTempLo()
    { if (_tempLo == null) { _tempLo = nCV(); }
      return _tempLo; }
    protected ConditionValue xgetCValueTempLo() { return xdfgetTempLo(); }

    /**
     * Add order-by as ascend. <br>
     * temp_lo: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_TempLo_Asc() { regOBA("temp_lo"); return this; }

    /**
     * Add order-by as descend. <br>
     * temp_lo: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_TempLo_Desc() { regOBD("temp_lo"); return this; }

    protected ConditionValue _tempHi;
    public ConditionValue xdfgetTempHi()
    { if (_tempHi == null) { _tempHi = nCV(); }
      return _tempHi; }
    protected ConditionValue xgetCValueTempHi() { return xdfgetTempHi(); }

    /**
     * Add order-by as ascend. <br>
     * temp_hi: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_TempHi_Asc() { regOBA("temp_hi"); return this; }

    /**
     * Add order-by as descend. <br>
     * temp_hi: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_TempHi_Desc() { regOBD("temp_hi"); return this; }

    protected ConditionValue _prcp;
    public ConditionValue xdfgetPrcp()
    { if (_prcp == null) { _prcp = nCV(); }
      return _prcp; }
    protected ConditionValue xgetCValuePrcp() { return xdfgetPrcp(); }

    /**
     * Add order-by as ascend. <br>
     * prcp: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_Prcp_Asc() { regOBA("prcp"); return this; }

    /**
     * Add order-by as descend. <br>
     * prcp: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_Prcp_Desc() { regOBD("prcp"); return this; }

    protected ConditionValue _date;
    public ConditionValue xdfgetDate()
    { if (_date == null) { _date = nCV(); }
      return _date; }
    protected ConditionValue xgetCValueDate() { return xdfgetDate(); }

    /**
     * Add order-by as ascend. <br>
     * date: {date(13)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_Date_Asc() { regOBA("date"); return this; }

    /**
     * Add order-by as descend. <br>
     * date: {date(13)}
     * @return this. (NotNull)
     */
    public BsWeatherCQ addOrderBy_Date_Desc() { regOBD("date"); return this; }

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
    public BsWeatherCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWeatherCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WeatherCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WeatherCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WeatherCB.class.getName(); }
    protected String xCQ() { return WeatherCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
