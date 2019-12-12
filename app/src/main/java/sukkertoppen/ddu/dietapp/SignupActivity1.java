package sukkertoppen.ddu.dietapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

public class SignupActivity1 extends AppCompatActivity {

    private ViewPager mPager;
    private int[] layouts = {R.layout.first_slide, R.layout.second_slide, R.layout.third_slide};
    private MpagerAdapter mpagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        mPager = findViewById(R.id.viewPager);
        mpagerAdapter = new MpagerAdapter(layouts, this);
        mPager.setAdapter(mpagerAdapter);
        /*
        EditText emailaddress = (EditText)findViewById(R.id.emailSignUp);
        EditText username = (EditText)findViewById(R.id.usernameSignUp);
        EditText password = (EditText)findViewById(R.id.passwordSignUp);
        EditText passwordConfirm = (EditText)findViewById(R.id.passwordSignUpConfirm);

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