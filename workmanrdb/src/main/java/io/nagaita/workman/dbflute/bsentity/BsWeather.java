package io.nagaita.workman.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import io.nagaita.workman.dbflute.allcommon.DBMetaInstanceHandler;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The entity of weather as TABLE. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     city, temp_lo, temp_hi, prcp, date
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
 * String city = entity.getCity();
 * Integer tempLo = entity.getTempLo();
 * Integer tempHi = entity.getTempHi();
 * java.math.BigDecimal prcp = entity.getPrcp();
 * java.time.LocalDate date = entity.getDate();
 * entity.setCity(city);
 * entity.setTempLo(tempLo);
 * entity.setTempHi(tempHi);
 * entity.setPrcp(prcp);
 * entity.setDate(date);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWeather extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** city: {varchar(80)} */
    protected String _city;

    /** temp_lo: {int4(10)} */
    protected Integer _tempLo;

    /** temp_hi: {int4(10)} */
    protected Integer _tempHi;

    /** prcp: {float4(8, 8)} */
    protected java.math.BigDecimal _prcp;

    /** date: {date(13)} */
    protected java.time.LocalDate _date;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "weather";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsWeather) {
            BsWeather other = (BsWeather)obj;
            if (!xSV(_city, other._city)) { return false; }
            if (!xSV(_tempLo, other._tempLo)) { return false; }
            if (!xSV(_tempHi, other._tempHi)) { return false; }
            if (!xSV(_prcp, other._prcp)) { return false; }
            if (!xSV(_date, other._date)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _city);
        hs = xCH(hs, _tempLo);
        hs = xCH(hs, _tempHi);
        hs = xCH(hs, _prcp);
        hs = xCH(hs, _date);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_city));
        sb.append(dm).append(xfND(_tempLo));
        sb.append(dm).append(xfND(_tempHi));
        sb.append(dm).append(xfND(_prcp));
        sb.append(dm).append(xfND(_date));
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
    public Weather clone() {
        return (Weather)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] city: {varchar(80)} <br>
     * @return The value of the column 'city'. (NullAllowed even if selected: for no constraint)
     */
    public String getCity() {
        checkSpecifiedProperty("city");
        return _city;
    }

    /**
     * [set] city: {varchar(80)} <br>
     * @param city The value of the column 'city'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCity(String city) {
        registerModifiedProperty("city");
        _city = city;
    }

    /**
     * [get] temp_lo: {int4(10)} <br>
     * @return The value of the column 'temp_lo'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTempLo() {
        checkSpecifiedProperty("tempLo");
        return _tempLo;
    }

    /**
     * [set] temp_lo: {int4(10)} <br>
     * @param tempLo The value of the column 'temp_lo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTempLo(Integer tempLo) {
        registerModifiedProperty("tempLo");
        _tempLo = tempLo;
    }

    /**
     * [get] temp_hi: {int4(10)} <br>
     * @return The value of the column 'temp_hi'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTempHi() {
        checkSpecifiedProperty("tempHi");
        return _tempHi;
    }

    /**
     * [set] temp_hi: {int4(10)} <br>
     * @param tempHi The value of the column 'temp_hi'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTempHi(Integer tempHi) {
        registerModifiedProperty("tempHi");
        _tempHi = tempHi;
    }

    /**
     * [get] prcp: {float4(8, 8)} <br>
     * @return The value of the column 'prcp'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrcp() {
        checkSpecifiedProperty("prcp");
        return _prcp;
    }

    /**
     * [set] prcp: {float4(8, 8)} <br>
     * @param prcp The value of the column 'prcp'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrcp(java.math.BigDecimal prcp) {
        registerModifiedProperty("prcp");
        _prcp = prcp;
    }

    /**
     * [get] date: {date(13)} <br>
     * @return The value of the column 'date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getDate() {
        checkSpecifiedProperty("date");
        return _date;
    }

    /**
     * [set] date: {date(13)} <br>
     * @param date The value of the column 'date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDate(java.time.LocalDate date) {
        registerModifiedProperty("date");
        _date = date;
    }
}
