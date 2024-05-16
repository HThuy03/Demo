package com.example.note;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String filesContent = "Nội dung trong file thuộc thư mục của ứng dụng";
        try{
            FileOutputStream fos = openFileOutput("date.txt", MODE_PRIVATE);
            fos.write(filesContent.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}