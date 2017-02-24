package com.example.timothy.timothy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText en;
    EditText ct;
    Button st;
    Button rt;
    TextView SF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        en=(EditText)findViewById(R.id.ename);
        ct=(EditText)findViewById(R.id.cont);
        st=(Button)findViewById(R.id.b1);
        rt=(Button)findViewById(R.id.b2);
        SF=(TextView)findViewById(R.id.sf);

        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                en.setText("");
                ct.setText("");

            }

        }


        );


        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SF.setText("submited");
            }
        });

    }
}
