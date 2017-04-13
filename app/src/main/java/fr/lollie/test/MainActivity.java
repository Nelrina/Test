package fr.lollie.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.graphics.Color;

import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    TextView sTextview;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TodoItem item1 = new TodoItem(0, "First item", "12/04/2017", "Red");
        TodoItem item2 = new TodoItem(1, "Second item", "15/04/2017", "Blue");
        TodoItem item3 = new TodoItem(2, "Third item", "20/04/2017", "Yellow");

        TodoItem[] myItems = {item1, item2, item3};

        ArrayAdapter<TodoItem> adapter = new ArrayAdapter<TodoItem>(this, android.R.layout.simple_list_item_activated_1, myItems);

        ListView listView = (ListView) findViewById(R.id.listView_test);

        listView.setAdapter(adapter);

        sTextview = (TextView) findViewById(R.id.textView);
    }

    public void buttonPressed(View v) {
        Log.i(LOG_TAG, "buttonPressed called");

        String valeur = "Bouton presse " + i + " fois.";

        sTextview.setText(valeur);
        sTextview.setText(valeur);

        Log.v(LOG_TAG, "text changed:" + valeur + i);
        i++;

        Log.d(LOG_TAG, "finished");
    }
}