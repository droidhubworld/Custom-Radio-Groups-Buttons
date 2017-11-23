package com.inventivestack.customradiogroupsbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // Checked change Listener for RadioGroup 1
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
               RadioButton radioButton = (RadioButton) findViewById(selectedId);

                switch (checkedId) {
                    case R.id.rb30Sec:
                        Toast.makeText(getApplicationContext(),  radioButton.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb60Sec:
                        Toast.makeText(getApplicationContext(),  radioButton.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb90Sec:
                        Toast.makeText(getApplicationContext(),  radioButton.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb120Sec:
                        Toast.makeText(getApplicationContext(),  radioButton.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });


    }
}
