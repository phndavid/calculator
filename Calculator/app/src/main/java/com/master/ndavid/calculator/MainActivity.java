package com.master.ndavid.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;


public class MainActivity extends ActionBarActivity {
    private EditText editText;
    private TextView textView;
    private String operation;

    public void getDelete(View view){
        if(operation != null) {
            operation = operation.substring(0, operation.length() - 1);
            editText.setText(operation);
        }
    }
    public void getClear(View view){
        operation = "0";
        editText.setText(operation);
    }
    public void getCero(View view){
        operation  +="0";
        editText.setText(operation);
    }
    public void getOne(View view){
        operation += "1";
        editText.setText(operation);
    }
    public void getTwo(View view){
        operation  +="2";
        editText.setText(operation);
    }
    public void getThree(View view){
        operation  +="3";
        editText.setText(operation);
    }
    public void getFour(View view){
        operation  +="4";
        editText.setText(operation);
    }
    public void getFive(View view){
        operation  +="5";
        editText.setText(operation);
    }
    public void getSix(View view){
        operation  +="6";
        editText.setText(operation);
    }
    public void getSeven(View view){
        operation  +="7";
        editText.setText(operation);
    }
    public void getEight(View view){
        operation  +="8";
        editText.setText(operation);
    }
    public void getNine(View view){
        operation  +="9";
        editText.setText(operation);;
    }
    public void getAdd(View view){
        operation  +="+";
        editText.setText(operation);
    }
    public void getSub(View view){
        operation  +="-";
        editText.setText(operation);
    }
    public void getMul(View view){
        operation  +="*";
        editText.setText(operation);
    }
    public void getDiv(View view){
        operation  +="/";
        editText.setText(operation);
    }

    public Integer result(String ope, int num1, int num2){
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
        operation = "";
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        int result = result("+", 5, 5);
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
