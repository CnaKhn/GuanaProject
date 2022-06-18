package god.cna.guana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    MaterialButton btnSignin;
    TextInputEditText inputEmailSignin;
    TextInputEditText inputPwSignin;
    String txtEmail, txtPw;
    TextView txtCreate;

    private UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_login);

        btnSignin = findViewById(R.id.btn_signin_login);
        inputEmailSignin = findViewById(R.id.input_email_login);
        inputPwSignin = findViewById(R.id.input_pw_login);
        txtCreate = findViewById(R.id.txt_create_account);
        userManager = new UserManager(this);

        if (userManager.getEmail() != null) {
            inputEmailSignin.setText(userManager.getEmail());
        }

        if (userManager.getPassword() != null) {
            inputPwSignin.setText(userManager.getPassword());
        }

        txtCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
                finish();
            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtEmail = inputEmailSignin.getText().toString();
                txtPw = inputPwSignin.getText().toString();

                if (txtEmail.equals("")) {
                    inputEmailSignin.setError("Enter email.");
                } else if (txtPw.equals("")) {
                    inputPwSignin.setError("Enter your password.");
                } else {
                    userManager.saveUserInformation(txtEmail, txtPw);
                    startActivity(new Intent(LoginActivity.this, ProductActivity.class));
                    finish();
                }

            }
        });
    }

}