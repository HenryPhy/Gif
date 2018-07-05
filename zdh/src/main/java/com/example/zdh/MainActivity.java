package com.example.zdh;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private AnimationDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.drawable.myf);
        drawable = (AnimationDrawable)iv.getDrawable();

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                if (!drawable.isRunning()){
                    drawable.start();
                }
                break;
            case R.id.btn_stop:
            if (drawable.isRunning()){
                drawable.stop();
            }
            break;
        }
    }
}