package com.example.annualincome1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public Button b1,b2,b3;
public TextView t1;
public ImageView i1;
public Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        t1 = findViewById( R.id.t1 );
        i1 = findViewById( R.id.i1 );
        drawable = getResources().getDrawable( R.drawable.money_bg );
        i1.setImageDrawable( drawable );
        b1 = findViewById( R.id.b1 );
        b2 = findViewById( R.id.b2 );
        b3 = findViewById( R.id.b3 );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartActivity1();
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartActivity2();
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartActivity3();
            }
        } );
    }
    public void StartActivity1(){
        Intent i = new Intent( MainActivity.this,Business.class );
        startActivity( i );
    }
    public void StartActivity2(){
        Intent i = new Intent( MainActivity.this,CompanyIncome.class );
        startActivity( i );
    }
    public void StartActivity3(){
        Intent i = new Intent( MainActivity.this,Company.class );
        startActivity( i );
    }
}
