package kn0077.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button butmain;
    EditText editName,editTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butmain=(Button)findViewById(R.id.but_main);
        editName=(EditText) findViewById(R.id.edit_name);
        editTel=(EditText) findViewById(R.id.edit_tel);
        butmain.setOnClickListener(butMainHandler);
    }

    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
            String name=editName.getText().toString();
            String tel=editTel.getText().toString();
            intent.putExtra("name",name);//첫번째는 값의 이름이며, 두번째는 실제 값의 내용이다. 즉 변수 개념으로 생각하면 된다.
            intent.putExtra("tel",tel);
            startActivity(intent);
        }
    };
}
/*

Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

getApplicationContext(); 는 현재 표시되어있는 액티비티(화면) 클래스를 반환하는 메소드이다.
그래서 즉 지금 화면에 표시가 될 MainActivity를 참조해 반환하겠다는 말과 똑같다. 즉슨 MainActivity.this 라고 표현할 수 있다.
그러나 getApplicationContext(); != MainActivity.this 이다.

getApplicationContext();를 인자값으로 보내주는 것은 현재 액티비티 위에 덮어씌우듯 다른 액티비티를 쌓아가는 방식이기 때문에 이것을 위해서 인자값으로 넣어주어야한다.

왜 MainActivity가 아니라 MainActivity.this로 표현해주냐면, MainActivity는 순전히 클래스명이며, 클래스명은 new를 써서 사용자 지정 변수를 지정할 때만 쓰기 때문이다.

 */