package io.nagaita.workman.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import io.nagaita.workman.dbflute.exbhv.*;
import io.nagaita.workman.dbflute.exentity.*;

/**
 * The referrer loader of weather as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWeather {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Weather> _selectedList;
    protected BehaviorSelector _selector;
    protected WeatherBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWeather ready(List<Weather> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WeatherBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WeatherBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Weather> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
