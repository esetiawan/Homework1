package edu.stts.week3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvinfo=findViewById(R.id.textView);
        if (getIntent()!= null) { //memastikan ada pemanggil
            Intent pemanggil = getIntent(); //mendapatkan pemanggil HomeActivity
            tvinfo.setText("Welcome :" +
                    pemanggil.getStringExtra("username"));
        }
        else {
            //arahkan untuk Login
            Intent i =
                    new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
