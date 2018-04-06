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
 * The abstract condition-query of task.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTaskCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTaskCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "task";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Long id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Long id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Long id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Long id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Long id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Long id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Long id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Long id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Long> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Long> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Long> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Long> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "title");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "title");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_LikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "title", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_NotLikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {NotNull, varchar(256)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "title", likeSearchOption);
    }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "title"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_Equal(String status) {
        doSetStatus_Equal(fRES(status));
    }

    protected void doSetStatus_Equal(String status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotEqual(String status) {
        doSetStatus_NotEqual(fRES(status));
    }

    protected void doSetStatus_NotEqual(String status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param statusList The collection of status as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_InScope(Collection<String> statusList) {
        doSetStatus_InScope(statusList);
    }

    protected void doSetStatus_InScope(Collection<String> statusList) {
        regINS(CK_INS, cTL(statusList), xgetCValueStatus(), "status");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param statusList The collection of status as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotInScope(Collection<String> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    protected void doSetStatus_NotInScope(Collection<String> statusList) {
        regINS(CK_NINS, cTL(statusList), xgetCValueStatus(), "status");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status} <br>
     * <pre>e.g. setStatus_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param status The value of status as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStatus_LikeSearch(status, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status} <br>
     * <pre>e.g. setStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param status The value of status as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), xgetCValueStatus(), "status", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStatus_NotLikeSearch(status, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * status: {NotNull, bpchar(16), FK to task_status}
     * @param status The value of status as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), xgetCValueStatus(), "status", likeSearchOption);
    }

    protected void regStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatus(), "status"); }
    protected abstract ConditionValue xgetCValueStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * @param deadline The value of deadline as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeadline_Equal(java.time.LocalDateTime deadline) {
        regDeadline(CK_EQ,  deadline);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * @param deadline The value of deadline as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeadline_GreaterThan(java.time.LocalDateTime deadline) {
        regDeadline(CK_GT,  deadline);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * @param deadline The value of deadline as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeadline_LessThan(java.time.LocalDateTime deadline) {
        regDeadline(CK_LT,  deadline);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * @param deadline The value of deadline as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeadline_GreaterEqual(java.time.LocalDateTime deadline) {
        regDeadline(CK_GE,  deadline);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * @param deadline The value of deadline as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeadline_LessEqual(java.time.LocalDateTime deadline) {
        regDeadline(CK_LE, deadline);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * <pre>e.g. setDeadline_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deadline. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deadline. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDeadline_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDeadline_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     * <pre>e.g. setDeadline_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deadline. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deadline. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDeadline_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "deadline"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDeadline(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     */
    public void setDeadline_IsNull() { regDeadline(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * deadline: {timestamp(29, 6)}
     */
    public void setDeadline_IsNotNull() { regDeadline(CK_ISNN, DOBJ); }

    protected void regDeadline(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeadline(), "deadline"); }
    protected abstract ConditionValue xgetCValueDeadline();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * @param scheduled The value of scheduled as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScheduled_Equal(java.time.LocalDateTime scheduled) {
        regScheduled(CK_EQ,  scheduled);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * @param scheduled The value of scheduled as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScheduled_GreaterThan(java.time.LocalDateTime scheduled) {
        regScheduled(CK_GT,  scheduled);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * @param scheduled The value of scheduled as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScheduled_LessThan(java.time.LocalDateTime scheduled) {
        regScheduled(CK_LT,  scheduled);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * @param scheduled The value of scheduled as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScheduled_GreaterEqual(java.time.LocalDateTime scheduled) {
        regScheduled(CK_GE,  scheduled);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * @param scheduled The value of scheduled as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScheduled_LessEqual(java.time.LocalDateTime scheduled) {
        regScheduled(CK_LE, scheduled);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * <pre>e.g. setScheduled_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of scheduled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of scheduled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setScheduled_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setScheduled_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     * <pre>e.g. setScheduled_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of scheduled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of scheduled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setScheduled_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "scheduled"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueScheduled(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     */
    public void setScheduled_IsNull() { regScheduled(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * scheduled: {timestamp(29, 6)}
     */
    public void setScheduled_IsNotNull() { regScheduled(CK_ISNN, DOBJ); }

    protected void regScheduled(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScheduled(), "scheduled"); }
    protected abstract ConditionValue xgetCValueScheduled();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @param createdAt The value of createdAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_Equal(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_EQ,  createdAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @param createdAt The value of createdAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GT,  createdAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @param createdAt The value of createdAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LT,  createdAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @param createdAt The value of createdAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GE,  createdAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * @param createdAt The value of createdAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LE, createdAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "created_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedAt(), nm, op);
    }

    protected void regCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedAt(), "created_at"); }
    protected abstract ConditionValue xgetCValueCreatedAt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_Equal(String createdBy) {
        doSetCreatedBy_Equal(fRES(createdBy));
    }

    protected void doSetCreatedBy_Equal(String createdBy) {
        regCreatedBy(CK_EQ, createdBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotEqual(String createdBy) {
        doSetCreatedBy_NotEqual(fRES(createdBy));
    }

    protected void doSetCreatedBy_NotEqual(String createdBy) {
        regCreatedBy(CK_NES, createdBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterThan(String createdBy) {
        regCreatedBy(CK_GT, fRES(createdBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessThan(String createdBy) {
        regCreatedBy(CK_LT, fRES(createdBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterEqual(String createdBy) {
        regCreatedBy(CK_GE, fRES(createdBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessEqual(String createdBy) {
        regCreatedBy(CK_LE, fRES(createdBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdByList The collection of createdBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_InScope(Collection<String> createdByList) {
        doSetCreatedBy_InScope(createdByList);
    }

    protected void doSetCreatedBy_InScope(Collection<String> createdByList) {
        regINS(CK_INS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdByList The collection of createdBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotInScope(Collection<String> createdByList) {
        doSetCreatedBy_NotInScope(createdByList);
    }

    protected void doSetCreatedBy_NotInScope(Collection<String> createdByList) {
        regINS(CK_NINS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_LikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_LikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCreatedBy_LikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_NotLikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_NotLikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(256)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCreatedBy_NotLikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    protected void regCreatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedBy(), "created_by"); }
    protected abstract ConditionValue xgetCValueCreatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @param updatedAt The value of updatedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_Equal(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_EQ,  updatedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @param updatedAt The value of updatedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_GreaterThan(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_GT,  updatedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @param updatedAt The value of updatedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_LessThan(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_LT,  updatedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @param updatedAt The value of updatedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_GreaterEqual(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_GE,  updatedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * @param updatedAt The value of updatedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_LessEqual(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_LE, updatedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setUpdatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setUpdatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "updated_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedAt(), nm, op);
    }

    protected void regUpdatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedAt(), "updated_at"); }
    protected abstract ConditionValue xgetCValueUpdatedAt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_Equal(String updatedBy) {
        doSetUpdatedBy_Equal(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_Equal(String updatedBy) {
        regUpdatedBy(CK_EQ, updatedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotEqual(String updatedBy) {
        doSetUpdatedBy_NotEqual(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_NotEqual(String updatedBy) {
        regUpdatedBy(CK_NES, updatedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterThan(String updatedBy) {
        regUpdatedBy(CK_GT, fRES(updatedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessThan(String updatedBy) {
        regUpdatedBy(CK_LT, fRES(updatedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterEqual(String updatedBy) {
        regUpdatedBy(CK_GE, fRES(updatedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessEqual(String updatedBy) {
        regUpdatedBy(CK_LE, fRES(updatedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedByList The collection of updatedBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_InScope(Collection<String> updatedByList) {
        doSetUpdatedBy_InScope(updatedByList);
    }

    protected void doSetUpdatedBy_InScope(Collection<String> updatedByList) {
        regINS(CK_INS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedByList The collection of updatedBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotInScope(Collection<String> updatedByList) {
        doSetUpdatedBy_NotInScope(updatedByList);
    }

    protected void doSetUpdatedBy_NotInScope(Collection<String> updatedByList) {
        regINS(CK_NINS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_LikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_LikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdatedBy_LikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_NotLikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_NotLikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(256)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdatedBy_NotLikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    protected void regUpdatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedBy(), "updated_by"); }
    protected abstract ConditionValue xgetCValueUpdatedBy();

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
    public HpSLCFunction<TaskCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TaskCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TaskCB&gt;() {
     *     public void query(TaskCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TaskCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TaskCQ sq);

    protected TaskCB xcreateScalarConditionCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TaskCB xcreateScalarConditionPartitionByCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TaskCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TaskCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TaskCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TaskCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TaskCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TaskCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskCB cb = new TaskCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TaskCQ sq);

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
    protected TaskCB newMyCB() {
        return new TaskCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TaskCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
