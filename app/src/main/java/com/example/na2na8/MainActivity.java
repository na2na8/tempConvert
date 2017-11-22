package com.example.na2na8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    EditText et1;
    EditText et2;

    public void button1Method(View v){
        String getC = et1.getText().toString();
        double getC_ = Double.parseDouble(getC);
        double setF = getC_*1.8 + 32;
        Toast.makeText(MainActivity.this, "화씨 온도는 "+ setF + "도 입니다.", Toast.LENGTH_LONG).show();
    }

    public void button2Method(View v){
        String getF = et2.getText().toString();
        double getF_ = Double.parseDouble(getF);
        double setC = (getF_-32)/1.8;
        Toast.makeText(MainActivity.this, "섭씨 온도는 "+ setC + "도 입니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.btCtoF);
        et1 = (EditText)findViewById(R.id.etCtoF);

        b2 = (Button)findViewById(R.id.btFtoC);
        et2 = (EditText)findViewById(R.id.etFtoC);
    }
}
