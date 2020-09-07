package com.example.annualincome1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Business extends AppCompatActivity {
    public TextView t1;
    public Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_business );
        t1 = findViewById( R.id.t1 );
        b1 = findViewById( R.id.b1 );
        b2 = findViewById( R.id.b2 );

        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GST();
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WithoutGST();
            }
        } );

    }
    public void GST(){
        Intent i = new Intent(Business.this,GST.class);
        startActivity( i );
    }
    public void WithoutGST(){
        Intent i = new Intent(Business.this,withoutGST.class);
        startActivity( i );

    }

}

