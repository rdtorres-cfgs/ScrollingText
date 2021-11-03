package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Add_Comment(View view) {
        Button but = findViewById(R.id.new_commentary);
        EditText editText = (EditText) findViewById(R.id.articleComment);
        TextView txt = (TextView) findViewById(R.id.article);
        but.setText("Send");
        editText.setVisibility(view.VISIBLE);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but.getText() == "Send") {
                    String oldText = txt.getText().toString();
                    String comment = editText.getText().toString();

                    txt.setText(oldText + "\n" + "\n" + "Comment:" + " : " + comment + "\n");
                    but.setText("Add Comment");
                    editText.setVisibility(view.INVISIBLE);
                } else {
                    editText.setVisibility(View.VISIBLE);
                    but.setText("Send");
                }
            }
        });
    }
}