package com.example.hceapplicationdemo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.hceapplicationdemo.HostCardEmulatorService.Companion.STATUS_SUCCESS


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById(R.id.saveButton) as Button;
        var editText = findViewById(R.id.editText) as EditText;
        button.setOnClickListener {
            STATUS_SUCCESS = editText.text.toString();

        }
    }
}
