package a17186285.mu.cs.cs385_lab2;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvView;
    String fName;
    String lName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvView = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        fName = intent.getStringExtra("forename");
        lName = intent.getStringExtra("surname");
        tvView.setText("You're name is "+fName+" "+lName);
    }
    public void onSendUsersName(View view){


    }
}
