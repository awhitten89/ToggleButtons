package togglebuttons.alan.com.togglebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView hideAndSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideAndSeek = (TextView) findViewById(R.id.text_title);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonId);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    hideAndSeek.setVisibility(View.VISIBLE);
                } else {
                    hideAndSeek.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
