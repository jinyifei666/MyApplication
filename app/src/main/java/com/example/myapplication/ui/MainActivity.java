package com.example.myapplication.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private Button button;
    private Button button2;
    private EditText editText;

    private String text1=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
     //  setListener();
    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1=editText.getText().toString().trim();
                if (text1.isEmpty()){
                    Toast.makeText(MainActivity.this,"null",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,text1,Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void initView() {
        textView=(TextView)findViewById(R.id.text1);
        button=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        editText=(EditText)findViewById(R.id.editText);
        textView.setText("你好");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text1:
                //daima
                break;
            case R.id.button2:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle=new Bundle();
                bundle.putString("key","value");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.button1:
                Log.w("button",String.valueOf(R.id.text1));
                text1=editText.getText().toString().trim();
                if (text1.isEmpty()){
                    Toast.makeText(MainActivity.this,"null",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,text1,Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }

    }

//    public void onClick1(){
//        Log.w("click","hahh");
//    }


}
