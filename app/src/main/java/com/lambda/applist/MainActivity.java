package com.lambda.applist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {





    EditText searchTextView;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchTextView = findViewById(R.id.search_text);
        resultView = findViewById(R.id.result_view);

        findViewById(R.id.search_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // search for drug by brand name
                String                   searchText = searchTextView.getText().toString();


                ArrayList<AppListing> result     =AppDataRepository.getByPartialBrandName(searchText);

//                ArrayList<AppListing> result     = AppRepository.getByPartialBrandName(searchText);
//                resultView.setText(result != null ? result.toString() : "No Data Found");
                for(AppListing apl: result) {
                    resultView.append(apl.toString() + "\n\n");
                }
            }
        });
    }
}
