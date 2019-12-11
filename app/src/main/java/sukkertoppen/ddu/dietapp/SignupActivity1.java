package sukkertoppen.ddu.dietapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

public class SignupActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);
        EditText emailaddress = (EditText)findViewById(R.id.emailSignUp);
        EditText username = (EditText)findViewById(R.id.usernameSignUp);
        EditText password = (EditText)findViewById(R.id.passwordSignUp);
        EditText passwordConfirm = (EditText)findViewById(R.id.passwordSignUpConfirm);
        /*
        Button endSignupBtn = (Button)findViewById(R.id.endSignUpBtn);
        endSignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

         */
    }
}
/*
private String formatDataAsJson(String emailaddress, String username, String password, String passwordConfirm) {
    final JSONObject root = new JSONObject();
    try {
        root.put("emailaddres", emailaddress);
    }
}
*/