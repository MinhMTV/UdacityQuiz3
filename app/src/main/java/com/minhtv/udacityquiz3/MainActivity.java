package com.minhtv.udacityquiz3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void result(View view) {

        EditText checkName = (EditText) findViewById(R.id.name);
        String editName1 = checkName.getText().toString();
        String win = getString(R.string.congratulations, editName1);

        if (firstAnswer()) {
            addPoint(score);
        }
        if (secondAnswer()) {
            addPoint(score);
        }
        if (thirdanswer().equals(getString(R.string.appollo11))) {
            addPoint(score);
        }
        if (fourthAnswer()) {
            addPoint(score);
        }
        if (fifthAnswer()) {
            addPoint(score);
        }
        if (score == 5) {
            Toast.makeText(this, getString(R.string.score) + " " + String.valueOf(score) + "\n" + win, Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, getString(R.string.score) + " " + String.valueOf(score) + "\n" + getString(R.string.better), Toast.LENGTH_SHORT).show();

        score = 0;
    }

    public void addPoint(int point) {


        score += 1;
    }

    private String name() {
        EditText editText = findViewById(R.id.name);
        return editText.getText().toString();
    }

    private String thirdanswer() {
        EditText editText = findViewById(R.id.name_of_spaceflight);
        String answer = editText.getText().toString();
        String answer1 = answer.toUpperCase();

        return answer1;
    }

    private boolean firstAnswer() {
        boolean trueOrFalse = false;
        CheckBox checkfirstyear = findViewById(R.id.firstyear);
        CheckBox checksecondyear = findViewById(R.id.secondyear);
        CheckBox checkthirdyear = findViewById(R.id.thirdyear);
        CheckBox checklastyear = findViewById(R.id.lastyear);
        if (checksecondyear.isChecked() && checkfirstyear.isChecked()) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }

    private boolean secondAnswer() {
        boolean trueOrFalse = false;
        RadioButton radioButton = findViewById(R.id.answer_yes);
        if (radioButton.isChecked()) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }


    private boolean fourthAnswer() {
        boolean trueOrFalse = false;
        CheckBox checkFrancis = findViewById(R.id.Francis);
        CheckBox checkMarie = findViewById(R.id.Marie);
        CheckBox checkAlbert = findViewById(R.id.Albert);
        CheckBox checkJames = findViewById(R.id.James);
        if (checkFrancis.isChecked() && checkJames.isChecked()) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }

    private boolean fifthAnswer() {
        boolean trueOrFalse = false;
        RadioButton radioButton = findViewById(R.id.anime);
        if (radioButton.isChecked()) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }
}




