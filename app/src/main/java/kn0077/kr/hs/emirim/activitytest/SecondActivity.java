package kn0077.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button butSecond;
    String name,tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        butSecond=(Button)findViewById(R.id.but_second);
        butSecond.setOnClickListener(buthandler);

        Intent intent=getIntent();//SecondActivity를 실행시킨 인턴트 객체를 다시 클래스 안에서 받을 수 있다.
        name=intent.getStringExtra("name");
        tel=intent.getStringExtra("tel");

        TextView textresult=(TextView)findViewById(R.id.text_result);
        textresult.setText("* 성명 : "+name+"\n * 전화번호 : "+tel);

    }
    View.OnClickListener buthandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    } ;
}
