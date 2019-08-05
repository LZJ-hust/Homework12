package com.example.lzj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtvText,mtvshow;
    private Button mbtncancel,mbtn0,mbtn1,mbtn2,mbtn3,mbtn4,mbtn5,mbtn6,mbtn7,mbtn8,mbtn9,mbtnadd,mbtnmul,mbtnsub,mbtndiv,mbtndopt,mbtnequ;
    double result = 0;
    double num1=0,num2=0;
    String save;
    int flag=0,flag2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvText = findViewById(R.id.tv_message);
        mtvshow = findViewById(R.id.tv_show);
        mbtncancel = findViewById(R.id.btn_cancel);
        mbtn0 = findViewById(R.id.btn_0);
        mbtn1 = findViewById(R.id.btn_1);
        mbtn2 = findViewById(R.id.btn_2);
        mbtn3 = findViewById(R.id.btn_3);
        mbtn4 = findViewById(R.id.btn_4);
        mbtn5 = findViewById(R.id.btn_5);
        mbtn6 = findViewById(R.id.btn_6);
        mbtn7 = findViewById(R.id.btn_7);
        mbtn8 = findViewById(R.id.btn_8);
        mbtn9 = findViewById(R.id.btn_9);
        mbtnadd = findViewById(R.id.btn_add);
        mbtnmul = findViewById(R.id.btn_mul);
        mbtnsub = findViewById(R.id.btn_sub);
        mbtndiv = findViewById(R.id.btn_div);
        mbtndopt = findViewById(R.id.btn_dopt);
        mbtnequ = findViewById(R.id.btn_equ);

        mbtncancel.setOnClickListener(new OnClick());
        mbtn0.setOnClickListener(new OnClick());
        mbtn1.setOnClickListener(new OnClick());
        mbtn2.setOnClickListener(new OnClick());
        mbtn3.setOnClickListener(new OnClick());
        mbtn4.setOnClickListener(new OnClick());
        mbtn5.setOnClickListener(new OnClick());
        mbtn6.setOnClickListener(new OnClick());
        mbtn7.setOnClickListener(new OnClick());
        mbtn8.setOnClickListener(new OnClick());
        mbtn9.setOnClickListener(new OnClick());
        mbtnadd.setOnClickListener(new OnClick());
        mbtnsub.setOnClickListener(new OnClick());
        mbtnmul.setOnClickListener(new OnClick());
        mbtndiv.setOnClickListener(new OnClick());
        mbtnequ.setOnClickListener(new OnClick());
        mbtndopt.setOnClickListener(new OnClick());

    }

    class OnClick implements View.OnClickListener{
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_cancel:
                    mtvText.setText(null);
                    mtvshow.setText(null);
                    flag2=0;
                    break;

                case R.id.btn_0:
                    String str0=mtvText.getText().toString();
                    str0+="0";
                    mtvText.setText(str0);
                    if(flag2==0){
                        mtvshow.setText(str0);
                    }else{
                        mtvshow.setText(save+str0);
                    }
                    break;

                case R.id.btn_1:
                    String str1=mtvText.getText().toString();
                    str1+="1";
                    mtvText.setText(str1);
                    if(flag2==0){
                        mtvshow.setText(str1);
                    }else{
                        mtvshow.setText(save+str1);
                    }
                    break;

                case R.id.btn_2:
                    String str2=mtvText.getText().toString();
                    str2+="2";
                    mtvText.setText(str2);
                    if(flag2==0){
                        mtvshow.setText(str2);
                    }else{
                        mtvshow.setText(save+str2);
                    }
                    break;

                case R.id.btn_3:
                    String str3=mtvText.getText().toString();
                    str3+="3";
                    mtvText.setText(str3);
                    if(flag2==0){
                        mtvshow.setText(str3);
                    }else{
                        mtvshow.setText(save+str3);
                    }
                    break;

                case R.id.btn_4:
                    String str4=mtvText.getText().toString();
                    str4+="4";
                    mtvText.setText(str4);
                    if(flag2==0){
                        mtvshow.setText(str4);
                    }else{
                        mtvshow.setText(save+str4);
                    }
                    break;

                case R.id.btn_5:
                    String str5=mtvText.getText().toString();
                    str5+="5";
                    mtvText.setText(str5);
                    if(flag2==0){
                        mtvshow.setText(str5);
                    }else{
                        mtvshow.setText(save+str5);
                    }
                    break;

                case R.id.btn_6:
                    String str6=mtvText.getText().toString();
                    str6+="6";
                    mtvText.setText(str6);
                    if(flag2==0){
                        mtvshow.setText(str6);
                    }else{
                        mtvshow.setText(save+str6);
                    }
                    break;

                case R.id.btn_7:
                    String str7=mtvText.getText().toString();
                    str7+="7";
                    mtvText.setText(str7);
                    if(flag2==0){
                        mtvshow.setText(str7);
                    }else{
                        mtvshow.setText(save+str7);
                    }
                    break;

                case R.id.btn_8:
                    String str8=mtvText.getText().toString();
                    str8+="8";
                    mtvText.setText(str8);
                    if(flag2==0){
                        mtvshow.setText(str8);
                    }else{
                        mtvshow.setText(save+str8);
                    }
                    break;

                case R.id.btn_9:
                    String str9=mtvText.getText().toString();
                    str9+="9";
                    mtvText.setText(str9);
                    if(flag2==0){
                        mtvshow.setText(str9);
                    }else{
                        mtvshow.setText(save+str9);
                    }
                    break;

                case R.id.btn_dopt:
                    String strd=mtvText.getText().toString();
                    strd+=".";
                    mtvText.setText(strd);
                    if(flag2==0){
                        mtvshow.setText(strd);
                    }else{
                        mtvshow.setText(save+strd);
                    }
                    break;

                case R.id.btn_add:
                    String stradd=mtvText.getText().toString();
                    if(stradd.equals(null)){
                        return;
                    }
                    num1=Double.valueOf(stradd);
                    mtvText.setText(null);
                    mtvshow.setText(num1+"+");
                    save=mtvshow.getText().toString();
                    flag=1;
                    flag2=1;
                    break;

                case R.id.btn_sub:
                    String strsub=mtvText.getText().toString();
                    if(strsub.equals(null)){
                        return;
                    }
                    num1=Double.valueOf(strsub);
                    mtvText.setText(null);
                    mtvshow.setText(num1+"-");
                    save=mtvshow.getText().toString();
                    flag=2;
                    flag2=1;
                    break;

                case R.id.btn_mul:
                    String strmul=mtvText.getText().toString();
                    if(strmul.equals(null)){
                        return;
                    }
                    num1=Double.valueOf(strmul);
                    mtvText.setText(null);
                    mtvshow.setText(num1+"*");
                    save=mtvshow.getText().toString();
                    flag=3;
                    flag2=1;
                    break;

                case R.id.btn_div:
                    String strdiv=mtvText.getText().toString();
                    if(strdiv.equals(null)){
                        return;
                    }
                    num1=Double.valueOf(strdiv);
                    mtvText.setText(null);
                    mtvshow.setText(num1+"/");
                    save=mtvshow.getText().toString();
                    flag=4;
                    flag2=1;
                    break;

                case R.id.btn_equ:
                    String strequ=mtvText.getText().toString();
                    num2=Double.valueOf(strequ);
                    mtvText.setText(null);
                    switch (flag){
                        case 1:
                            result=num1+num2;
                            //mtvText.setText(String.valueOf(num1)+"+"+String.valueOf(num2)+"="+String .valueOf(result));
                            mtvshow.setText(mtvshow.getText()+"="+String.valueOf(result));
                            break;

                        case 2:
                            result=num1-num2;
                            //mtvText.setText(String.valueOf(num1)+"-"+String.valueOf(num2)+"="+String .valueOf(result));
                            mtvshow.setText(mtvshow.getText()+"="+String.valueOf(result));
                            break;

                        case 3:
                            result=num1*num2;
                            //mtvText.setText(String.valueOf(num1)+"*"+String.valueOf(num2)+"="+String .valueOf(result));
                            mtvshow.setText(mtvshow.getText()+"="+String.valueOf(result));
                            break;

                        case 4:
                            if(num2==0){
                               mtvText.setText(null);
                               mtvshow.setText("除数不能为零，请重新输入");
                            }else{
                              result=num1/num2;
                                //mtvText.setText(String.valueOf(num1)+"/"+String.valueOf(num2)+"="+String .valueOf(result));
                                mtvshow.setText(mtvshow.getText()+"="+String.valueOf(result));
                            }
                            break;

                        default:
                            result=0;
                            flag2=0;
                            break;
                    }
            }
        }
    }
}
