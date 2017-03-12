package com.example.sami.lowbatterysms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] arr = { "Paries,France", "PA,United States","Parana,Brazil",
            "Padua,Italy", "Pasadena,CA,United States"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autocomplete = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView1);
        MultiAutoCompleteTextView multiAutoComplete = (MultiAutoCompleteTextView)
                findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_expandable_list_item_1, arr);

        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapter);

        multiAutoComplete.setThreshold(1);
        multiAutoComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoComplete.setAdapter(adapter);
    }
}
