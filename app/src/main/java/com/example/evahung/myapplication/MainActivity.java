package com.example.evahung.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    String expanse_name;
    String tag;
    float expense_price;
    ExpenseListAdapter adapter;
    ArrayList<Expense> data;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LinearLayout ll = (LinearLayout) findViewById(R.id.ll_expense);
        //View view = LayoutInflater.from(this).inflate(R.layout.layout_expense,null);
        //ll.addView(view);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_tag);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tag_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void AddExpense(View v){
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView tv= (TextView)findViewById(R.id.et_add_name);
                if (tv!=null)
                    expanse_name=tv.getText().toString();
                tv= (TextView)findViewById(R.id.et_add_price);
                if (tv!=null)
                    expense_price=Float.parseFloat(tv.getText().toString());
                Expense e=new Expense();
                e.setName(expanse_name);
                e.setExpense(expense_price);
                adapter=new ExpenseListAdapter(getBaseContext(),data);
                lv=(ListView)findViewById(R.id.lv_expense);
                //lv.setAdapter(adapter);
            }
        });
        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        /*
        AlertDialog ad = adb.create();
        ad.setTitle("Expense");
        LayoutInflater inflater = getLayoutInflater();
        View dialoglayout = inflater.inflate(R.layout.expense_add, null);
        //View view = LayoutInflater.from(this).inflate(R.layout.expense_add,null);
        ad.setView(dialoglayout);
        ad.show();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
                    return true;
                }*/

        return super.onOptionsItemSelected(item);
    }
}
