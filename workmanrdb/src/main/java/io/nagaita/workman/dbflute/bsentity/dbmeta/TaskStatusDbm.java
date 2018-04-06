package io.nagaita.workman.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import io.nagaita.workman.dbflute.allcommon.*;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The DB meta of task_status. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TaskStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TaskStatusDbm _instance = new TaskStatusDbm();
    private TaskStatusDbm() {}
    public static TaskStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TaskStatus)et).getCode(), (et, vl) -> ((TaskStatus)et).setCode((String)vl), "code");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getName(), (et, vl) -> ((TaskStatus)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getDescription(), (et, vl) -> ((TaskStatus)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getDisplayOrder(), (et, vl) -> ((TaskStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "task_status";
    protected final String _tableDispName = "task_status";
    protected final String _tablePropertyName = "taskStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("task_status", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCode = cci("code", "code", null, null, String.class, "code", null, true, false, true, "bpchar", 16, 0, null, null, false, null, null, null, "taskList", null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, String.class, "description", null, false, false, false, "varchar", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, null, Integer.class, "displayOrder", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * code: {PK, NotNull, bpchar(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode() { return _columnCode; }
    /**
     * name: {NotNull, varchar(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * description: {varchar(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * display_order: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCode());
        ls.add(columnName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * task by status, named 'taskList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTaskList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCode(), TaskDbm.getInstance().columnStatus());
        return cri("task_status_fkey", "taskList", this, TaskDbm.getInstance(), mp, false, "taskStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "io.nagaita.workman.dbflute.exentity.TaskStatus"; }
    public String getConditionBeanTypeName() { return "io.nagaita.workman.dbflute.cbean.TaskStatusCB"; }
    public String getBehaviorTypeName() { return "io.nagaita.workman.dbflute.exbhv.TaskStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TaskStatus> getEntityType() { return TaskStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TaskStatus newEntity() { return new TaskStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TaskStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TaskStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
