package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText salaryEditText = findViewById(R.id.salary);
        EditText worktimeEditText = findViewById(R.id.worktime);
        EditText proectTimeEditText = findViewById(R.id.proectTime);
        EditText procentEditText = findViewById(R.id.procent);

        String salaryVal = salaryEditText.getText().toString();
        String worktimeVal = worktimeEditText.getText().toString();
        String proectTimeVal = proectTimeEditText.getText().toString();
        String procentVal = procentEditText.getText().toString();

        if(salaryVal.isEmpty() || worktimeVal.isEmpty() || proectTimeVal.isEmpty() || procentVal.isEmpty()){
            Toast.makeText(this, "Введены не все данные", Toast.LENGTH_SHORT).show();
        }
        int salary = Integer.parseInt(salaryVal);
        int worktime = Integer.parseInt(worktimeVal);
        int proectTime = Integer.parseInt(proectTimeVal);
        int procent = Integer.parseInt(procentVal);

        int result= (salary / worktime * proectTime) + procent/100;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("За подработку можно взять:");
        builder.setMessage(result + " $");
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}