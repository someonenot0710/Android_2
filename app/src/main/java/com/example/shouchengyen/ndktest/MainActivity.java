package com.example.shouchengyen.ndktest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    EditText text1;
    Button but1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        tv = (TextView) findViewById(R.id.sample_text);
        but1 = (Button) findViewById(R.id.but);
        text1 = (EditText) findViewById(R.id.text1);
       // tv.setText(stringFromJNI());
    }

    public void input_string(View view){
        String input_name = text1.getText().toString();
        tv.setText(stringFromJNI(input_name));
        text1.setText("");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI(String s);
}
