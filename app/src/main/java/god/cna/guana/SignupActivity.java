package god.cna.guana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class SignupActivity extends AppCompatActivity {
    TextInputEditText inputEmail, inputPw, inputCoPw;
    MaterialButton btnCreate;
    TextView txtLogin;

    private UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_signup);
        initViews();
        userManager = new UserManager(this);

        if (userManager.getEmail() != null) {
            inputEmail.setText(userManager.getEmail());

        }

        if (userManager.getPassword() != null) {
            inputPw.setText(userManager.getPassword());

        }

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtEmail, txtPw, txtCoPw;
                txtEmail = inputEmail.getText().toString();
                txtPw = inputPw.getText().toString();
                txtCoPw = inputCoPw.getText().toString();

                if (txtEmail.equals("")) {
                    inputEmail.setError("Enter valid email.");
                } else if (txtPw.equals("")) {
                    inputPw.setError("Password required.");
                } else if (txtCoPw.equals("")) {
                    inputCoPw.setError("Confirm your password.");
                } else {
                    userManager.saveUserInformation(txtEmail, txtPw);
                    startActivity(new Intent(SignupActivity.this, ProductActivity.class));
                    finish();
                }

            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                finish();
            }
        });
    }

    private void initViews() {
        inputEmail = findViewById(R.id.input_email_signup);
        inputPw = findViewById(R.id.input_pw_signup);
        inputCoPw = findViewById(R.id.input_co_pw);
        btnCreate = findViewById(R.id.btn_signup_login);
        txtLogin = findViewById(R.id.txt_login);
    }
}