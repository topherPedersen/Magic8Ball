package xyz.personalhomepage.magic8ball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

public class AnswerActivity extends AppCompatActivity {

    // create an array of 20 magic 8 ball answers
    String[] answerArray = new String[] {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes, definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        /**
         * NOTE: This activity receives the question that the users asks from MainActivity.
         * However, we don't really need to do this as the question does not affect
         * which answer is randomly generated for the user. I kept this useless code
         * in the app for future reference only, as this app was created for purely for
         * educational purposes.
         */
        // BEGIN USELESS CODE --------------------------------------------------------------
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // END USELESS CODE ----------------------------------------------------------------

        // Generate a random number:
        // This number will be used as an array index to decide
        // which random answer is shown to the user.
        Random rand = new Random();
        int randomInt = rand.nextInt(20) + 1; // generate a random number between 1 and 20
        randomInt--; // We want a random number between 0 and 19, not 1 and 20, so subtract 1

        // Select TextView and display the randomly generated answer to the user.
        TextView answerTextView = (TextView) findViewById(R.id.answerTextView); // select TextView
        answerTextView.setText(answerArray[randomInt]); // display answer
    }
}
