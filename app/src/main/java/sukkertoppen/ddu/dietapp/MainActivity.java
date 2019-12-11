package sukkertoppen.ddu.dietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = (EditText)findViewById(R.id.usernameTextEdit);
        EditText password = (EditText)findViewById(R.id.passwordTextEdit);
        Button logInBtn = (Button)findViewById(R.id.logInBtn);
        Button signUpBtn = (Button)findViewById(R.id.signUpBtn);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectLogin = new Intent(getApplicationContext(), SignupActivity1.class);
                startActivity(redirectLogin);
            }
        });

    }
}
