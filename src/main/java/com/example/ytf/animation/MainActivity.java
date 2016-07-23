package com.example.ytf.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.bt_scale)
    Button btScale;
    @Bind(R.id.bt_alpha)
    Button btAlpha;
    @Bind(R.id.bt_translate)
    Button btTranslate;
    @Bind(R.id.bt_rotate)
    Button btRotate;
    @Bind(R.id.text)
    TextView textView;

    Animation animation_scale_xml,animation_scale_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // TODO: 16/7/21 初始化动画 
        init();

        // TODO: 16/7/21 点击按钮后使textview加载动画
        onclick();
        

    }

    public void init(){
        animation_scale_xml = AnimationUtils.loadAnimation(this,R.anim.scaleanim);
        animation_scale_code=new ScaleAnimation(2.0f,1.0f,2.0f,1.0f,ScaleAnimation.RELATIVE_TO_SELF,1f,ScaleAnimation.RELATIVE_TO_SELF,1f);
        animation_scale_code.setDuration(2000);
    }

    public void onclick(){

        btScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView.startAnimation(animation_scale_xml);
                textView.startAnimation(animation_scale_code);
            }
        });



    }

}
