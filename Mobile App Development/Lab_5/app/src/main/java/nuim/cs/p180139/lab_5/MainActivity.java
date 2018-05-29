package nuim.cs.p180139.lab_5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    public static final String mySP = "MyPrefs";
    EditText score;
    Button btnAdd;
    Button btnSee;
    int oldScore;
    int newScore;
    int toAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences(mySP, Context.MODE_PRIVATE);
        score = (EditText) findViewById(R.id.et_score);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnSee = (Button) findViewById(R.id.btn_see);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sp.edit();
                toAdd = Integer.parseInt(score.getText().toString());
                newScore = (int)sp.getInt("score",-2);

                if(newScore==-2){
                    editor.putInt("score", toAdd);
                    editor.commit();
                }
                else{
                    oldScore = (int)sp.getInt("score", -2);
                    toAdd += oldScore;
                    editor.putInt("score", toAdd);
                    editor.commit();
                }
            }
        });

        btnSee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
