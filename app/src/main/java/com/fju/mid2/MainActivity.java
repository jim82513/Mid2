package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int FUNC =1;
    private static final int FUNC2 =2;
    private static final int FUNC3 =3;
    private static final int FUNC4 =4;
    private static final int FUNC5 =5;
    private static final int FUNC6 =6;
    private static final int FUNC7 =7;
    private static final int FUNC8 =8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void func1(View view){
        Intent intent = new Intent(this,Func1Activity.class);
        startActivityForResult(intent,FUNC);
    }

    public void func2(View view){
        Intent intent = new Intent(this,Func2Activity.class);
        startActivityForResult(intent,FUNC2);
    }

    public void func3(View view){                //7878978978979
        Intent intent = new Intent(this,Func3Activity.class);
        startActivityForResult(intent,FUNC3);
    }

    public void func4(View view){
        Intent intent = new Intent(this,Func4Activity.class);
        startActivityForResult(intent,FUNC4);
    }

    public void func5(View view){
        Intent intent = new Intent(this,Func5Activity.class);
        startActivityForResult(intent,FUNC5);
    }

    public void func6(View view){
        Intent intent = new Intent(this,Func6Activity.class);
        startActivityForResult(intent,FUNC6);
    }

    public void func7(View view){  //89789789789789789789789
        Intent intent = new Intent(this,Func7Activity.class);
        startActivityForResult(intent,FUNC7);
    }

    public void func8(View view){   //77897897897897897
        Intent intent = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,FUNC8);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == FUNC3){
            if(resultCode==1){
                Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
            }
        }

        if(requestCode == FUNC7){
            if(resultCode==2){
                Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
            }
        }

        if(requestCode == FUNC8){
            if(resultCode==3){
                Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
            }
        }


    }
}
