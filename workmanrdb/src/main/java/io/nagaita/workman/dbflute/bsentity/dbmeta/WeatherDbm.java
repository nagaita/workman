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
 * The DB meta of weather. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WeatherDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WeatherDbm _instance = new WeatherDbm();
    private WeatherDbm() {}
    public static WeatherDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Weather)et).getCity(), (et, vl) -> ((Weather)et).setCity((String)vl), "city");
        setupEpg(_epgMap, et -> ((Weather)et).getTempLo(), (et, vl) -> ((Weather)et).setTempLo(cti(vl)), "tempLo");
        setupEpg(_epgMap, et -> ((Weather)et).getTempHi(), (et, vl) -> ((Weather)et).setTempHi(cti(vl)), "tempHi");
        setupEpg(_epgMap, et -> ((Weather)et).getPrcp(), (et, vl) -> ((Weather)et).setPrcp(ctb(vl)), "prcp");
        setupEpg(_epgMap, et -> ((Weather)et).getDate(), (et, vl) -> ((Weather)et).setDate(ctld(vl)), "date");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "weather";
    protected final String _tableDispName = "weather";
    protected final String _tablePropertyName = "weather";
    protected final TableSqlName _tableSqlName = new TableSqlName("weather", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCity = cci("city", "city", null, null, String.class, "city", null, false, false, false, "varchar", 80, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempLo = cci("temp_lo", "temp_lo", null, null, Integer.class, "tempLo", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempHi = cci("temp_hi", "temp_hi", null, null, Integer.class, "tempHi", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrcp = cci("prcp", "prcp", null, null, java.math.BigDecimal.class, "prcp", null, false, false, false, "float4", 8, 8, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDate = cci("date", "date", null, null, java.time.LocalDate.class, "date", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * city: {varchar(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCity() { return _columnCity; }
    /**
     * temp_lo: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempLo() { return _columnTempLo; }
    /**
     * temp_hi: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempHi() { return _columnTempHi; }
    /**
     * prcp: {float4(8, 8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrcp() { return _columnPrcp; }
    /**
     * date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDate() { return _columnDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCity());
        ls.add(columnTempLo());
        ls.add(columnTempHi());
        ls.add(columnPrcp());
        ls.add(columnDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "io.nagaita.workman.dbflute.exentity.Weather"; }
    public String getConditionBeanTypeName() { return "io.nagaita.workman.dbflute.cbean.WeatherCB"; }
    public String getBehaviorTypeName() { return "io.nagaita.workman.dbflute.exbhv.WeatherBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Weather> getEntityType() { return Weather.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Weather newEntity() { return new Weather(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Weather)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Weather)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
