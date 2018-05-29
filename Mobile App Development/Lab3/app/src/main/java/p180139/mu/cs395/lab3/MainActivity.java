package p180139.mu.cs395.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etAccount;
    EditText etPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAccount = (EditText) findViewById(R.id.account_text);
        etPassword = (EditText) findViewById(R.id.password_text);
        btnSubmit = (Button) findViewById(R.id.login_button);

        btnSubmit.setOnClickListener(this);
    }

    public void gotoView(View view) {

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("account", etAccount.getText().toString());
        intent.putExtra("password", etPassword.getText().toString());
        startActivity(intent);
    }
}
