package my.application.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvMain = (ListView) findViewById(R.id.lv);
        final TextView txt = (TextView) findViewById(R.id.txt);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.day_of_weeks,
                android.R.layout.simple_list_item_1);
        lvMain.setAdapter(adapter);

        


    }
}