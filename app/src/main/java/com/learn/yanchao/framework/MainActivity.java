package com.learn.yanchao.framework;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView listview;
    String[] data;
    ArrayAdapter<String> adapter;
    Button special_button;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new String[10];
        listview = (ListView) findViewById(R.id.listview);
        for(int i=0;i<10;i++){
            data[i]="I'm "+i;
        }
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, data);
        listview.setAdapter(adapter);
        iv = (ImageView) findViewById(R.id.iv_state);
        special_button = (Button) findViewById(R.id.special_button);
        special_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    iv.setPressed(true);
                }else{
                    iv.setPressed(false);
                }
                return false;
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
    public void onLeftClick(View v){

    }
    public void onMiddleClick(View v){

    }
    public void onRightClick(View v) {

    }
}
