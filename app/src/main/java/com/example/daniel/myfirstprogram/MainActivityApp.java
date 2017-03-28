package com.example.daniel.myfirstprogram;

/**
 * Created by daniel on 27.03.2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivityApp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        Button button = (Button) findViewById(R.id.button1);
        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);



        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 1");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 2");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk 3");
            }
        });

        Button button3 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.editText);
                EditText edit1 = (EditText) findViewById(R.id.editText2);
                String edit2 =  edit.getText()  +" "+  edit1.getText();
                TextView textView1 = (TextView) findViewById(R.id.textView1);
                textView1.setText(edit2);

            }
        });

    }

}
