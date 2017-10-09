package imanurft.inf.prak.pert4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
//ini program imanurft
public class MainActivity extends AppCompatActivity {

    TextView teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks = (TextView) findViewById(R.id.teks);
    }
}
