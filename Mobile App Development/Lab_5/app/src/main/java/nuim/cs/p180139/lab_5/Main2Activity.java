package nuim.cs.p180139.lab_5;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv_Score;
    SharedPreferences sp2;
    public static final String mySP = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_Score.findViewById(R.id.tv_score_dis);
        sp2 = getSharedPreferences(mySP, Context.MODE_PRIVATE);
        int myScore = sp2.getInt("score", -2);
        tv_Score.setText(""+myScore);
    }
}
