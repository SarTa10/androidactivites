package ge.msda.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lastnameActivity extends AppCompatActivity {

    private String name = "";


    private EditText lastNameview;
    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastname);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            this.name = extras.getString("NAME", "");
        }

        lastNameview = findViewById(R.id.editTextLastName);
        finish = findViewById(R.id.buttonFinish);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lastName = lastNameview.getText().toString();

                Intent intent = new Intent(lastnameActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("lastName", lastName);
                startActivity(intent);

                finish();

            }
        });

    }

}