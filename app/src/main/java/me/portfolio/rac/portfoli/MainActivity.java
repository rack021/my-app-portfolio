package me.portfolio.rac.portfoli;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.ripple_btn).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch My Capstone App!";
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "sdsd";
        int duration = Toast.LENGTH_SHORT;
        switch (v.getId()){
            case R.id.spotify_launch_btn :
                text = "This button will launch My Media Streamer App!";
                break;
            case R.id.score_launch_btn :
                text = "This button will launch My Football Scores App!";
                break;
            case R.id.library_launch_btn :
                text = "This button will launch My Library App!";
                break;
            case R.id.xyz_launch_btn :
                text = "This button will launch My Reader App!";
                break;
            case R.id.buid_launch_btn :
                text = "This button will launch My Gradle Project App!";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
