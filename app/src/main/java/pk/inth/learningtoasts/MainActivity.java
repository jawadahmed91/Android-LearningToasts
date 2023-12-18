package pk.inth.learningtoasts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.byDefaultToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This is by default Toast", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.singleGravityToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(MainActivity.this, "This is Single gravity Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        findViewById(R.id.nestedGravityToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(MainActivity.this, "This is Nested gravity Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                toast.show();
            }
        });

    }
}