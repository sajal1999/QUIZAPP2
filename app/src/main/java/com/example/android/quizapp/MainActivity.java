package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxA =(CheckBox) findViewById(R.id.question2_choice1_text_view);
        checkBoxB =(CheckBox) findViewById(R.id.question2_choice2_text_view);
        checkBoxC =(CheckBox) findViewById(R.id.question2_choice3_text_view);
        checkBoxD =(CheckBox) findViewById(R.id.question2_choice4_text_view);
    }

    int firstScore ;
    int secondScore ;
    int thirdScore ;
    int fourthScore ;
    int fifthScore;
    int sixthScore ;
    int seventhScore ;
    int eighthScore;
    int finalScore ;
    CheckBox checkBoxA,checkBoxB,checkBoxC,checkBoxD;

    //------------------------------------------------------------------------------------------

    // Question 1 - Correct Answer is "Petra"

    //------------------------------------------------------------------------------------------

    public void radioBoxClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question1_choice4_text_view:
                if (checked)
                    firstScore = 0;
                break;
            case R.id.question1_choice1_text_view:
                if (checked)
                    firstScore = 0;
                break;
            case R.id.question1_choice2_text_view:
                if (checked)
                    firstScore = 1;
                break;
            case R.id.question1_choice3_text_view:
                if (checked)
                    firstScore = 0;
                break;
        }
    }
    //------------------------------------------------------------------------------------------

    // Question 2 - Correct Answer is "Great wall of China and Taj Mahal"

    //------------------------------------------------------------------------------------------


    public void checkBoxClicked(View view) {
        // Is the view now checked?
        if (!checkBoxA.isChecked() &&checkBoxB.isChecked() && checkBoxC.isChecked() &&!checkBoxD.isChecked() )
            secondScore = 1;
        else if (checkBoxA.isChecked()&&checkBoxB.isChecked())
            secondScore=0;
        else if (checkBoxD.isChecked()&&checkBoxC.isChecked())
            secondScore=0;
        else if (checkBoxD.isChecked()&&checkBoxB.isChecked())
            secondScore=0;
        else if (checkBoxA.isChecked()&&checkBoxC.isChecked())
            secondScore=0;
        else if (checkBoxB.isChecked())
            secondScore=0;
        else if (checkBoxC.isChecked())
            secondScore=0;
        else
        secondScore=0;
    }

    //---------------------------------------------------------------------------------------

    // Question 3 - Correct Answer is "Gold"

    //------------------------------------------------------------------------------------------

    public void radioBoxClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question3_choice4_text_view:
                if (checked)
                    thirdScore =   0;
                break;
            case R.id.question3_choice1_text_view:
                if (checked)
                    thirdScore =  0;
                break;
            case R.id.question3_choice2_text_view:
                if (checked)
                    thirdScore =  0;
                break;
            case R.id.question3_choice3_text_view:
                if (checked)
                    thirdScore =  1;
                break;
        }
    }
    //------------------------------------------------------------------------------------------

    // Question 4 - Correct Answer is "Wife"

    //------------------------------------------------------------------------------------------

    public void radioBoxClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question4_choice1_text_view:
                if (checked)
                    fourthScore =  0;
                break;
            case R.id.question4_choice2_text_view:
                if (checked)
                    fourthScore =  0;
                break;
            case R.id.question4_choice3_text_view:
                if (checked)
                    fourthScore =  1;
                break;
            case R.id.question4_choice4_text_view:
                if (checked)
                    fourthScore =  0;
                break;
        }

    }
//------------------------------------------------------------------------------------------

    // Question 5 - Correct Answer is "The Great Pyramid of Giza"

    //------------------------------------------------------------------------------------------

    public void radioBoxClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question5_choice1_text_view:
                if (checked)
                    fifthScore = 1;
                break;
            case R.id.question5_choice2_text_view:
                if (checked)
                    fifthScore =  0;
                break;
            case R.id.question5_choice3_text_view:
                if (checked)
                    fifthScore =  0;
                break;
            case R.id.question5_choice4_text_view:
                if (checked)
                    fifthScore =  0;
                break;
        }
    }
//------------------------------------------------------------------------------------------

    // Question 6 - Correct Answer is "Tomb"

    //------------------------------------------------------------------------------------------
    public void radioBoxClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question6_choice1_text_view:
                if (checked)
                    sixthScore =  1;
                break;
            case R.id.question6_choice2_text_view:
                if (checked)
                    sixthScore =  0;
                break;
            case R.id.question6_choice3_text_view:
                if (checked)
                    sixthScore =  0;
                break;
            case R.id.question6_choice4_text_view:
                if (checked)
                    sixthScore =  0;
                break;
        }
    }
//------------------------------------------------------------------------------------------

    // Question 7 - Correct Answer is "Yes"

    //------------------------------------------------------------------------------------------
    public void radioBoxClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question7_choice1_text_view:
                if (checked)
                    seventhScore = 1;
                break;
            case R.id.question7_choice2_text_view:
                if (checked)
                    seventhScore = 0;
                break;
        }
    }

    String name;
//------------------------------------------------------------------------------------------

    // Question 8 - Correct Answer is "alphabet"

    //------------------------------------------------------------------------------------------

    public void submitAnswers(View view) {
        EditText text1 = (EditText) this.findViewById(R.id.question8_answer_text_view);
        name = text1.getText().toString().toLowerCase().trim();
        if (name.equals("taj mahal")) {
            eighthScore =  1;
        } else{
            eighthScore =  0;
        }
        finalScore = firstScore + secondScore + thirdScore + fourthScore + fifthScore + sixthScore + seventhScore+eighthScore;
        Context context = getApplicationContext();
        CharSequence text = "Your Score : " + finalScore+ " Out of "+8;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void reset(View view) {
        finalScore = 0;
        Context context = getApplicationContext();
        String text = "Your Score : " + finalScore + " Out of "+8;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

