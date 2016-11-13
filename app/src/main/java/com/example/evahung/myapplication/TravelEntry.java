package com.example.evahung.myapplication;

import android.provider.BaseColumns;

/**
 * Created by ngachung2 on 11/7/2016.
 */
public class TravelEntry implements BaseColumns {
    public static final String TBL_NAME = "travel";
    public static final String COL_NAME_TRAVEL_NAME = "travel_name";
    public static final String COL_NAME_TRAVEL_SDATE = "travel_start";
    public static final String COL_NAME_TRAVEL_EDATE = "travel_end";
    public static final String COL_NAME_TRAVEL_BUDGET = "budget";
}
