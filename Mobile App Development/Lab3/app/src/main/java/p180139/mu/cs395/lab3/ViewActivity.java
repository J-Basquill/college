package p180139.mu.cs395.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView accountView;
    TextView passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        accountView = (TextView) findViewById(R.id.push_account);
        passwordView = (TextView) findViewById(R.id.push_password);
        Intent intent = getIntent();
        String push_account = intent.getStringExtra("account");
        String push_password = intent.getStringExtra("password");
        accountView.setText("Your name is "+push_account);
        passwordView.setText("Your password is "+push_password);
    }
}
