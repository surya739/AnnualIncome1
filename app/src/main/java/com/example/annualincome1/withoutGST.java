package com.example.annualincome1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class withoutGST extends AppCompatActivity {
    public EditText Number1,Number2,Number3;
    public TextView t1,t2,t3;
    public Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_g_s_t);
        t1 = findViewById( R.id.t1 );
        t2 = findViewById( R.id.t2 );
        t3 = findViewById( R.id.t3 );
        calculate = findViewById( R.id.b1 );


        Number1 = findViewById(R.id.ed1);
        Number2 = findViewById(R.id.ed2);
        Number3 = findViewById(R.id.ed3);

        calculate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(Number1.getText().toString());
                Double n2 = Double.parseDouble(Number2.getText().toString());
                Double n3 = n1-n2;
                Number3.setText( String.valueOf( n3 ) );
            }
        } );

    }
}
