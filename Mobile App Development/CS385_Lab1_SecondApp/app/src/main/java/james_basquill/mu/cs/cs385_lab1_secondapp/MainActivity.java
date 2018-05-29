package james_basquill.mu.cs.cs385_lab1_secondapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s1 = "Toast Long";
    String s2 = "Toast Short";
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("Hello");
        myTextView.setBackgroundColor(Color.CYAN);

        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
        Toast.makeText(this, s2, Toast.LENGTH_SHORT).show();
    }
}
