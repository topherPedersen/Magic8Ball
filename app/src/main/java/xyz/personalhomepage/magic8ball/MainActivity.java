package xyz.personalhomepage.magic8ball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "xyz.personalhomepage.magic8ball.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user presses the "Submit" button
    public void askQuestion(View view) {
        // do stuff
        Intent intent = new Intent(this, AnswerActivity.class);
        EditText questionEditText = (EditText) findViewById(R.id.questionEditText);
        String message = questionEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
