package io.nagaita.workman.dbflute.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dbflute.Entity;
import org.dbflute.hook.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /** {@inheritDoc} */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(EntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime createdAt = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setCreatedAt(createdAt);
        final String createdBy = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setCreatedBy(createdBy);
        final java.time.LocalDateTime updatedAt = entity.getCreatedAt();
        entity.setUpdatedAt(updatedAt);
        final String updatedBy = entity.getCreatedBy();
        entity.setUpdatedBy(updatedBy);
    }

    /** {@inheritDoc} */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final EntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(EntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime updatedAt = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setUpdatedAt(updatedAt);
        final String updatedBy = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setUpdatedBy(updatedBy);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected EntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof EntityDefinedCommonColumn;
    }

    protected EntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (EntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return DBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(EntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.asTableDbName() + " before " + keyword);
    }
}
