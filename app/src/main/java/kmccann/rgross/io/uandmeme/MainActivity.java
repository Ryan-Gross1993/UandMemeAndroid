package kmccann.rgross.io.uandmeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText account;
    private EditText password;
    private Button createAccountButton;




    void createUser(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccountButton = (Button) findViewById(R.id.createAccount);
        account = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = account.getText().toString();
                String password = account.getText().toString();
                createUser(email, password);
            }
        });

    }
}
