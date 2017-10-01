package com.zaptrapp.nishanth.testingexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public static boolean isUserAvailable(String username) {
        if (username.equals("Nishanth")) {
            return true;
        } else {
            return false;
        }
    }

    public void initView() {
        textView = (TextView) findViewById(R.id.textView);
    }

    public String getHelloWorldString(){
        return "HELLO WORLD";
    }


    public static Intent createQuery(Context context,String query, String value){
        Intent i = new Intent(context,MainActivity.class);
        i.putExtra("QUERY", query);
        i.putExtra("VALUE",value);
        return i;
    }
}
