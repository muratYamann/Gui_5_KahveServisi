package com.yamankod.gui_5_kahveservisi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button button;
    private CheckBox box1, box2;
    private RadioGroup group;
    private RadioButton radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        box1 = (CheckBox) findViewById(R.id.checkBox1);
        box2 = (CheckBox) findViewById(R.id.checkBox2);
        group = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radio1);
        radioButton2 = (RadioButton) findViewById(R.id.radio2);

        button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                String msg = " Kahve ";
                if (box1.isChecked())
                    msg += " ve Krema";
                if (box2.isChecked())
                    msg += " ve Şeker";
                int id = group.getCheckedRadioButtonId();
                if (radioButton1.getId() == id)
                    msg = "Expresso " + msg;
                if (radioButton2.getId() == id)
                    msg = "Kolombia " + msg;
                Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();

            }
        });
    }
}
