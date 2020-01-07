package com.example.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view)
    {
        RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
        RadioButton rb=findViewById(rg.getCheckedRadioButtonId());
        Toast.makeText(this, rb.getText()+ " is selected", Toast.LENGTH_SHORT).show();

    }

}
