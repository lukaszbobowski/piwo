package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
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
        TextView answerTextView = findViewById(R.id.beerAnswerTextView);
        answerTextView.setText(selectedType);
    }
}