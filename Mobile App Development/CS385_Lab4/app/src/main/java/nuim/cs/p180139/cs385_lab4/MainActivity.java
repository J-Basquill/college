package nuim.cs.p180139.cs385_lab4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{
    SharedPreferences myPrefs; //declare an object of Shared Preferences
    EditText defName;   //declare a refernece to an EditText view
    Button defBtn;      //declare a reference to a Button view
    public static final String MyPREFERENCES = "myFile";    //declare a String

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defName = (EditText)findViewById(R.id.editText);    //associates defName with EditText with id 'editText'
        defBtn = (Button)findViewById(R.id.button);         //associates defBtn with Button with id 'button'
        myPrefs = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        defBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String lname = defName.getText().toString();
                SharedPreferences.Editor editor = myPrefs.edit();
                editor.putString("nameKey", lname);
                editor.commit();

                startActivity(intent);
            }
        });


    }
}
