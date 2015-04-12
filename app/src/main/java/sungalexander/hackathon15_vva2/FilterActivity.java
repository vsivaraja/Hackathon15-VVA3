package sungalexander.hackathon15_vva2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class FilterActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        Button Back=(Button)findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(nextScreen);
            }
        });

        Spinner catagory=(Spinner)findViewById((R.id.catagory));
        ArrayAdapter<CharSequence> cat_adapter=ArrayAdapter.createFromResource(this, R.array.catagory_array, android.R.layout.simple_spinner_item);
        cat_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        catagory.setAdapter(cat_adapter);

        Spinner Sort=(Spinner)findViewById((R.id.Sort));
        ArrayAdapter<CharSequence> sort_adapter=ArrayAdapter.createFromResource(this, R.array.Sort_array, android.R.layout.simple_spinner_item);
        sort_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sort.setAdapter(sort_adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_filter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
