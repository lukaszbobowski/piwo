package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int a = 0;
    ImageView beerImageView1;
    ImageView beerImageView2;
    ImageView beerImageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beerImageView1 = findViewById(R.id.beerImageView1);
        beerImageView2 = findViewById(R.id.beerImageView2);
        beerImageView3 = findViewById(R.id.beerImageView3);
    }
    public void beerAnswerBtnClick(View v) {
        Spinner spn = findViewById(R.id.beerTypesSpinner);
        String selectedType = spn.getSelectedItem().toString();
        //Log.d("info o piwie", selectedType);
        //Toast.makeText(this, selectedType, Toast.LENGTH_SHORT).show();
        BeerExpert bier = new BeerExpert();


        TextView answerTextView1 = findViewById(R.id.beerAnswerTextView1);
        TextView answerTextView2 = findViewById(R.id.beerAnswerTextView2);
        TextView answerTextView3 = findViewById(R.id.beerAnswerTextView3);



        ArrayList<Beer> beers = bier.getBrands(selectedType);


        answerTextView1.setText(beers.get(0).getName());
        beerImageView1.setImageResource(beers.get(0).imadeId);
        answerTextView2.setText(beers.get(1).getName());
        beerImageView2.setImageResource(beers.get(1).imadeId);
        answerTextView3.setText(beers.get(2).getName());
        beerImageView3.setImageResource(beers.get(2).imadeId);

    }
    public void salto(View v){
        a++;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(a % 2 == 0) {
                    timer.cancel();
                }
                beerImageView1.setRotation((int) (Math.random() * 360));
                beerImageView2.setRotation((int) (Math.random() * 360));
                beerImageView3.setRotation((int) (Math.random() * 360));
            }
        }, 0, 100);

    }
}