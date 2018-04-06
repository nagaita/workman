package io.nagaita.workman.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import io.nagaita.workman.dbflute.allcommon.DBMetaInstanceHandler;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The entity of task_status as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String code = entity.getCode();
 * String name = entity.getName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setCode(code);
 * entity.setName(name);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTaskStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** code: {PK, NotNull, bpchar(16)} */
    protected String _code;

    /** name: {NotNull, varchar(64)} */
    protected String _name;

    /** description: {varchar(256)} */
    protected String _description;

    /** display_order: {NotNull, int4(10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "task_status";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_code == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** task by status, named 'taskList'. */
    protected List<Task> _taskList;

    /**
     * [get] task by status, named 'taskList'.
     * @return The entity list of referrer property 'taskList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Task> getTaskList() {
        if (_taskList == null) { _taskList = newReferrerList(); }
        return _taskList;
    }

    /**
     * [set] task by status, named 'taskList'.
     * @param taskList The entity list of referrer property 'taskList'. (NullAllowed)
     */
    public void setTaskList(List<Task> taskList) {
        _taskList = taskList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTaskStatus) {
            BsTaskStatus other = (BsTaskStatus)obj;
            if (!xSV(_code, other._code)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _code);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_taskList != null) { for (Task et : _taskList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "taskList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_code));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_taskList != null && !_taskList.isEmpty())
        { sb.append(dm).append("taskList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TaskStatus clone() {
        return (TaskStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] code: {PK, NotNull, bpchar(16)} <br>
     * @return The value of the column 'code'. (basically NotNull if selected: for the constraint)
     */
    public String getCode() {
        checkSpecifiedProperty("code");
        return _code;
    }

    /**
     * [set] code: {PK, NotNull, bpchar(16)} <br>
     * @param code The value of the column 'code'. (basically NotNull if update: for the constraint)
     */
    public void setCode(String code) {
        registerModifiedProperty("code");
        _code = code;
    }

    /**
     * [get] name: {NotNull, varchar(64)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, varchar(64)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] description: {varchar(256)} <br>
     * @return The value of the column 'description'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] description: {varchar(256)} <br>
     * @param description The value of the column 'description'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] display_order: {NotNull, int4(10)} <br>
     * @return The value of the column 'display_order'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] display_order: {NotNull, int4(10)} <br>
     * @param displayOrder The value of the column 'display_order'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }
}
