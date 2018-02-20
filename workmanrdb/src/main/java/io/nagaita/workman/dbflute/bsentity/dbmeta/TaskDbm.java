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
 * The DB meta of task. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TaskDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TaskDbm _instance = new TaskDbm();
    private TaskDbm() {}
    public static TaskDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Task)et).getId(), (et, vl) -> ((Task)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((Task)et).getTitle(), (et, vl) -> ((Task)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((Task)et).getDeadline(), (et, vl) -> ((Task)et).setDeadline(ctldt(vl)), "deadline");
        setupEpg(_epgMap, et -> ((Task)et).getScheduled(), (et, vl) -> ((Task)et).setScheduled(ctldt(vl)), "scheduled");
        setupEpg(_epgMap, et -> ((Task)et).getCreatedAt(), (et, vl) -> ((Task)et).setCreatedAt(ctldt(vl)), "createdAt");
        setupEpg(_epgMap, et -> ((Task)et).getCreatedBy(), (et, vl) -> ((Task)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((Task)et).getUpdatedAt(), (et, vl) -> ((Task)et).setUpdatedAt(ctldt(vl)), "updatedAt");
        setupEpg(_epgMap, et -> ((Task)et).getUpdatedBy(), (et, vl) -> ((Task)et).setUpdatedBy((String)vl), "updatedBy");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "task";
    protected final String _tableDispName = "task";
    protected final String _tablePropertyName = "task";
    protected final TableSqlName _tableSqlName = new TableSqlName("task", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Long.class, "id", null, true, true, true, "bigserial", 19, 0, null, "nextval('task_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTitle = cci("title", "title", null, null, String.class, "title", null, false, false, true, "varchar", 256, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeadline = cci("deadline", "deadline", null, null, java.time.LocalDateTime.class, "deadline", null, false, false, false, "timestamp", 29, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScheduled = cci("scheduled", "scheduled", null, null, java.time.LocalDateTime.class, "scheduled", null, false, false, false, "timestamp", 29, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("created_at", "created_at", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, true, "timestamp", 29, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("created_by", "created_by", null, null, String.class, "createdBy", null, false, false, true, "varchar", 256, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedAt = cci("updated_at", "updated_at", null, null, java.time.LocalDateTime.class, "updatedAt", null, false, false, true, "timestamp", 29, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("updated_by", "updated_by", null, null, String.class, "updatedBy", null, false, false, true, "varchar", 256, 0, null, null, true, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * title: {NotNull, varchar(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * deadline: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeadline() { return _columnDeadline; }
    /**
     * scheduled: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScheduled() { return _columnScheduled; }
    /**
     * created_at: {NotNull, timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedAt() { return _columnCreatedAt; }
    /**
     * created_by: {NotNull, varchar(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedBy() { return _columnCreatedBy; }
    /**
     * updated_at: {NotNull, timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedAt() { return _columnUpdatedAt; }
    /**
     * updated_by: {NotNull, varchar(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedBy() { return _columnUpdatedBy; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTitle());
        ls.add(columnDeadline());
        ls.add(columnScheduled());
        ls.add(columnCreatedAt());
        ls.add(columnCreatedBy());
        ls.add(columnUpdatedAt());
        ls.add(columnUpdatedBy());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "task_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnCreatedAt(), columnCreatedBy(), columnUpdatedAt(), columnUpdatedBy()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnCreatedAt(), columnCreatedBy(), columnUpdatedAt(), columnUpdatedBy()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdatedAt(), columnUpdatedBy()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "io.nagaita.workman.dbflute.exentity.Task"; }
    public String getConditionBeanTypeName() { return "io.nagaita.workman.dbflute.cbean.TaskCB"; }
    public String getBehaviorTypeName() { return "io.nagaita.workman.dbflute.exbhv.TaskBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Task> getEntityType() { return Task.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Task newEntity() { return new Task(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Task)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Task)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
