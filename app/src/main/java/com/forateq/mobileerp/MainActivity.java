package com.forateq.mobileerp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.forateq.mobileerp.views.MyCompanyView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ScrollView mainView;
    private LinearLayout containerLayout;
    private LinearLayout myCompanyLayout;
    private LinearLayout eProcurementLayout;
    private LinearLayout humanResourceLayout;
    private LinearLayout crmLayout;
    private LinearLayout inventoryManagementLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainView = (ScrollView) findViewById(R.id.main_view);
        containerLayout = (LinearLayout) findViewById(R.id.view_container);
        myCompanyLayout = (LinearLayout) findViewById(R.id.my_company_layout);
        myCompanyLayout.setOnClickListener(this);
        eProcurementLayout = (LinearLayout) findViewById(R.id.e_procurement_layout);
        eProcurementLayout.setOnClickListener(this);
        humanResourceLayout = (LinearLayout) findViewById(R.id.human_resource_layout);
        humanResourceLayout.setOnClickListener(this);
        crmLayout = (LinearLayout) findViewById(R.id.crm_layout);
        crmLayout.setOnClickListener(this);
        inventoryManagementLayout = (LinearLayout) findViewById(R.id.inventory_managemnt_layout);
        inventoryManagementLayout.setOnClickListener(this);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.my_company_layout:{
                mainView.setVisibility(View.GONE);
                MyCompanyView myCompanyView = new MyCompanyView(this);
                containerLayout.addView(myCompanyView);
                containerLayout.setVisibility(View.VISIBLE);
                break;
            }
            case R.id.e_procurement_layout:{
                break;
            }
            case R.id.human_resource_layout:{
                break;
            }
            case R.id.crm_layout:{
                break;
            }
            case R.id.inventory_managemnt_layout:{
                break;
            }
        }

    }

    @Override
    public void onBackPressed() {
        mainView.setVisibility(View.VISIBLE);
        containerLayout.removeAllViews();
        containerLayout.setVisibility(View.GONE);
    }
}
