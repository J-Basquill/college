package nuim.cs.p180139.cs385_lab4;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView myTextView;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "myFile";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myTextView = (TextView)findViewById(R.id.textView);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String viewName = sharedpreferences.getString("nameKey", null);
        myTextView.setText(viewName);
    }
}
