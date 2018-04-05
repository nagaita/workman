package io.nagaita.workman.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import io.nagaita.workman.dbflute.allcommon.EntityDefinedCommonColumn;
import io.nagaita.workman.dbflute.allcommon.DBMetaInstanceHandler;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The entity of task as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String title = entity.getTitle();
 * java.time.LocalDateTime deadline = entity.getDeadline();
 * java.time.LocalDateTime scheduled = entity.getScheduled();
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime updatedAt = entity.getUpdatedAt();
 * String updatedBy = entity.getUpdatedBy();
 * entity.setId(id);
 * entity.setTitle(title);
 * entity.setDeadline(deadline);
 * entity.setScheduled(scheduled);
 * entity.setCreatedAt(createdAt);
 * entity.setCreatedBy(createdBy);
 * entity.setUpdatedAt(updatedAt);
 * entity.setUpdatedBy(updatedBy);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTask extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _id;

    /** title: {NotNull, varchar(256)} */
    protected String _title;

    /** deadline: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _deadline;

    /** scheduled: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _scheduled;

    /** created_at: {NotNull, timestamp(29, 6)} */
    protected java.time.LocalDateTime _createdAt;

    /** created_by: {NotNull, varchar(256)} */
    protected String _createdBy;

    /** updated_at: {NotNull, timestamp(29, 6)} */
    protected java.time.LocalDateTime _updatedAt;

    /** updated_by: {NotNull, varchar(256)} */
    protected String _updatedBy;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "task";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTask) {
            BsTask other = (BsTask)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_deadline));
        sb.append(dm).append(xfND(_scheduled));
        sb.append(dm).append(xfND(_createdAt));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_updatedAt));
        sb.append(dm).append(xfND(_updatedBy));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Task clone() {
        return (Task)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, bigserial(19)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, bigserial(19)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] title: {NotNull, varchar(256)} <br>
     * @return The value of the column 'title'. (basically NotNull if selected: for the constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return _title;
    }

    /**
     * [set] title: {NotNull, varchar(256)} <br>
     * @param title The value of the column 'title'. (basically NotNull if update: for the constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] deadline: {timestamp(29, 6)} <br>
     * @return The value of the column 'deadline'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getDeadline() {
        checkSpecifiedProperty("deadline");
        return _deadline;
    }

    /**
     * [set] deadline: {timestamp(29, 6)} <br>
     * @param deadline The value of the column 'deadline'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeadline(java.time.LocalDateTime deadline) {
        registerModifiedProperty("deadline");
        _deadline = deadline;
    }

    /**
     * [get] scheduled: {timestamp(29, 6)} <br>
     * @return The value of the column 'scheduled'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getScheduled() {
        checkSpecifiedProperty("scheduled");
        return _scheduled;
    }

    /**
     * [set] scheduled: {timestamp(29, 6)} <br>
     * @param scheduled The value of the column 'scheduled'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScheduled(java.time.LocalDateTime scheduled) {
        registerModifiedProperty("scheduled");
        _scheduled = scheduled;
    }

    /**
     * [get] created_at: {NotNull, timestamp(29, 6)} <br>
     * @return The value of the column 'created_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return _createdAt;
    }

    /**
     * [set] created_at: {NotNull, timestamp(29, 6)} <br>
     * @param createdAt The value of the column 'created_at'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        _createdAt = createdAt;
    }

    /**
     * [get] created_by: {NotNull, varchar(256)} <br>
     * @return The value of the column 'created_by'. (basically NotNull if selected: for the constraint)
     */
    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return _createdBy;
    }

    /**
     * [set] created_by: {NotNull, varchar(256)} <br>
     * @param createdBy The value of the column 'created_by'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedBy(String createdBy) {
        registerModifiedProperty("createdBy");
        _createdBy = createdBy;
    }

    /**
     * [get] updated_at: {NotNull, timestamp(29, 6)} <br>
     * @return The value of the column 'updated_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedAt() {
        checkSpecifiedProperty("updatedAt");
        return _updatedAt;
    }

    /**
     * [set] updated_at: {NotNull, timestamp(29, 6)} <br>
     * @param updatedAt The value of the column 'updated_at'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        registerModifiedProperty("updatedAt");
        _updatedAt = updatedAt;
    }

    /**
     * [get] updated_by: {NotNull, varchar(256)} <br>
     * @return The value of the column 'updated_by'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return _updatedBy;
    }

    /**
     * [set] updated_by: {NotNull, varchar(256)} <br>
     * @param updatedBy The value of the column 'updated_by'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedBy(String updatedBy) {
        registerModifiedProperty("updatedBy");
        _updatedBy = updatedBy;
    }
}
