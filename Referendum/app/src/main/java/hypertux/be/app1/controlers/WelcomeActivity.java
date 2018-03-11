package hypertux.be.app1.controlers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import hypertux.be.app1.R;

public class WelcomeActivity extends AppCompatActivity {

    private ImageView mLogoImageView;
    private TextView mCodeItsmeTextView;
    private EditText mCodeItsmeEditText;
    private ImageButton mConnectImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
