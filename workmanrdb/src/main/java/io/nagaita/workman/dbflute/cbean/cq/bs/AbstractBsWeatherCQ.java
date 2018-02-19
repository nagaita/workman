package io.nagaita.workman.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import io.nagaita.workman.dbflute.allcommon.*;
import io.nagaita.workman.dbflute.cbean.*;
import io.nagaita.workman.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of weather.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWeatherCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWeatherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "weather";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_Equal(String city) {
        doSetCity_Equal(fRES(city));
    }

    protected void doSetCity_Equal(String city) {
        regCity(CK_EQ, city);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotEqual(String city) {
        doSetCity_NotEqual(fRES(city));
    }

    protected void doSetCity_NotEqual(String city) {
        regCity(CK_NES, city);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterThan(String city) {
        regCity(CK_GT, fRES(city));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessThan(String city) {
        regCity(CK_LT, fRES(city));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterEqual(String city) {
        regCity(CK_GE, fRES(city));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessEqual(String city) {
        regCity(CK_LE, fRES(city));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {varchar(80)}
     * @param cityList The collection of city as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_InScope(Collection<String> cityList) {
        doSetCity_InScope(cityList);
    }

    protected void doSetCity_InScope(Collection<String> cityList) {
        regINS(CK_INS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {varchar(80)}
     * @param cityList The collection of city as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotInScope(Collection<String> cityList) {
        doSetCity_NotInScope(cityList);
    }

    protected void doSetCity_NotInScope(Collection<String> cityList) {
        regINS(CK_NINS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {varchar(80)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_LikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_LikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {varchar(80)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCity_LikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_NotLikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_NotLikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {varchar(80)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCity_NotLikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     */
    public void setCity_IsNull() { regCity(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     */
    public void setCity_IsNullOrEmpty() { regCity(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * city: {varchar(80)}
     */
    public void setCity_IsNotNull() { regCity(CK_ISNN, DOBJ); }

    protected void regCity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCity(), "city"); }
    protected abstract ConditionValue xgetCValueCity();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_Equal(Integer tempLo) {
        doSetTempLo_Equal(tempLo);
    }

    protected void doSetTempLo_Equal(Integer tempLo) {
        regTempLo(CK_EQ, tempLo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_NotEqual(Integer tempLo) {
        doSetTempLo_NotEqual(tempLo);
    }

    protected void doSetTempLo_NotEqual(Integer tempLo) {
        regTempLo(CK_NES, tempLo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_GreaterThan(Integer tempLo) {
        regTempLo(CK_GT, tempLo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_LessThan(Integer tempLo) {
        regTempLo(CK_LT, tempLo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_GreaterEqual(Integer tempLo) {
        regTempLo(CK_GE, tempLo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLo The value of tempLo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempLo_LessEqual(Integer tempLo) {
        regTempLo(CK_LE, tempLo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param minNumber The min number of tempLo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempLo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTempLo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTempLo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     * @param minNumber The min number of tempLo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempLo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTempLo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTempLo(), "temp_lo", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLoList The collection of tempLo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempLo_InScope(Collection<Integer> tempLoList) {
        doSetTempLo_InScope(tempLoList);
    }

    protected void doSetTempLo_InScope(Collection<Integer> tempLoList) {
        regINS(CK_INS, cTL(tempLoList), xgetCValueTempLo(), "temp_lo");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * temp_lo: {int4(10)}
     * @param tempLoList The collection of tempLo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempLo_NotInScope(Collection<Integer> tempLoList) {
        doSetTempLo_NotInScope(tempLoList);
    }

    protected void doSetTempLo_NotInScope(Collection<Integer> tempLoList) {
        regINS(CK_NINS, cTL(tempLoList), xgetCValueTempLo(), "temp_lo");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     */
    public void setTempLo_IsNull() { regTempLo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * temp_lo: {int4(10)}
     */
    public void setTempLo_IsNotNull() { regTempLo(CK_ISNN, DOBJ); }

    protected void regTempLo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempLo(), "temp_lo"); }
    protected abstract ConditionValue xgetCValueTempLo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_Equal(Integer tempHi) {
        doSetTempHi_Equal(tempHi);
    }

    protected void doSetTempHi_Equal(Integer tempHi) {
        regTempHi(CK_EQ, tempHi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_NotEqual(Integer tempHi) {
        doSetTempHi_NotEqual(tempHi);
    }

    protected void doSetTempHi_NotEqual(Integer tempHi) {
        regTempHi(CK_NES, tempHi);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_GreaterThan(Integer tempHi) {
        regTempHi(CK_GT, tempHi);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_LessThan(Integer tempHi) {
        regTempHi(CK_LT, tempHi);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_GreaterEqual(Integer tempHi) {
        regTempHi(CK_GE, tempHi);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHi The value of tempHi as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTempHi_LessEqual(Integer tempHi) {
        regTempHi(CK_LE, tempHi);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param minNumber The min number of tempHi. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempHi. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTempHi_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTempHi_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     * @param minNumber The min number of tempHi. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tempHi. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTempHi_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTempHi(), "temp_hi", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHiList The collection of tempHi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempHi_InScope(Collection<Integer> tempHiList) {
        doSetTempHi_InScope(tempHiList);
    }

    protected void doSetTempHi_InScope(Collection<Integer> tempHiList) {
        regINS(CK_INS, cTL(tempHiList), xgetCValueTempHi(), "temp_hi");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * temp_hi: {int4(10)}
     * @param tempHiList The collection of tempHi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempHi_NotInScope(Collection<Integer> tempHiList) {
        doSetTempHi_NotInScope(tempHiList);
    }

    protected void doSetTempHi_NotInScope(Collection<Integer> tempHiList) {
        regINS(CK_NINS, cTL(tempHiList), xgetCValueTempHi(), "temp_hi");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     */
    public void setTempHi_IsNull() { regTempHi(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * temp_hi: {int4(10)}
     */
    public void setTempHi_IsNotNull() { regTempHi(CK_ISNN, DOBJ); }

    protected void regTempHi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempHi(), "temp_hi"); }
    protected abstract ConditionValue xgetCValueTempHi();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_Equal(java.math.BigDecimal prcp) {
        doSetPrcp_Equal(prcp);
    }

    protected void doSetPrcp_Equal(java.math.BigDecimal prcp) {
        regPrcp(CK_EQ, prcp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_NotEqual(java.math.BigDecimal prcp) {
        doSetPrcp_NotEqual(prcp);
    }

    protected void doSetPrcp_NotEqual(java.math.BigDecimal prcp) {
        regPrcp(CK_NES, prcp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_GreaterThan(java.math.BigDecimal prcp) {
        regPrcp(CK_GT, prcp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_LessThan(java.math.BigDecimal prcp) {
        regPrcp(CK_LT, prcp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_GreaterEqual(java.math.BigDecimal prcp) {
        regPrcp(CK_GE, prcp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcp The value of prcp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrcp_LessEqual(java.math.BigDecimal prcp) {
        regPrcp(CK_LE, prcp);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param minNumber The min number of prcp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prcp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrcp_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrcp_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param minNumber The min number of prcp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prcp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrcp_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrcp(), "prcp", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcpList The collection of prcp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcp_InScope(Collection<java.math.BigDecimal> prcpList) {
        doSetPrcp_InScope(prcpList);
    }

    protected void doSetPrcp_InScope(Collection<java.math.BigDecimal> prcpList) {
        regINS(CK_INS, cTL(prcpList), xgetCValuePrcp(), "prcp");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prcp: {float4(8, 8)}
     * @param prcpList The collection of prcp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrcp_NotInScope(Collection<java.math.BigDecimal> prcpList) {
        doSetPrcp_NotInScope(prcpList);
    }

    protected void doSetPrcp_NotInScope(Collection<java.math.BigDecimal> prcpList) {
        regINS(CK_NINS, cTL(prcpList), xgetCValuePrcp(), "prcp");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     */
    public void setPrcp_IsNull() { regPrcp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * prcp: {float4(8, 8)}
     */
    public void setPrcp_IsNotNull() { regPrcp(CK_ISNN, DOBJ); }

    protected void regPrcp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrcp(), "prcp"); }
    protected abstract ConditionValue xgetCValuePrcp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * @param date The value of date as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_Equal(java.time.LocalDate date) {
        regDate(CK_EQ,  date);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * @param date The value of date as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterThan(java.time.LocalDate date) {
        regDate(CK_GT,  date);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * @param date The value of date as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessThan(java.time.LocalDate date) {
        regDate(CK_LT,  date);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * @param date The value of date as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterEqual(java.time.LocalDate date) {
        regDate(CK_GE,  date);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * @param date The value of date as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessEqual(java.time.LocalDate date) {
        regDate(CK_LE, date);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * date: {date(13)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * date: {date(13)}
     */
    public void setDate_IsNull() { regDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * date: {date(13)}
     */
    public void setDate_IsNotNull() { regDate(CK_ISNN, DOBJ); }

    protected void regDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDate(), "date"); }
    protected abstract ConditionValue xgetCValueDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WeatherCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WeatherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WeatherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WeatherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WeatherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WeatherCB&gt;() {
     *     public void query(WeatherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WeatherCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WeatherCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WeatherCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WeatherCQ sq);

    protected WeatherCB xcreateScalarConditionCB() {
        WeatherCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WeatherCB xcreateScalarConditionPartitionByCB() {
        WeatherCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WeatherCB newMyCB() {
        return new WeatherCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WeatherCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
