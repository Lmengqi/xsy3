package com.example.lmq.xsy3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.btn);
           button.setOnClickListener(new View.OnClickListener() {
            @Override       public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("name","卢梦琪");
                        intent.putExtra("age",20);
                startActivityForResult(intent,0);
        }
        });

        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
        }
    }

}
