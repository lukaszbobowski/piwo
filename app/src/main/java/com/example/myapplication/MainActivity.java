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

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void beerAnswerBtnClick(View v) {
        Spinner spn = findViewById(R.id.beerTypesSpinner);
        String selectedType = spn.getSelectedItem().toString();
        //Log.d("info o piwie", selectedType);
        //Toast.makeText(this, selectedType, Toast.LENGTH_SHORT).show();
        BeerExpert bier = new BeerExpert();
        TextView answerTextView1 = findViewById(R.id.beerAnswerTextView1);
        ImageView beerImageView1 = findViewById(R.id.beerImageView1);
        ArrayList<Beer> beers = bier.getBrands(selectedType);
        answerTextView1.setText(beers.get(0).getName());
        beerImageView1.setImageResource(beers.get(0).imadeId);

    }
}