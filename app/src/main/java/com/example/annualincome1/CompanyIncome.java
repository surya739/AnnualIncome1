package com.example.annualincome1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CompanyIncome extends AppCompatActivity {
    public Button b1;
    public TextView t1,t2;
    public EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_company_income );

        b1 = findViewById( R.id.b1 );
        t1 = findViewById( R.id.t1 );
        t2 = findViewById( R.id.t2 );
        ed1 = findViewById( R.id.ed1 );
        ed2 = findViewById( R.id.ed2 );
        ed3 = findViewById( R.id.ed3 );

        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(ed1.getText().toString());
                Double n2;
                Double n3;
                n3 = n1*0.18;
                n2 = n1 - n3;
                ed2.setText( String.valueOf( n2 ) );
                ed3.setText( String.valueOf( n3 ) );
            }
        } );
    }
}
