package kn0077.kr.hs.emirim.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button butSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        butSecond=(Button)findViewById(R.id.but_second);
        butSecond.setOnClickListener(buthandler);

    }
    View.OnClickListener buthandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    } ;
}
