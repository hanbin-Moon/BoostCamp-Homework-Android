package searchmovie.test.com.boostcampandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.widget.Button;
import android.widget.EditText;
import org.apache.http.client.HttpClient;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edittext;

    private HttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
