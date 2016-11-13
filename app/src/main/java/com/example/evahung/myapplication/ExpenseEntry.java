package com.example.evahung.myapplication;

import android.provider.BaseColumns;

/**
 * Created by ngachung2 on 11/7/2016.
 */
public class ExpenseEntry implements BaseColumns {
    public static final String TBL_NAME = "expense";
    public static final String COL_NAME_EXPENSE_NAME = "expense_name";
    public static final String COL_NAME_EXPENSE_TAG = "expense_tag";
    public static final String COL_NAME_EXPENSE = "expense_price";
    public static final String COL_NAME_ACTIVITY_ID = "activity_id";
}