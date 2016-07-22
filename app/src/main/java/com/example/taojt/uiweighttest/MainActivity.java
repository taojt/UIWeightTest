package com.example.taojt.uiweighttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.process_bar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击事件
//                Toast.makeText(MainActivity.this,"You clicked this button !", Toast.LENGTH_SHORT).show();
//              Toast EditText 控件中的信息
//                String message = editText.getText().toString();
//                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                // 更换imageView 的图片
//                imageView.setImageResource(R.mipmap.jelly_bean);

                // 设置进度条的可见性
//                if(progressBar.getVisibility() == View.GONE){
//                    progressBar.setVisibility(View.VISIBLE);
//                }else {
//                    progressBar.setVisibility(View.GONE);
//                }
                // 改进度条为线性进度条，并且更改进度条进度
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);



            }
        });
    }
}
