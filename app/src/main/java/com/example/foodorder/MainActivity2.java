package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    public RelativeLayout biriyani,vegBin,pizza,burger,dosa,rools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        biriyani=(RelativeLayout) findViewById(R.id.biriyanis);
        vegBin=(RelativeLayout) findViewById(R.id.vegBin);
        pizza=(RelativeLayout) findViewById(R.id.piza);
        burger=(RelativeLayout) findViewById(R.id.burger);
        dosa=(RelativeLayout) findViewById(R.id.dosa);
        rools=(RelativeLayout) findViewById(R.id.rools);
        biriyani.setOnClickListener(this);
        vegBin.setOnClickListener(this);
        pizza.setOnClickListener(this);
        burger.setOnClickListener(this);
        dosa.setOnClickListener(this);
        rools.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){

            case R.id.biriyanis:
                i=new Intent(this,BiriyaniActivity.class);
                startActivity(i);
                break;

            case R.id.vegBin:
                i=new Intent(this,VegBiriyaniActivity.class);
                startActivity(i);
                break;

            case R.id.piza:
                i=new Intent(this,PizzaActivity.class);
                startActivity(i);
                break;

            case R.id.burger:
                i=new Intent(this,BurgerActivity.class);
                startActivity(i);
                break;

            case R.id.dosa:
                i=new Intent(this,DosaActivity.class);
                startActivity(i);
                break;

            case R.id.rools:
                i=new Intent(this,RoolsActivity.class);
                startActivity(i);
                break;
        }

    }
}