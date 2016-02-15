package com.forateq.mobileerp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.forateq.mobileerp.R;

/**
 * Created by Vallejos Family on 2/2/2016.
 */
public class MyCompanyView extends LinearLayout {

    private LinearLayout customersLayout;
    private LinearLayout employeesLayout;
    private LinearLayout vendorsLayout;
    private LinearLayout itemsLayout;
    private LinearLayout chartOfAccountsLayout;
    private LinearLayout expensesLayout;
    private LinearLayout incomeLayout;


    public MyCompanyView(Context context) {
        super(context);
        init();
    }

    public MyCompanyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCompanyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.my_company_view, this);
        customersLayout = (LinearLayout) findViewById(R.id.customers_layout);
        employeesLayout = (LinearLayout) findViewById(R.id.employees_layout);
        vendorsLayout = (LinearLayout) findViewById(R.id.vendors_layout);
        itemsLayout = (LinearLayout) findViewById(R.id.items_layout);
        chartOfAccountsLayout = (LinearLayout) findViewById(R.id.chart_of_accounts_layout);
        expensesLayout = (LinearLayout) findViewById(R.id.expenses_layout);
        incomeLayout = (LinearLayout) findViewById(R.id.income_layout);
    }

    public LinearLayout getCustomersLayout() {
        return customersLayout;
    }

    public LinearLayout getEmployeesLayout() {
        return employeesLayout;
    }

    public LinearLayout getVendorsLayout() {
        return vendorsLayout;
    }

    public LinearLayout getItemsLayout() {
        return itemsLayout;
    }

    public LinearLayout getChartOfAccountsLayout() {
        return chartOfAccountsLayout;
    }

    public LinearLayout getExpensesLayout() {
        return expensesLayout;
    }

    public LinearLayout getIncomeLayout() {
        return incomeLayout;
    }
}
