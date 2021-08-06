package com.example.nightoftears;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Story progression = new Story();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            EditText inputBox = findViewById(R.id.inputBox);
            String input = inputBox.getText().toString();

            TextView storyBox = findViewById(R.id.storyBox);

            Story title = new Story();
            String titleString = title.nextEvent(input);

            storyBox.setText(titleString);

    }

    public void onClick(View v) {

        EditText inputbox = findViewById(R.id.inputBox);
        String input = inputbox.getText().toString();

        TextView storyBox = findViewById(R.id.storyBox);

        String progress = progression.nextEvent(input);

        storyBox.setText(progress);


    }

}
