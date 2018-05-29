package a17186285.mu.cs.cs385_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etForename;
    EditText etSurname;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etForename = (EditText) findViewById(R.id.editText2);
        etSurname = (EditText)findViewById(R.id.editText3);
        btnSubmit = (Button)findViewById(R.id.button);

        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("forename", etForename.getText().toString());
        intent.putExtra("surname", etSurname.getText().toString());
        startActivity(intent);
    }
}
