package com.master.ndavid.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.io.Console;


public class MainActivity extends ActionBarActivity {
    private EditText editText;

    public Integer getCero(View view){
        return 0;
    }
    public Integer getOne(View view){
        return 1;
    }
    public Integer getTwo(View view){
        return 2;
    }
    public Integer getThree(View view){
        return 3;
    }
    public Integer getFour(View view){
        return 4;
    }
    public Integer getFive(View view){
        return 5;
    }
    public Integer getSix(View view){
        return 6;
    }
    public Integer getSeven(View view){
        return 7;
    }
    public Integer getEight(View view){
        return 8;
    }
    public Integer getNine(View view){
        return 9;
    }
    public String getAdd(View view){
        return "+";
    }
    public String getSub(View view){
        return "-";
    }
    public String getMul(View view){
        return "*";
    }
    public String getDiv(View view){
        return "/";
    }

    public Integer operation(String ope, int num1, int num2){
        switch (ope){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
        }
        return 0;
    }
    public void init(){

        editText = (EditText) findViewById(R.id.editText);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        int result = operation("+", 5, 5);
        Log.d("resultado", "Este es el resultado de la suma: " + result);
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
}
